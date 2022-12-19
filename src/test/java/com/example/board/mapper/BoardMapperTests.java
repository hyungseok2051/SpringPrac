package com.example.board.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.example.board.domain.vo.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	@Autowired
	private BoardMapper boardMapper;
	
//	@Test
//	public void getListTest() {
//		boardMapper.getList().forEach(log::info);
//	}
	
//	@Test
//	public void insertTest() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성한 글 제목5");
//		board.setContent("새로 작성한 글 내용5");
//		board.setWriter("user05");
//		
//		boardMapper.insert(board);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void readTest() {
//		BoardVO boardVO = boardMapper.read(5L);
//		log.info(boardVO);
//	}
	
//	@Test
//	public void deleteTest() {
//		Long bno = 2L;
//		BoardVO boardVO = boardMapper.read(bno);
//		if(boardVO != null) {
//			log.info("DELETE COUNT : " + boardMapper.delete(boardVO.getBno()));
//			return;
//		}
//		log.info("NO BOARD");
//	}
	
//	@Test
//	public void updateTest() {
//		BoardVO boardVO = boardMapper.read(1L);
//		if(boardVO != null) {
//			
//			boardVO.setTitle("수정된 제목");
//			boardVO.setContent("수정된 내용");
//			boardVO.setWriter("user00");
//			
//			log.info("UPDATE COUNT : " + boardMapper.update(boardVO));
//			return;
//		}
//		log.info("NO BOARD");
//	}
}












