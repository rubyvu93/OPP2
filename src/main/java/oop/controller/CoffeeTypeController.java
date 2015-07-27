package oop.controller;

import java.util.Map;

import javax.naming.Binding;

import oop.model.CoffeeType;
import oop.service.CoffeeTypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CoffeeTypeController {
	@Autowired
	private CoffeeTypeService coffeeTypeService;

	@RequestMapping("/index")
	public String setupForm(Map<String, Object> map) {
		CoffeeType coffeeType = new CoffeeType();
		map.put("coffeetype", coffeeType);
		map.put("coffeelist", coffeeTypeService.getAllCoffee());
		return "coffeetype";
	}

	@RequestMapping(value = "/coffeetype.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute CoffeeType coffeeType,
			Binding result, @RequestParam String action, Map<String, Object> map) {
		CoffeeType coffeeType2 = new CoffeeType();
		switch (action.toLowerCase()) {
		case "add":
			coffeeTypeService.add(coffeeType);
			coffeeType2=coffeeType;
			break;
		case "edit":
			coffeeTypeService.edit(coffeeType);
			coffeeType2=coffeeType;
			break;
		case "delete":
			coffeeTypeService.delete(coffeeType.getId());
			coffeeType2=coffeeType;
			break;

		case "search":
			CoffeeType searchcoffee=coffeeTypeService.getCoffeeType(coffeeType.getId());
			coffeeType2=searchcoffee!=null ? searchcoffee :new CoffeeType();
			break;
		}
		map.put("coffeetype",coffeeType2);
		map.put("coffeelist", coffeeTypeService.getAllCoffee());
		return "coffeetype";
	}
}
