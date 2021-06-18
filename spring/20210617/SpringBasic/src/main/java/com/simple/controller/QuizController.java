package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.Quiz01VO;
import com.simple.command.ReqVO;

@Controller
@RequestMapping("/quiz")
public class QuizController {
	
	//화면처리
	@RequestMapping("quiz01")
	public void quiz01() {
		
	}
	

	@RequestMapping("/sendBirth")
	public String sendBirth(Quiz01VO vo, Model model) {
	
		String result = vo.getYear() + vo.getMonth() + vo.getDay();
		System.out.println(result);

		model.addAttribute("year", vo.getYear() );
		model.addAttribute("month", vo.getMonth() );
		model.addAttribute("day", vo.getDay() );
		
		return "quiz/quiz01_ok";
	}
}
