package com.bios.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Item implements Serializable{

	private static final long serialVersionUID = 8656018810541815167L;
	
	private long id;
	
	private String nome;
	
	private String categoria;
	
	private String origem;

}
