package com.hellfishg.rest.services;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hellfishg.rest.vos.VOUser;

@RestController //notacion para publicar el servicio rest. 
@RequestMapping(path = "/serviceREST/hell") //ruta desl servicio. contexto.
public class RestUser {
	
	@RequestMapping(
			method = RequestMethod.POST, //servicio recibe metodos post.
			path = "/validateUser", //como se llama el servicio.
			consumes = "application/json",
			produces = "application/json")
	public @ResponseBody VOUser validateUser(@RequestBody VOUser user) throws Exception{
		//@ResponseBody VOUser ---> spring sabe que transforma obj VOUser en json de respuesta.
		//@RequestBody VOUser ---> spring sabe que transforma obj VOUser en json de consume.
		VOUser response = new VOUser();
		response.setFind(false);
		System.out.println("User: "+ user.getUser());
		System.out.println("Password: "+ user.getPassword());
		
		try{
			if(user.getUser().equals("hellfishg") && user.getPassword().equals("1234")){
				
				response.setUser(user.getUser());
				response.setFind(true);
			}
			return response;
			
		} catch (Exception e) {
			return response;
		}
	}
}
