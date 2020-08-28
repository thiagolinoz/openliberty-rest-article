package br.com.linoz.openliberty.rest.article.api.entity;

public class Person {
	private String name;
	private String email;
	
	public Person() {
	}
	
	public Person(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
}
