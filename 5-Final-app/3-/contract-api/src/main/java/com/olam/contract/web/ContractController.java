package com.olam.contract.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.olam.contract.model.Contract;
import com.olam.contract.repository.ContractRepository;

@RestController
public class ContractController {

	@Autowired
	private ContractRepository contractRepository;

	@RequestMapping(value = "contract", method = RequestMethod.POST)
	public Contract create(@RequestBody Contract contract) {
		return contractRepository.createNewContact(contract);
	}

}
