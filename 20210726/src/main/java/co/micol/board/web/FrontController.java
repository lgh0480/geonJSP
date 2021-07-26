package co.micol.board.web;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.micol.board.command.BoardList;
import co.micol.board.command.BoardSelect;
import co.micol.board.command.Command;
import co.micol.board.command.DeleteForm;
import co.micol.board.command.HomeCommand;
import co.micol.board.command.InsertBoard;
import co.micol.board.command.InsertForm;
import co.micol.board.command.UpdateBoard;
import co.micol.board.command.UpdateForm;

@WebServlet("*.do") //.do로 들어오면 무조껀 여기 타라.
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private HashMap<String, Command> map = new HashMap<String, Command>();
    
	
    public FrontController() {
        super();
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO 사용할 Command를 정의하면 된다.(커먼드를 생성한다는 개념)
		map.put("/home.do", new HomeCommand()); //홈 
		map.put("/boardList.do", new BoardList()); //게시판 목록 
		map.put("/boardSelect.do", new BoardSelect()); //게시글 상세보기
		map.put("/insertForm.do", new InsertForm());
		map.put("/insertBoard.do", new InsertBoard());
		map.put("/updateForm.do", new UpdateForm()); //게시글 수정
		map.put("/updateBoard.do", new UpdateBoard());
		map.put("/deleteForm.do", new DeleteForm()); //삭제
		map.put("/home.do", new HomeCommand());
	    
	} 
	
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO 실제 수행할 부분을 분석하고, 실행하고 ,리턴페이지
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String context = request.getContextPath();
		String path = uri.substring(context.length()); //실제 요청 ex) )/main.do
		
		//String path = request.getServletPath();
		
		Command command = map.get(path);
		String viewPage = command.execute(request, response);
		
		//뷰페이지
		if(!viewPage.endsWith(".do")) { //보여줄 페이지를 선택한다.
			viewPage = "WEB-INF/views/" + viewPage +".jsp";
		}
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
