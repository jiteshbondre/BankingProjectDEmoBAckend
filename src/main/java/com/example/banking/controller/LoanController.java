package com.example.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.banking.DAO.LanDao;
import com.example.banking.DAO.TransactionDao;
import com.example.banking.Models.Loan_Details;
import com.example.banking.Models.Transactions;
import com.example.banking.Models.User;
import com.example.banking.service.LoanService;


@CrossOrigin(origins = "*")
@RestController
public class LoanController {

	@Autowired
	LoanService TD;
	
	@PostMapping("/loan")
	public Loan_Details getTransaction(@RequestBody Loan_Details loan_Details)
	{    //Total Count :
		//System.out.print(multipartFile.getName());
		Loan_Details l=TD.register(loan_Details);
		return l;
	}
	
	@GetMapping("/loan/{accNo}")
	public List<Loan_Details> getTransaction(@PathVariable("accNo") Long accNO)
	{    //Total Count :
		//System.out.print(multipartFile.getName());
		
		return TD.getLoan(accNO);
	}

}
