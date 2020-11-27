package controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import mapper.EmailMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import entity.Email;
@org.springframework.stereotype.Controller
@RequestMapping("ssh")
public class Controller {
	
	@Autowired
	EmailMapper emailMapper;
	@RequestMapping("/testSSH")
	public String testSSH(int id,HttpServletRequest request,Map<String,Object> map){
		
		Email email=emailMapper.selectEamil(id);
		map.put("email", email);
		return "success";
	}
	
}
