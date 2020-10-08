package com.kpaydeveloper.aplikasiComplete.service;

import com.kpaydeveloper.aplikasiComplete.dto.entity.Client;
import com.kpaydeveloper.aplikasiComplete.repositori.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository clientRepository;
	
	//Get All Clients
	public List<Client> findAll(){
		return clientRepository.findAll();
	}	
	
	//Get Client By Id
	public Optional<Client> findById(int id) {
		return clientRepository.findById(id);
	}	
	
	//Delete Client
	public void delete(int id) {
		clientRepository.deleteById(id);
	}
	
	//Update Client
	public void save( Client client) {
		clientRepository.save(client);
	}

}
