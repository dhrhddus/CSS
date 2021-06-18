package com.simple.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceImpl;

@Controller
@RequestMapping("/service")
public class ScoreController {
	
	
	//硫ㅻ쾭蹂��닔
	//1st
	//private ScoreService scoreService = new ScoreServiceImpl();

	//2nd
//	@Autowired
//	@Qualifier("scoreService")
//	private ScoreService scoreService;

	//3nd
	@Autowired
	@Qualifier("scoreService")
	private ScoreService scoreService;
	
	
	
	//紐⑸줉�솕硫�(�솕硫댁쑝濡� �씠�룞�븷 �븣 list瑜� 媛�吏�怨� �굹媛꾨떎)
	@RequestMapping("/scoreList")
	public void scoreList(Model model) {
			
//		ArrayList<ScoreVO> list = scoreService.getList();
		model.addAttribute("list", scoreService.getList());
		
	}
	
	//�벑濡앺솕硫�
	@RequestMapping("/scoreRegist")
	public void scoreRegist() {
		
	}
	
	//寃곌낵�솕硫�
	@RequestMapping("/scoreResult")
	public void scoreResult() {
		
	}
	
	//�벑濡앹슂泥�
	@RequestMapping("regist")
	public String regist(ScoreVO vo) {
		
		scoreService.regist(vo);
		
		
		return "service/scoreResult";
	}

	//삭제요청
	@RequestMapping("scoreDelete")
	public String delete(@RequestParam("num") int num,
						 RedirectAttributes RA ) {
		
		scoreService.delete(num);
	
		RA.addFlashAttribute("msg", "삭제처리되었습니다");
		
		return "redirect:/service/scoreList";
	}
}
