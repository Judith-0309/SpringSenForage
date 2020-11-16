package sn.simplon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sn.simplon.dao.IVillageDao;
import sn.simplon.entities.Village;




@Controller
@RequestMapping(value="/village")
public class VillageController {
	
	@Autowired
	private IVillageDao villagedao;
	
	
	
	
	
	@PostMapping(value="/add")
	public String add(String nomVillage) {
		Village v = new Village();
		v.setNomVillage(nomVillage);
	    villagedao.save(v);
	   
		return "redirect:/village"; 
		
	}

	@GetMapping(value="")
	public String index(Model model) {
		
		model.addAttribute("listeVillage", villagedao.findAll());
		return "village/addVillage";
		
	}
}
