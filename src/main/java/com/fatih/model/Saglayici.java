package com.fatih.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Saglayici {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long saglayiciId;
	
	private String sirketAdi;
	
	@OneToMany
	private Set<Urun> urunler;

	public Long getSaglayiciId() {
		return saglayiciId;
	}

	public void setSaglayiciId(Long saglayiciId) {
		this.saglayiciId = saglayiciId;
	}

	public String getSirketAdi() {
		return sirketAdi;
	}

	public void setSirketAdi(String sirketAdi) {
		this.sirketAdi = sirketAdi;
	}

	public Set<Urun> getUrunler() {
		return urunler;
	}

	public void setUrunler(Set<Urun> urunler) {
		this.urunler = urunler;
	}
	
	public Saglayici() {
		// TODO Auto-generated constructor stub
	}
	
	
	
}
