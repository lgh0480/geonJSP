package co.micol.member.web.service;

import java.util.List;

import co.micol.member.vo.MemberVO;

//서비스 구역 
public interface MemberService {
	// 기본적인 CRUD
	List<MemberVO> memberSelectList(); // 회원 전체 목록 보기(R)

	MemberVO memberSelect(MemberVO vo); // 한명의 회원을 조회(R)
	
	// 나머지는 다 인트타입이얌
	int memeberInsert(MemberVO vo); // 회원 추가 (C)

	int memeberDelete(MemberVO vo); // 회원 삭제 (D)

	int memeberUpdate(MemberVO vo); // 회원 정보변경 (U)

}
