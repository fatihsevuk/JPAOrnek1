package com.fatih.test;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fatih.model.Kategori;
import com.fatih.model.Saglayici;
import com.fatih.model.Urun;

public class Test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPAOrnek1");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		Kategori kategori=new Kategori();
		kategori.setKategori("Kitap");
		
		Urun urun1=new Urun();
		urun1.setUrunAdi("Suç ve Caza");
		urun1.setKategori(kategori);
		
		Urun urun2=new Urun();
		urun2.setUrunAdi("Don Kişot");
		urun2.setKategori(kategori);
		
		Saglayici saglayici=new Saglayici();
		
		saglayici.setSirketAdi("İletişim Yayınları Ltd. Şti.");
		
		Set<Urun > torba=new HashSet<Urun>();
		torba.add(urun1);
		torba.add(urun2);
		
		saglayici.setUrunler(torba);
		
		try{
			
			et.begin();
			
			em.persist(kategori);
			em.persist(urun1);
			em.persist(urun2);
			em.persist(saglayici);
			et.commit();
			
			System.out.println("işlemler başarıyla tmamlandı veri tabanını kontrol et");
			
		}catch (Exception e) {
			et.rollback();
		}
 		

	}

}
