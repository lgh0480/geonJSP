package co.micol.member.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.member.command.Command;
import co.micol.member.command.MainCommand;
import co.micol.member.command.MemberInsert;
import co.micol.member.command.MemberInsertForm;
import co.micol.member.command.MemberListCommand;
import co.micol.member.command.MemberSearchCommand;
import co.micol.member.command.MemberSearchForm;

//@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    //HashMap 등록 
	private HashMap<String, Command> map = new HashMap<String,Command>();
	
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		//command 객체를 여기다가 등록
		map.put("/main.do", new MainCommand()); //홈
		map.put("/memberList.do",new MemberListCommand()); //회원목록
		map.put("/memberSearch.do", new MemberSearchCommand()); //회원검색
		map.put("/memberSearchForm.do", new MemberSearchForm()); //회원검색 폼
		map.put("/memberInsertForm.do", new MemberInsertForm()); // 회원가입 폼
		map.put("/memberInsert.do", new MemberInsert()); // 회원가입
	}

	protected void service(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		// 여기가 Command 요청 분석 및 처리 , view Page 선택하는 곳
		request.setCharacterEncoding("utf-8"); //한글 깨짐 방지.
		//실제요청을 분석
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length()); //실제 요청 z.B)/main.do
	
		Command command = map.get(path); //Command command = new MainCommand(); 같아짐
		String viewPage = command.execute(request, response); //실행될 결과를 보여줄 페이지

									//endsWith가 ~~.do면 
		if(!viewPage.endsWith(".do")) { //보여줄 페이지를 선택한다.
			viewPage = "WEB-INF/views/" + viewPage +".jsp";
		}
	
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
