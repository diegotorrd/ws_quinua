package com.quinua.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.quinua.ws.rest.bean.Usuario;

@Path("/Quinua")
public class ServiceLogin {
	
	@POST
	@Path("/validarUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public Usuario validaUsuario(Usuario us){
		us.setUserValido(false);
		if(us.getUsuario().equals("diego") &&
				us.getPassword().equals("123")){
			us.setUserValido(true);
		}
			
			return us;
	}

	
}
