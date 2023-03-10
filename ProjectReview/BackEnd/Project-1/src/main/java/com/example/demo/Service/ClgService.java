package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Clg;
import com.example.demo.Repository.ClgRepo;

@Service
public class ClgService {
	
	@Autowired
	ClgRepo repo;
	
	public Clg addClg(Clg c) {
		return repo.save(c);
	}
	
	public List<Clg> getClg() {
		List<Clg> arr = new ArrayList<>();
		
		arr = (List<Clg>)repo.findAll();
		
		return arr;
	}
	
	public void delete(long S_No) {
		repo.deleteById(S_No);
	}
	
	public Clg update(long id,Clg c) {
		Clg co = repo.findById(id).get();
		
		if(Objects.nonNull(co) && (!Objects.isNull(c.getCollege_Name()))) {
			co.setCollege_Name(c.getCollege_Name());
		}
		if(Objects.nonNull(co) && (c.getnIRF() != 0)) {
			co.setnIRF(c.getnIRF());
		}
		if(Objects.nonNull(co) && (c.getUser_rating() != 0)) {
			co.setUser_rating(c.getUser_rating());
		}
		if(Objects.nonNull(co) && (!Objects.isNull(c.getaICETE_Approved()))) {
			co.setaICETE_Approved(c.getaICETE_Approved());
		}
		if(Objects.nonNull(co) && (!Objects.isNull(c.getLocation()))) {
			co.setLocation(c.getLocation());
		}
		if(Objects.nonNull(co) && (c.getOutlook_Rating() != 0)) {
			co.setOutlook_Rating(c.getOutlook_Rating());
		}
		
		return repo.saveAndFlush(co);
	}

	public Clg getClgById(Long id) {
		return repo.findById(id).get();
	}
}
