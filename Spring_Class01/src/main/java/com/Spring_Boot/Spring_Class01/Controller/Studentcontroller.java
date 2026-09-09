package com.Spring_Boot.Spring_Class01.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController 
public class Studentcontroller {

    @GetMapping ("/")
    public String home(Model model){
        model.addAttribute("id" ,1);
        model.addAttribute("name" ,"Gyan");
        model.addAttribute("course" ,"BCA, B.tech");

        return "student";
	
    }

    
    // @GetMapping ("/home")
	// public String home(){
	// 	return "Home Page";
	// }
	// @GetMapping ("/about")
	// public String about(){
	// 	return "About Page";
	// }
	// @GetMapping ("/student")
	// public String student(){
	// 	return "Student Home";
	// }
	
}
