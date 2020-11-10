package com.raphaelvieira.sistemaclinica.aplicacao.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
   
	  @RequestMapping("/login")
	  public String login() {
		  
		  return "index";
	  }
	  
	  
	  @RequestMapping("/dashboard")
	  public String dashboard() {
		  
		  return "dashboard";
	  }
	  
	  @RequestMapping("/agendamento")
	  public String agendamento() {
		  
		  return "agendamento";
	  }
	  
	  @RequestMapping("/cadastroDentista")
	  public String cadastroDentista() {
		  
		  return "cadastroDentista";
	  }
	  
	  @RequestMapping("/cadastroPaciente")
	  public String cadastroPaciente() {
		  
		  return "cadastroPaciente";
	  }
	  
	  
	  @RequestMapping("/cadastroUsuario")
	  public String cadastroUsuario() {
		  
		  return "cadastroUsuario";
	  }
}
