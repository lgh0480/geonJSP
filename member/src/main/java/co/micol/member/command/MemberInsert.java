package co.micol.member.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.member.vo.MemberVO;
import co.micol.member.web.service.MemberService;
import co.micol.member.web.serviceImpl.MemberServiceImpl;

public class MemberInsert implements Command {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		// TODO 회원가입 처리 
		MemberService dao = new MemberServiceImpl(); 
		MemberVO vo = new MemberVO();
		String[] hobbys = request.getParameterValues("hobbys");
		String hobby = "";
		for(String str :hobbys) {
			hobby += str + ",";
		}
		
		hobby = hobby.substring(0, hobby.length()-1);
		
		//vo 받고
		vo.setId(request.getParameter("id"));
		vo.setPassword(request.getParameter("password"));
		vo.setName(request.getParameter("name"));
		vo.setAge(Integer.valueOf(request.getParameter("age")));
		vo.setHobby(hobby);
		int n = dao.memeberInsert(vo);
		String view;
		if(n != 0 ) {
			view = "memberList.do";
		} else {
			request.setAttribute("message", "입력이 실패 했습니다");
			view = "member/memberInsertFail";
			//실패 했을때 실패했던 페이지로.
		}
		return view;
	}

}
