package oop.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import antlr.collections.List;
import oop.dao.CoffeeTypeDao;
import oop.model.CoffeeType;
@Repository
public class CoffeeTypeDaoImpl implements CoffeeTypeDao {
	@Autowired
	private SessionFactory session;

	public void add(CoffeeType coffeeType) {
		session.getCurrentSession().save(coffeeType);

	}

	public void edit(CoffeeType coffeeType) {
		session.getCurrentSession().update(coffeeType);

	}

	public void delete(int id) {
		session.getCurrentSession().delete(getCoffeeType(id));

	}

	public CoffeeType getCoffeeType(int id) {
		
		return (CoffeeType)session.getCurrentSession().get(CoffeeType.class, id);
	}

	public List getAllCoffee() {
		return (List) session.getCurrentSession().createQuery("from coffeetype").list();
	}

}
