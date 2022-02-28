package com.lti.bankng.BankingProject.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.print.attribute.standard.Media;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.MediaList;

import com.lti.bankng.BankingProject.Entity.LoanUser;

@CrossOrigin(origins="*")
@RestController
public class LoanController {
	
	List<LoanUser> list= new ArrayList();
	
	@GetMapping("/get")
	public List<LoanUser> allLoanApplication()
	{
		LoanUser l=new LoanUser();
		l.setLoanTypeId("HomeLoan");
		list.add(l);
		return list;
	}
   @RequestMapping( value = "/apply",  method = RequestMethod.POST)
	public LoanUser applyLoan(@RequestBody LoanUser user )
	{
		//LoanUser l=new LoanUser();
		//l.setLoanTypeId("HomeLoan");
		list.add(user);
		return user;
	}
	
}
