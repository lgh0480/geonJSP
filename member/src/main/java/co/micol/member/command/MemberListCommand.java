package co.micol.member.command;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.member.vo.MemberVO;
import co.micol.member.web.service.MemberService;
import co.micol.member.web.serviceImpl.MemberServiceImpl;

public class MemberListCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 회원 전체 목록 보기
		MemberService dao = new MemberServiceImpl(); //모델을 호출한다 dao이름으로
		List<MemberVO> members = new ArrayList<MemberVO>();
		members = dao.memberSelectList(); //데이터를 가져옴
		request.setAttribute("list", members); //페이지의 값을 전달
							
		return "member/memberList";  //멤버밑에 memberList 보여줄 페이지선택 
	}

}
