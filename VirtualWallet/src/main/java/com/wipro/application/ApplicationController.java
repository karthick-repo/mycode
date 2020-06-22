package com.wipro.application;

import java.util.ArrayList;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ApplicationController {
    
@Autowired
Dao repo;
CardsDao cardsrepo;
ApplicationController ac;

	
@RequestMapping("home")
public String home()
{
	return "home.jsp";
}

@RequestMapping("login")
public String login()
{
	return "login.jsp";
}

@RequestMapping("createcards")
public String createcards(CardDetails carddetails,Userdetails usrdtls)
{
	String userid = usrdtls.getUserid();
	String cardno = carddetails.getCardname();	
	int amount = carddetails.getAmount();
	System.out.println(usrdtls );
	System.out.println(cardno );
	System.out.println(amount );
	//cardsrepo.save(carddetails);
	return "login.jsp";
}

@RequestMapping("validate")
public ModelAndView validate(Userdetails usrdtls)
{
	ModelAndView mv = new ModelAndView();
	String userid = usrdtls.getUserid();
	String password = usrdtls.getPassword();
	
        if(repo.findById(userid).isPresent())
        {
		 ArrayList al = new ArrayList(); 
		 al.add(repo.findById(userid).get().getUserid());
		 al.add(repo.findById(userid).get().getPassword());
		 al.add(repo.findById(userid).get().getAmount());
		 al.add(repo.findById(userid).get().getCcard());
		 al.add(repo.findById(userid).get().getTcards());
		 System.out.println(al);

         mv.addObject("amount",al.get(2) );
         mv.addObject("tcards",al.get(4) );
         
         mv.setViewName("dashboard.jsp");

		 if(al.get(0).equals(userid)&&(al.get(1).equals(password)))
		 	return mv;
		 else
		 {
			 mv.setViewName("login.jsp");
			 return mv;
		 }
        }
        mv.setViewName("login.jsp");
		return mv;}
}



