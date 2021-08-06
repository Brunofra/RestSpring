package com.br.ProjetoCrud.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.br.ProjetoCrud.Entity.User;
import com.br.ProjetoCrud.Repository.UserRepository;


@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepository UserRepository;
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> lista() throws Exception {
	 return UserRepository.findAll();
	}
	
	@RequestMapping(value ="/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable Long id)throws Exception{
		this.UserRepository.deleteById(id);
		return "deletado com sucesso";
	}
	
	@RequestMapping(value="",method = RequestMethod.POST )
	public String save(@RequestBody  User user)throws Exception{
		this.UserRepository.save(user);
		return "Salvo com sucesso";
	}

	@RequestMapping(value="",method = RequestMethod.PUT )
	public String alterar(@RequestBody  User user)throws Exception{
		this.UserRepository.save(user);
		return "Alterado com sucesso";
	}
}
