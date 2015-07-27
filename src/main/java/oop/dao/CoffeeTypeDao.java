package oop.dao;

import antlr.collections.List;
import oop.model.CoffeeType;

public interface CoffeeTypeDao {
	public void add(CoffeeType coffeeType);

	public void edit(CoffeeType coffeeType);

	public void delete(int id);

	public CoffeeType getCoffeeType(int id);

	public List getAllCoffee();
}
