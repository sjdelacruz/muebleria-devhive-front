package com.muebleria_devhive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.muebleria_devhive.models.Mueble;
import com.muebleria_devhive.models.MuebleLigero;
import com.muebleria_devhive.services.MueblesService;
import com.muebleria_devhive.utils.Counter;

@Controller
public class MuebleriaController {
	
	@Autowired
	MueblesService service;
	
	@GetMapping
	public String getIndex(Model model) {
		List<MuebleLigero> muebles = service.getMuebles();
		model.addAttribute("muebles", muebles);
		model.addAttribute("counter", new Counter());
		return "Index";
	}
	
	@GetMapping("/details")
	public String getDetails(@RequestParam("id") Integer id, Model model) {
		Mueble mueble = service.getMueble(id);
		model.addAttribute("mueble", mueble);
		return "Details";
	}
	

}
