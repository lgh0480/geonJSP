package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;
import co.micol.prj.member.service.MemberService;
import co.micol.prj.member.serviceImpl.MemberServiceImpl;
import co.micol.prj.member.vo.MemberVO;

public class Login implements Command {

	@Override
	public String excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그인 과정을 처리하는 장소
		MemberService dao = new MemberServiceImpl();
		MemberVO vo = new MemberVO();
		HttpSession session = request.getSession(); // 서버가 가지고 있는 세션객체 호출한다.
		//System.out.println(session.getId() + "===============");
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo = dao.memberLogin(vo);
		System.out.println("로그인 중...");
		String page ="";
		//권한
		if(vo.getName() != null) { //vo.getName() != null 같은 의미야 .isEmpty()
			session.setAttribute("name", vo.getName());
			session.setAttribute("author", vo.getAuthor());
			session.setAttribute("id", vo.getId());
			page = "member/loginSuccess";
			System.out.println("로그인 성공");
		}else {
			String message ="존재하지 않는 아이디 또는 패스워드가 틀립니다.";
			request.setAttribute("message", message);
			page = "member/memberError";
			System.out.println("로그인실패..ㅠ");
		}
		return page;
	}

}
