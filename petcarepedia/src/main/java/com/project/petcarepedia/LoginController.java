package com.project.petcarepedia;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.dao.MemberDao;
import com.project.vo.MemberVo;

@Controller
public class LoginController {
	/**
	 * login.do - �α���
	 */
	@RequestMapping(value="/login.do",method=RequestMethod.GET)
	public String login() {
		return "/login/login";
	}
	
	/**
	 * login_proc.do - �α��� ó��
	 */
	@RequestMapping(value="/login_proc.do",method=RequestMethod.POST)
	public ModelAndView login_proc(MemberVo memberVo) {
		ModelAndView model = new ModelAndView();
		
		MemberDao memberDao = new MemberDao();
		int result = memberDao.checkLogin(memberVo);
		
		if(result==1) {
			model.addObject("login_result", "success");
			model.setViewName("index");
		} else {
			model.addObject("login_result", "fail");
			model.setViewName("/login/login");
		}
		
		return model;
	}
	
	/**
	 * login_idfind.do - ���̵�ã��
	 */
	@RequestMapping(value="/login_idfind.do",method=RequestMethod.GET)
	public String login_idfind() {
		return "/login/login_idfind";
	}
	
	/**
	 * login_idfind_proc.do - ���̵�ã�� ó��
	 */
	@RequestMapping(value="/login_idfind_proc.do",method=RequestMethod.POST)
	public ModelAndView login_idfind_proc(MemberVo memberVo) {
		ModelAndView model = new ModelAndView();
		
		MemberDao memberDao = new MemberDao();
		String mid = memberDao.findId(memberVo);
		
		if(mid!="") {
			model.addObject("mid", mid);
			model.setViewName("/login/login_idfind_success");
		} else {
			model.setViewName("/login/login_idfind_fail");
		}
		
		return model;
	}
	
	/**
	 * login_idfind_success.do - ���̵�ã�� ����
	 * POST ������� ����
	 */
	@RequestMapping(value="/login_idfind_success.do",method=RequestMethod.POST)
	public String login_idfind_success() {
		return "/login/login_idfind_success";
	}
	
	/**
	 * login_idfind_fail.do - ���̵�ã�� ����
	 * POST ������� ����
	 */
	@RequestMapping(value="/login_idfind_fail.do",method=RequestMethod.POST)
	public String login_idfind_fail() {
		return "/login/login_idfind_fail";
	}
	
	/**
	 * login_pwfind.do - ��й�ȣ �缳�� - ���� Ȯ��
	 */
	@RequestMapping(value="/login_pwfind.do",method=RequestMethod.GET)
	public String login_pwfind() {
		return "/login/login_pwfind";
	}
	
	/**
	 * login_pwfind_proc.do - ��й�ȣ �缳�� - ���� Ȯ�� ó��
	 */
	@RequestMapping(value="/login_pwfind_proc.do",method=RequestMethod.POST)
	public ModelAndView login_pwfind_proc(MemberVo memberVo) {
		ModelAndView model = new ModelAndView();
		
		MemberDao memberDao = new MemberDao();
		String mid = memberDao.findPass(memberVo);
		
		if(mid!="") {
			model.addObject("mid", mid);
			model.setViewName("/login/login_pwupdate");
		} else {
			model.setViewName("/login/login_pwfind_fail");
		}
		
		return model;
	}
	
	/**
	 * login_pwfind_fail.do - ��й�ȣ �缳�� - ���� Ȯ�� ����
	 * POST ������� ����
	 */
	@RequestMapping(value="/login_pwfind_fail.do",method=RequestMethod.POST)
	public String login_pwfind_fail() {
		return "/login/login_pwfind_fail";
	}
	
	/**
	 * login_pwupdate.do - ��й�ȣ �缳�� - �缳��
	 */
	@RequestMapping(value="/login_pwupdate.do",method=RequestMethod.GET)
	public String login_pwupdate() {
		return "/login/login_pwupdate";
	}
	
	/**
	 * login_pwupdate_proc.do - ��й�ȣ �缳�� - �缳�� ó��
	 */
	@RequestMapping(value="/login_pwupdate_proc.do",method=RequestMethod.POST)
	public String login_pwupdate_proc(MemberVo memberVo) {
		String viewName = "";
		
		MemberDao memberDao = new MemberDao();
		int result = memberDao.updatePass(memberVo);
		
		if(result==1) {
			viewName = "/login/login_pwupdate_success";
		} else {
			//����������
		}
		
		return viewName;
	}
	
	/**
	 * login_pwupdate_success.do - ��й�ȣ �缳�� - �缳�� ����
	 */
	@RequestMapping(value="/login_pwupdate_success.do",method=RequestMethod.GET)
	public String login_pwupdate_success() {
		return "/login/login_pwupdate_success";
	}
}
