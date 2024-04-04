package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails() {
		//super.getDetails();
		System.out.println("El nombre de la persona es " + name + " y su apellido " + surname + "." + " El area es " + area + ".");
	}
}
