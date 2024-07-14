package com.muebleria_devhive.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.muebleria_devhive.models.Mueble;
import com.muebleria_devhive.services.MueblesService;

@Controller
public class MuebleriaController {
	
	@Autowired
	MueblesService service;
	
	@GetMapping("/index")
	public String getIndex(Model model) {
		List<Mueble> muebles = service.getMuebles();
		model.addAttribute("muebles", muebles);
		return "Index";
	}
	

}
