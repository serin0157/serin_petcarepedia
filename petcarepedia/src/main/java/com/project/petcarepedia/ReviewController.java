package com.project.petcarepedia;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.NoticeDao;
import com.project.dao.ReviewDao;
import com.project.vo.NoticeVo;
import com.project.vo.ReviewVo;

@Controller
public class ReviewController {
	
	//review_main.do ���� ���� ������
	@RequestMapping(value="/review_main.do", method=RequestMethod.GET)
	public ModelAndView review_main() {
		ModelAndView model = new ModelAndView();
		ReviewDao reviewDao = new ReviewDao();
		ArrayList<ReviewVo> reviewList = reviewDao.select();
		ArrayList<ReviewVo> bestList = reviewDao.best_select3();
		
		model.addObject("bestList", bestList);
		model.addObject("reviewList", reviewList);
		model.setViewName("/review/review_main");
		
		return model;
	}
	
	//review_content.do ���� �� ������
	@RequestMapping(value="/review_content.do", method=RequestMethod.GET)
	public ModelAndView review_content(String rid) {
		ModelAndView model = new ModelAndView();
		ReviewDao reviewDao = new ReviewDao();
		ReviewVo reviewVo = reviewDao.enter_select(rid);
		
		model.addObject("reviewVo", reviewVo);
		model.setViewName("/review/review_content");
		
		return model;
	}
	
	
	
	//review_delete.do ���� ���� ������
	@RequestMapping(value="/review_delete.do", method=RequestMethod.GET)
	public ModelAndView admin_notice_delete(String rid) {
		ModelAndView model = new ModelAndView();
		model.addObject("rid", rid);
		model.setViewName("/review/review_delete");
		
		return model;
	}
	
	
	//review_delete_proc.do ������ �������� ���� ó��
	@RequestMapping(value="/review_delete_proc.do", method=RequestMethod.POST)
	public ModelAndView review_delete_proc(String rid) {
		ModelAndView model = new ModelAndView();
		ReviewDao reviewDao = new ReviewDao();
		int result = reviewDao.delete(rid);
		if(result == 1) {
			//���� �� ����� ���ư� (�ӽ�)
			model.setViewName("redirect:/review_main.do");
		}
		
		return model;
	}
	
	
	
	
	
	
	
}
