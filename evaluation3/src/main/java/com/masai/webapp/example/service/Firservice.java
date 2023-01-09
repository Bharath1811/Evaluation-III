package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.Fir;

@Service
public interface Firservice {
	
	public List<Fir> addFir(Fir fir);
	public boolean deleteFir(int FirId);
	public List<Fir> getFirs();
	public Fir getFir(int FirId);


}
