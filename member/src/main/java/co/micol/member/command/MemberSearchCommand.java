package co.micol.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.member.vo.MemberVO;
import co.micol.member.web.service.MemberService;
import co.micol.member.web.serviceImpl.MemberServiceImpl;

public class MemberSearchCommand implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		//회원 한명 조회
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		vo.setId(request.getParameter("id"));
		vo = dao.memberSelect(vo);
		
		if(vo.getName() != null) {
			request.setAttribute("member", vo);	
		} else {
			request.setAttribute("message", "존재하지 않은 아이디 입니다.");
		}
			
		return "member/memberSearch";
	}

}
