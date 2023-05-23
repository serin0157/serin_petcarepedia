package com.project.petcarepedia;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.NoticeDao;
import com.project.vo.NoticeVo;

@Controller
public class NoticeController {
	
	// admin_norice.do ������ �������� ����Ʈ ������
	@RequestMapping(value="/admin_notice.do", method=RequestMethod.GET)
	public ModelAndView admin_notice() {
		ModelAndView model = new ModelAndView();
		NoticeDao noticeDao = new NoticeDao();
		ArrayList<NoticeVo> noticeList = noticeDao.select();
		
		model.addObject("noticeList", noticeList);
		model.setViewName("/admin/notice/admin_notice");
		
		return model;
	}
	
	// admin_notice_content.do ������ �������� �󼼺��� ������
	@RequestMapping(value="/admin_notice_content.do", method=RequestMethod.GET)
	public ModelAndView admin_notice_content(String nid) {
		ModelAndView model = new ModelAndView();
		NoticeDao noticeDao = new NoticeDao();
		NoticeVo noticeVo = noticeDao.u_select(nid);
		
		model.addObject("noticeVo", noticeVo);
		model.setViewName("/admin/notice/admin_notice_content");
		
		return model;
	}
	
	//admin_notice_write.do ������ �������� �ۼ� ������
	@RequestMapping(value="/admin_notice_write.do", method=RequestMethod.GET)
	public String admin_notice_write() {
		return "/admin/notice/admin_notice_write";
	}
	
	//admin_notice_write_proc.do ������ �������� �ۼ� ó��
	@RequestMapping(value="/admin_notice_write_proc.do", method=RequestMethod.POST)
	public String admin_notice_write_proc(NoticeVo noticeVo) {
		String viewName = "";
		NoticeDao noticeDao = new NoticeDao();
		int result = noticeDao.insert(noticeVo);
		if(result == 1) {
			viewName = "redirect:/admin_notice.do";
		}
		else {
			//���� ó��
		}
		return viewName;
	}
	
	
	
	//admin_notice_update.do ������ �������� ���� ������
	@RequestMapping(value="/admin_notice_update.do", method=RequestMethod.GET)
	public ModelAndView admin_notice_update(String nid) {
		ModelAndView model = new ModelAndView();
		
		NoticeDao noticeDao = new NoticeDao();
		NoticeVo noticeVo = noticeDao.select(nid);

		model.addObject("noticeVo", noticeVo);
		model.setViewName("/admin/notice/admin_notice_update");
		
		return model;
	}
	
	
	//admin_notice_update_proc.do ������ �������� ���� ó��
	@RequestMapping(value="/admin_notice_update_proc.do", method=RequestMethod.POST)
	public ModelAndView admin_notice_update_proc(NoticeVo noticeVo) {
		ModelAndView model = new ModelAndView();
		NoticeDao noticeDao = new NoticeDao();
		int result = noticeDao.update(noticeVo);
		
		if(result == 1) {
			model.setViewName("redirect:/admin_notice.do");
		}
		
		return model;
	}
	
	
	//admin_notice_delete.do ������ �������� ���� ������
	@RequestMapping(value="/admin_notice_delete.do", method=RequestMethod.GET)
	public ModelAndView admin_notice_delete(String nid) {
		ModelAndView model = new ModelAndView();
		model.addObject("nid", nid);
		model.setViewName("/admin/notice/admin_notice_delete");
		
		return model;
	}
	
	
	// admin_notice_delete_proc.do ������ �������� ���� ó��
	@RequestMapping(value="/admin_notice_delete_proc.do", method=RequestMethod.POST)
	public ModelAndView admin_notice_delete_proc(String nid) {
		ModelAndView model = new ModelAndView();
		NoticeDao noticeDao = new NoticeDao();
		int result = noticeDao.delete(nid);
		if(result == 1) {
			model.setViewName("redirect:/admin_notice.do");
		}
		
		return model;
	}
	
	
	
	
	//notice.do ����� �������� ����Ʈ
	@RequestMapping(value="/notice.do", method=RequestMethod.GET)
	public ModelAndView notice() {
		ModelAndView model = new ModelAndView();
		NoticeDao noticeDao = new NoticeDao();
		ArrayList<NoticeVo> noticeList = noticeDao.select();
		
		model.addObject("noticeList", noticeList);
		model.setViewName("/notice/notice");
		
		return model;
	}
	
	
	
	
	// notice_content.do ����� �������� �󼼺���
	@RequestMapping(value="/notice_content.do", method=RequestMethod.GET)
	public ModelAndView notice_content(String nid) {
		ModelAndView model = new ModelAndView();
		NoticeDao noticeDao = new NoticeDao();
		NoticeVo noticeVo = noticeDao.u_select(nid);
		
		if(noticeVo != null) {
			// ��ȸ�� ������Ʈ DB
			noticeDao.updateHits(nid);
		}
		model.addObject("noticeVo", noticeVo);
		model.setViewName("/notice/notice_content");
		
		return model;
	}
}
