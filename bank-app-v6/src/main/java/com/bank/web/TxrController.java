package com.bank.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bank.service.TxrService;

@Controller
public class TxrController {

	@Autowired
	private TxrService txrService;

	@RequestMapping(value = "/txr", method = RequestMethod.POST)
	public ModelAndView doTxr(
			@RequestParam double amount, 
			@RequestParam String fromAccNum,
			@RequestParam String toAccNum) {
		
		boolean b = txrService.txr(amount, fromAccNum, toAccNum);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("txr-status");
		mav.addObject("message", b ? "txr success" : "txr failed");
		return mav;

	}

}
