package main;

public class Main {

	public static void main(String[] args) {
		
		//Invatare ======================================================================================================
		Persoana pers = new Persoana();
		pers.afiseazaDetaliiPersoan();
		
		Persoana pers1 = new Persoana();
		pers1.setNume("Dow");
		pers1.setPrenume("John");
		pers1.setVarsta(30);
		
		Persoana pers2 = new Persoana();
		pers2.setNume("Miller");
		pers2.setPrenume("Mike");
		pers2.setVarsta(23);
		
		System.out.println("Nume: " + pers1.getNume() + "\nPrenume: " + pers1.getPrenume() + "\nVarsta: " + pers1.getVarsa());
		System.out.println();
		System.out.println("Nume: " + pers2.getNume() + "\nPrenume: " + pers2.getPrenume() + "\nVarsta: " + pers2.getVarsa());
		System.out.println();
		
		Persoana p = new Persoana ("Ion", "Mihai", 28);
		System.out.println("Nume: " + p.getNume() + "\nPrenume: " + p.getPrenume() + "\nVarsta: " + p.getVarsa());
		System.out.println();
		
		
		
		
		//Tema 4 Exercitiul 1 ================================================================================================
		Animal sconcs = new Animal ("Puturos");
		sconcs.setculoare("Negru");
		sconcs.setvarsta(2);
		System.out.println("Tip Animal: " + sconcs.gettipAnimal() + "\nCuloare : " + sconcs.getculoare() + "\nVarsta : " + sconcs.getvarsta());
		System.out.println();
		
		Animal lenes = new Animal("Alt gen de puturos", "Alb");
		lenes.setvarsta(10);
		System.out.println("Tip Animal: " + lenes.gettipAnimal() + "\nCuloare: " + lenes.getculoare() + "\nVarsta: " + lenes.getvarsta());
		System.out.println();
		
		Animal caine = new Animal("Obraznic","Maro",10);
		System.out.println("Tip Animal: " + caine.gettipAnimal() + "\nCuloare: " + caine.getculoare() + "\nVarsta: " + caine.getvarsta());
		System.out.println();
		
		
		
		
		//Tema 4 Exercitiul 2 =================================================================================================
		Imobil apartament = new Imobil ("Decomandat",1, 90000.0);
		System.out.println("Tip Casa: " + apartament.gettipCasa());
		System.out.println("Nr etaje: " + apartament.getnrEtaje());
		System.out.println("Pret apartament: " + apartament.getpret());
		
		Imobil vila = new Imobil ("Lux", 2, 150000.0);
		vila.gettipCasa();
		
		Imobil garsoniera = new Imobil (1, 60000.0);
		garsoniera.settipCasa("Open Space");
		
		
		
		

	}

}
