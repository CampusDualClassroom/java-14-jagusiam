package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void getDetails() {
		//super.getDetails();
		//System.out.println("El nombre de la persona es " + name + " y su apellido " + surname +". El escuadrón es " + squad + ".");

		//Uso de StringBuilder
		StringBuilder sb = new StringBuilder();
		sb.append("El nombre de la persona es " + name);
		sb.append(" y su apellido " + surname);
		sb.append(". El escuadrón es " + squad + ".");
		System.out.println(sb.toString());
	}
}
