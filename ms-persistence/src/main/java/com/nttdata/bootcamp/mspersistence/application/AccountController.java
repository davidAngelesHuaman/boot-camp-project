package com.nttdata.bootcamp.mspersistence.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.bootcamp.ms.commons.base.domain.AccountDTO;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("account")
public class AccountController {
	
	@Autowired
	AccountService accountService;
	
	@PostMapping("create")
	@ResponseStatus(HttpStatus.CREATED)
	public Mono<AccountDTO> create(@RequestBody AccountDTO accountDTO) {
		return accountService.create(accountDTO); 
	}
	
	@GetMapping("associate/{id}/{group}")
	public  Mono<AccountDTO> associate(@PathVariable String id, @PathVariable Integer group) {
		return accountService.associate(id, group); 
	}
	
	@GetMapping("cancel/{id}")
	public Mono<AccountDTO> cancel(@PathVariable String id) { 
		return accountService.cancel(id); 
	}
	 
}
