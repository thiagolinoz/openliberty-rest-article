package br.com.linoz.openliberty.rest.article.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.linoz.openliberty.rest.article.api.entity.Person;

@Path("persons")
public class PersonResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Person> getAllPeople() {
		List<Person> myListPeople = new ArrayList<Person>();
		myListPeople.add(new Person("thiago", "thiago@email.com.br"));
		myListPeople.add(new Person("maria", "maria@email.com.br"));
		myListPeople.add(new Person("jose", "jose@email.com.br"));
		return myListPeople;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public String addPerson(Person person) {
		// add some persistence here
		return "The person " + person.getName() + " was added successfully";
	}
}
