package com.springmvc.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.springmvc.users.User;
import com.springmvc.users.UserDao;

@Controller
public class UserController 
{
	@Autowired
	UserDao dao; 
	
	@RequestMapping("/regForm")
	public String showForm(Model model) 
	{
		model.addAttribute("command", new User());
		return "regForm";
	}
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
	public String save(@ModelAttribute("user")User user) 
	{
	    dao.save(user);
		return "redirect:/viewUser"; 
	}
	
	@RequestMapping("/viewUser")
	public String viewEmp(Model model) 
	{
		List<User> list = dao.getUsers();
		model.addAttribute("list", list);
		return "viewUser";
	}
	
	@RequestMapping(value = "/deleteUser/{id}")
	public String delete(@PathVariable int id) 
	{
		dao.delete(id);
		return "redirect:/viewUser";
	}
}
