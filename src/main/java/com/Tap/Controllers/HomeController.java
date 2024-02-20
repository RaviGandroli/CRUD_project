package com.Tap.Controllers;

import java.util.ArrayList;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import com.Tap.Entity.Emp;
import com.Tap.dao.EmpDao;

@Controller
public class HomeController {
    @Autowired
	private EmpDao empDao;
    
     @RequestMapping("/home")
	public String home(Model model) {
    	
    	 List<Emp> list=empDao.getAllEmp();
    	 model.addAttribute("empList", list);
    	 
		return "home";
	}
     @RequestMapping(path="/addEmp")
     public String addEmp() {
     	
 		return "addEmp";
 	}
     @RequestMapping(path="/createEmp", method=RequestMethod.POST)
     public String createEmp(@ModelAttribute Emp emp , HttpSession session ) {
    	 System.out.println(emp);
    	int i= empDao.saveEmp(emp);
    	 session.setAttribute("msg","Register Successfully");
    	 return "redirect:/addEmp";
     }
     
     @RequestMapping(path="/edit_emp/{id}")
     public String editEmp(@PathVariable int id, Model m) {
    	 
    	Emp emp= empDao.getEmpById(id);
    	m.addAttribute("emp", emp);
    	
    	return "edit_emp";
     }
     
     @RequestMapping(path="/updateEmp", method=RequestMethod.POST)

     public String updateEmp(@ModelAttribute Emp emp, HttpSession session) {
    	 
    	 empDao.update(emp);
    	 session.setAttribute("msg", "Update Sucessfully");
    	 
    	 return "redirect:/home";
     }
     @RequestMapping(path="/deleteEmp/{id}", method=RequestMethod.GET)
     public String deleteEmp(@PathVariable int id, HttpSession session) {
    	 empDao.deleteEmp(id);
    	 session.setAttribute("msg", "Emp delete Successfully");
    	 return "redirect:/home";
     }

	
}
