package com.example.board.service;

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
public class ReplyServiceTests {
	
	private Long[] arBno = {2081L, 2072L, 2071L, 2070L, 2069L};
	
	@Autowired
	private ReplyService replyService;
	
	@Test
	public void serviceTest() {
		log.info("==================================");
		log.info(replyService);
		log.info("==================================");
	}
	
//	@Test
//	public void registerTest() {
//		//5개의 게시글에 2개씩 댓글 달기
//		IntStream.rangeClosed(21, 30).forEach(i -> {
//			ReplyVO replyVO = new ReplyVO();
//			replyVO.setBno(arBno[i % 5]);
//			replyVO.setReply("댓글 테스트" + i);
//			replyVO.setReplier("작성자" + i);
//			
//			replyService.register(replyVO);
//		});
//	}
	
//	@Test
//	public void findByRNO_test() {
//		log.info(replyService.findByRNO(40L));
//	}
	
//	@Test
//	public void removeTest() {
//		log.info(replyService.remove(40L));
//	}
	
//	@Test
//	public void removeAllByBNO_test() {
//		log.info("=============================");
//		log.info(replyService.removeAllByBNO(2070L));
//		log.info("=============================");
//	}
	
//	@Test
//	public void modifyTest() {
//		ReplyVO replyVO = replyService.findByRNO(39L);
//		replyVO.setReply("수정된 댓글 테스트3");
//
//		log.info("=============================");
//		log.info(replyService.modify(replyVO));
//		log.info("=============================");
//	}
	
	@Test
	public void findAllByBNO_test() {
		replyService.findAllByBNO(new Criteria(), 2081L).forEach(log::info);
	}
}
