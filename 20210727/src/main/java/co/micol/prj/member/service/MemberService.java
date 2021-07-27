package co.micol.prj.member.service;

import java.util.List;

import co.micol.prj.member.vo.MemberVO;

public interface MemberService {
	List<MemberVO> memberSelectList(); //전체리스트(R)
	
	MemberVO memberSelect(MemberVO vo); // 한건 조회 (R)
	
	MemberVO memberLogin(MemberVO vo); //로그인
	
	int memberInsert(MemberVO vo); //
	
	int memberDelete(MemberVO vo); //삭제(삭제지만Update 구문을 사용할것임)
	
	int memberUpdate(MemberVO vo);
	
	
	
	
}
