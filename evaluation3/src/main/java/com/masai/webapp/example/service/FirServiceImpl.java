package com.masai.webapp.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.webapp.example.entity.Fir;
import com.masai.webapp.example.repository.FirRepository;

@Service
public class FirServiceImpl implements Firservice {
	
	@Autowired
	FirRepository repository;

	@Override
	public List<Fir> addFir(Fir fir) {
		repository.save(fir);
		return repository.findAll();
	}

	@Override
	public boolean deleteFir(int FirId) {
		repository.deleteById(FirId);
		return true;
	}

	@Override
	public List<Fir> getFirs() {
		repository.findAll();
		return null;
	}

	@Override
	public Fir getFir(int FirId) {
		return repository.findById(FirId).get();
	}

}
