package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.CakesEntity;
import com.example.demo.repository.CakesRepo;

@Service

public class CakesService {
	@Autowired
	CakesRepo sr;
	public CakesEntity saveinfo(CakesEntity ss)
	{
		return sr.save(ss);
	}
    public List<CakesEntity> savedetails(List<CakesEntity> ss)
    {
    	return (List<CakesEntity>)sr.saveAll(ss);
    }
	public List<CakesEntity> showinfo()
	{
		return sr.findAll();
	}
	public CakesEntity changeinfo(CakesEntity ss)
	{
		return sr.saveAndFlush(ss);
	}
	public void deleteinfo(CakesEntity ss)
	{
		sr.delete(ss);
	}

	

	public void deletepid(int id)
	{
		sr.deleteById(id);
	}
}
