package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Clg;
import com.example.demo.Service.ClgService;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class ClgController {

	@Autowired
	ClgService cServ;
	
	@GetMapping("/list")
	public List<Clg> showClg() {
		return cServ.getClg();
	}
	
	@GetMapping("/get/{id}")
	public Clg getClg(@PathVariable("id") Long id) {
		return cServ.getClgById(id);
	}
	
	@PostMapping("/add")
	public Clg showClg(@RequestBody Clg c) {
		return cServ.addClg(c);
	}
	 
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") long id) {
		cServ.delete(id);
	}
	
	@PutMapping("/update/{id}")
	public Clg update(@PathVariable("id") long id,@RequestBody Clg c) {
		return cServ.update(id, c);
	}

}
