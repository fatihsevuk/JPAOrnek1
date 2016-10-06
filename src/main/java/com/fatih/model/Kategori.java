package com.fatih.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Kategori {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long kategoriId;
	
	private String kategori;

	public Kategori() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Long getKategoriId() {
		return kategoriId;
	}

	public void setKategoriId(Long kategoriId) {
		this.kategoriId = kategoriId;
	}

	public String getKategori() {
		return kategori;
	}

	public void setKategori(String kategori) {
		this.kategori = kategori;
	}
	
	
	
}
