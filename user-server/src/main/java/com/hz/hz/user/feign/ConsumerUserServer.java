package com.hz.hz.user.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(value = "service-hi")
public interface ConsumerUserServer {
	@RequestMapping("/{id}")
	public String getAdmin(@PathVariable("id")Integer id);
}
