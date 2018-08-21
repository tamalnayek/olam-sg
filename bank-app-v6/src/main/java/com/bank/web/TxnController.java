package com.bank.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bank.model.Txn;
import com.bank.service.TxnService;

@Controller
public class TxnController {

	@Autowired
	private TxnService txnService;

	@RequestMapping(value="/statement",method=RequestMethod.GET)
	public ModelAndView getTxns(@RequestParam String accNum) {
		List<Txn> txns = txnService.getTxns(accNum);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("view-statement");
		mav.addObject("allTxns", txns);
		return mav;
	}

}
