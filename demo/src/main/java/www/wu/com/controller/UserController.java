package www.wu.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import www.wu.com.service.api.UserService;

@Controller
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/{id}")
	@ResponseBody
	public Object user(@PathVariable("id") Integer id){
		System.out.println("id："+id);
		return userService.getUserById(id);
	}
}
