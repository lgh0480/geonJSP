package co.micol.prj.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import co.micol.prj.common.Command;

public class Logout implements Command {

	@Override
	public String excute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 로그아웃
		HttpSession session = request.getSession();
		String message = session.getAttribute("name") + "님 정상로그 아웃 되었습니다"; 
		//session.invalidate(); //너의 세션을 삭제하는 메서드. 
		session.removeAttribute("name"); //탑재했던 했던 애들만 
		session.removeAttribute("author");
		request.setAttribute("message", message);
		return "member/memberError";
	}

}
