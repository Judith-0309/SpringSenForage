package sn.simplon.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sn.simplon.dao.IClientDao;
import sn.simplon.dao.IVillageDao;


@Controller
@RequestMapping(value="/client")
public class ClientController {
	
	 
	@Autowired
	private IClientDao cliendao;
		
   
		
	}

  