package com.milano.sondaggio.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Entity
@Table(name="sondaggio")
@Data
public class Sondaggio implements Serializable{
	private static final long serialVersionUID = -5668297890610489274L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private long id;
	@Column(nullable = false)
	private String domanda;
	private String descrizione;
}
