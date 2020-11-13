package sn.simplon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import sn.simplon.dao.IClientDao;
import sn.simplon.entities.Client;

@Controller
public class ClientController {
	

	
    @Autowired
    private IClientDao IClientDao;
    
//    @RequestMapping(value="Client/add")	
//////	public String listeClient() {
////    public ModelAndView listeClient() {
//    	List<Client> client = IClientDao.findAll();
//		
   
		
	}

  