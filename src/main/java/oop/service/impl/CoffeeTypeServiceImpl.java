package oop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import antlr.collections.List;
import oop.dao.CoffeeTypeDao;
import oop.model.CoffeeType;
import oop.service.CoffeeTypeService;

@Service
public class CoffeeTypeServiceImpl implements CoffeeTypeService {
	@Autowired
	private CoffeeTypeDao coffeetypeDao;

	@Transactional
	public void add(CoffeeType coffeeType) {
		coffeetypeDao.add(coffeeType);

	}

	@Transactional
	public void edit(CoffeeType coffeeType) {
		coffeetypeDao.edit(coffeeType);

	}

	@Transactional
	public void delete(int id) {
		coffeetypeDao.delete(id);

	}

	@Transactional
	public CoffeeType getCoffeeType(int id) {
		return coffeetypeDao.getCoffeeType(id);
	}

	@Transactional
	public List getAllCoffee() {
		return coffeetypeDao.getAllCoffee();
	}
	
	public float countTotal(CoffeeType coffeeType){
		float sum;
		sum=coffeeType.getPrice()*coffeeType.getTotal();
		return sum;
	}

}
