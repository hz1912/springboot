package com.hz.hz.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hz.hz.persistence.dao.AdminDao;
import com.hz.hz.persistence.model.Admin;
import com.hz.response.Response;

@RestController
@RequestMapping("/admin")
public class AdminCotroller {
	@Autowired
	private AdminDao adminDao;

	@RequestMapping("/{id}")
	@ResponseBody
	public String getAdmin(@PathVariable("id") Integer id) {
		Map<String, Object> map = new HashMap<>();
		Admin admin = adminDao.getAdminByKey(id);
		map.put("name", admin.getName());
		return Response.withDataok(map);
	}

}
