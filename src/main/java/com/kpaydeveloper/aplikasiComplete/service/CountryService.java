package com.kpaydeveloper.aplikasiComplete.service;

import com.kpaydeveloper.aplikasiComplete.dto.entity.Country;
import com.kpaydeveloper.aplikasiComplete.repositori.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;


	//Ambil data semua yang ada di list
	public List<Country> findAll(){
		return countryRepository.findAll();
	}	
	
	//Ambil Data By Id
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}	
	
	//Delete Data By Id
	public void delete(int id) {
		countryRepository.deleteById(id);
	}
	
	//Update Data
	public void save( Country country) {
		countryRepository.save(country);
	}

}
