package co.micol.member.web.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.micol.member.command.DAO;
import co.micol.member.vo.MemberVO;
import co.micol.member.web.service.MemberService;

public class MemberServiceImpl implements MemberService {
	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	
	@Override
	public List<MemberVO> memberSelectList() {
		// 전체회원 목록보기
		List<MemberVO> members = new ArrayList<MemberVO>();
		MemberVO vo;
		String sql= "select * from member";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery(); //select 구문일때
			while(rs.next()) {
				vo = new MemberVO();
				vo.setId(rs.getString("id"));
				vo.setPassword(rs.getString("password"));
				vo.setName(rs.getString("name"));
				vo.setAge(rs.getInt("age"));
				vo.setHobby(rs.getString("hobby"));
				members.add(vo);
				
			}
			
			}catch(SQLException e ) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return members;
	}

	private void close() {
		// 작업이 끝나면 커넥션 종료하기 위해
		try {
			if(rs != null) {rs.close();}
			if(psmt != null) {psmt.close();}
			if(conn != null) {conn.close();}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	//한명 조회
	public MemberVO memberSelect(MemberVO vo) {
		String sql ="select * from member where id =?";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			rs = psmt.executeQuery();
			if(rs.next()) {
				vo.setName(rs.getString("name"));
				vo.setPassword(rs.getString("password"));
				vo.setAge(rs.getInt("age"));
				vo.setHobby(rs.getString("hobby"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}finally{
			close();	
		}
	
		return vo;
	}

	@Override
	public int memeberInsert(MemberVO vo) {
		int n = 0;
		String sql = "INSERT INTO member values(?,?,?,?,?)";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			psmt.setString(2, vo.getPassword());
			psmt.setString(3, vo.getName());
			psmt.setInt(4, vo.getAge());
			psmt.setString(5, vo.getHobby());
			n = psmt.executeUpdate();
			
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	//회원 삭제
	public int memeberDelete(MemberVO vo) {
		int n = 0 ;
		String sql = "delete From member where id =?";
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getId());
			n = psmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return n;
	}

	@Override
	//회원 정보 변경
	public int memeberUpdate(MemberVO vo) {
		int n = 0;
		String sql = "update from member set password = ?, age = ?, hobby =?  where id = ?";
		
		try {
			conn = DAO.getConnection();
			psmt = conn.prepareStatement(sql);
			psmt.setString(1, vo.getPassword());
			psmt.setInt(2, vo.getAge());
			psmt.setString(3, vo.getHobby());
			psmt.setString(4, vo.getId());
			n = psmt.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}finally {
			close();
		}
		
		return n;
	}

}
