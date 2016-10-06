package com.fatih.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Urun {

	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long urunId;
	
	private String urunAdi;
	
	
	@OneToOne
	private Kategori kategori;
	
	
	public Urun() {
		// TODO Auto-generated constructor stub
	}


	public Long getUrunId() {
		return urunId;
	}


	public void setUrunId(Long urunId) {
		this.urunId = urunId;
	}


	public String getUrunAdi() {
		return urunAdi;
	}


	public void setUrunAdi(String urunAdi) {
		this.urunAdi = urunAdi;
	}


	public Kategori getKategori() {
		return kategori;
	}


	public void setKategori(Kategori kategori) {
		this.kategori = kategori;
	}
	
	
	
}
