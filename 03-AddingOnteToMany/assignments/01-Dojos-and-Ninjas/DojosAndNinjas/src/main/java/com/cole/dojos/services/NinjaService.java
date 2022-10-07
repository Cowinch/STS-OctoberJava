package com.cole.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cole.dojos.models.Dojo;
import com.cole.dojos.models.Ninja;
import com.cole.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {
	private final NinjaRepository ninjaRepo;

	public NinjaService(NinjaRepository ninjaRepo) {
		this.ninjaRepo=ninjaRepo;
	}
	
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	
	public List<Ninja> dojoNinjas(Long dojoId){
		return ninjaRepo.findByDojoIdIs(dojoId);
	}
	
	public Ninja addNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public Ninja updateNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public void removeFromDojo(Ninja ninja) {
		ninja.setDojo(null);
		ninjaRepo.save(ninja);
	}
	
	public void addToDojo(Ninja ninja, Dojo dojo) {
		ninja.setDojo(dojo);
		ninjaRepo.save(ninja);
	}
	
	public Ninja findNinja(Long id) {
		Optional<Ninja> optionalNinja = ninjaRepo.findById(id);
		if(optionalNinja.isPresent()) {
			return optionalNinja.get();
		} else {
			return null;
		}
	}

}
