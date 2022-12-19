package com.example.board.domain.dao;

import java.util.stream.IntStream;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.board.domain.vo.Criteria;
import com.example.board.domain.vo.ReplyVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class ReplyDAOTests {
	
	private Long[] arBno = {2081L, 2072L, 2071L, 2070L, 2069L};
	
	@Autowired
	private ReplyDAO replyDAO;
	
	@Test
	public void daoTest() {
		log.info("==================================");
		log.info(replyDAO);
		log.info("==================================");
	}
	
//	@Test
//	public void registerTest() {
//		//5개의 게시글에 2개씩 댓글 달기
//		IntStream.rangeClosed(11, 20).forEach(i -> {
//			ReplyVO replyVO = new ReplyVO();
//			replyVO.setBno(arBno[i % 5]);
//			replyVO.setReply("댓글 테스트" + i);
//			replyVO.setReplier("작성자" + i);
//			
//			replyDAO.register(replyVO);
//		});
//	}
	
//	@Test
//	public void findByRNO_test() {
//		log.info(replyDAO.findByRNO(26L));
//	}
	
//	@Test
//	public void removeTest() {
//		log.info(replyDAO.remove(18L));
//	}
	
//	@Test
//	public void removeAllByBNO_test() {
//		log.info("=============================");
//		log.info(replyDAO.removeAllByBNO(2071L));
//		log.info("=============================");
//	}
	
//	@Test
//	public void modifyTest() {
//		ReplyVO replyVO = replyDAO.findByRNO(23L);
//		replyVO.setReply("수정된 댓글 테스트2");
//
//		log.info("=============================");
//		log.info(replyDAO.modify(replyVO));
//		log.info("=============================");
//	}
	
	@Test
	public void findAllByBNO_test() {
		replyDAO.findAllByBNO(new Criteria(), 2081L).forEach(log::info);
	}
}






















