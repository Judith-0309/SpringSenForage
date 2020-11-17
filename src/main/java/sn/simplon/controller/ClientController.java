package sn.simplon.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import sn.simplon.dao.IClientDao;
import sn.simplon.dao.IVillageDao;
import sn.simplon.entities.Client;
import sn.simplon.entities.Village;


@Controller
@RequestMapping(value="/client")
public class ClientController {
	
	 
	@Autowired
	private IClientDao clientdao;
	@Autowired
	private IVillageDao villagedao;
	
		
   @PostMapping(value="/add")
   public String add(String nom,String prenom,String adresse,String telephone,int village) 
    {
	   Client c = new Client();
	   Village v = new Village();
	   
	  
	   
	   c.setNom(nom);
	   c.setPrenom(prenom);
	   c.setAdresse(adresse);
	   c.setTelephone(telephone);
	   v.setId(village);
	   c.setVillage(v);
	   
	   clientdao.save(c);
	   return "redirect:/client";
   }
   
  
   
   
   @GetMapping(value="")
   public String index(Model model) {
	   model.addAttribute("listeClient",clientdao.findAll());
	   model.addAttribute("listeVillage",villagedao.findAll());
	   return "client/add";
   }	
	}

  