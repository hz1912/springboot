package com.hz.hz.contrller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hz.hz.user.feign.ConsumerUserServer;

import feign.Request;

@Controller
public class CounsumerUserController {
	@Autowired
	private ConsumerUserServer consumerUserServer;

	@RequestMapping(value="/{id}")
	@ResponseBody
	public String getAdmin(@PathVariable("id") Integer id) {
		return consumerUserServer.getAdmin(id);
	}
	@RequestMapping(value="/admin/id")
	@ResponseBody
	public String getHello() {
		return "helllo world";
	}
	
	

}
