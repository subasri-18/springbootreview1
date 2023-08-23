package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.CakesEntity;
import com.example.demo.service.CakesService;

@RestController

public class CakesController {
	@Autowired
	CakesService sser;
	@PostMapping("addcake")
	public CakesEntity addndetails(@RequestBody CakesEntity ss)
	{
		return sser.saveinfo(ss);
		
		
	}
	@PostMapping("addncake")
	public List<CakesEntity> addndetails(@RequestBody List<CakesEntity> ss)
	{
		return sser.savedetails(ss);
		
		
	}
	@GetMapping("showcake")
	public List<CakesEntity> show()
	{
		return sser.showinfo();
	}
	@PutMapping("updatecake")
	public CakesEntity modify(@RequestBody CakesEntity ss)
	{
		return sser.changeinfo(ss);
	}
	@DeleteMapping("deletecake")
	public String del(@RequestBody CakesEntity ss)
	{
		sser.deleteinfo(ss);
		return"deleted successfully";
	}
	
	@DeleteMapping("delparacake")
	public void my(@RequestParam int id)
	{
		sser.deletepid(id);
		
	}
		
	


	

}
