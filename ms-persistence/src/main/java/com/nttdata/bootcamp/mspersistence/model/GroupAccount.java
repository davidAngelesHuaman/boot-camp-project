package com.nttdata.bootcamp.mspersistence.model;
 

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class GroupAccount {
	
	@Id
	private String id;
	private String name;
}
