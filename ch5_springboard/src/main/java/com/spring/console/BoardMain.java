package com.spring.console;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.domain.BoardDTO;
import com.spring.service.BoardService;

public class BoardMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		BoardService service = (BoardService) ctx.getBean("board");
		
		//게시글 작성
//		BoardDTO dto = new BoardDTO();
//		dto.setTitle("스프링");
//		dto.setContent("스프링 게시판");
//		dto.setWriter("홍길동");
//		
//		boolean result = service.insertBoard(dto);
//		
//		System.out.println(result ? "입력성공" : "입력실패");
		
		//업데이트
//		BoardDTO dto= new BoardDTO();
//		dto.setBno(2);
//		dto.setTitle("배고프다");
//		dto.setContent("오늘 저녁은 뭘 먹을까.. 감자탕에 쏘주한잔..?");
//		boolean result = service.updateBoard(dto);
//		System.out.println(result ? "입력성공" : "입력실패");
		
		
		//삭제
//		System.out.println(service.deleteBoard(2)? "삭제성공" : "삭제 실패");
		
		System.out.println(service.getRow(1));

		List<BoardDTO> list = service.getRows();
		for(BoardDTO boardDTO : list) {
			System.out.println(boardDTO);
		}
		
	}

}
