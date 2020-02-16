package main;

public class Persoana {
	
	//variabile Globale
	private String nume;   
	private String prenume;
	private int varsta;
	
	
	
	//Constructorul implicit in Java
	public Persoana() {
		nume="";
		prenume="";
		varsta=0;
	}
	
	
	
	//Constructor definit cu 3 parametri
	public Persoana(String nume, String prenume, int varsta) {
		this.nume=nume;
		this.prenume=prenume;
		this.varsta=varsta;
	}
	
	
	
	
	//Metoda
	public String afiseazaDetaliiPersoan () {
		return "Nume: " + nume + "\nPrenume: " + prenume + "\nVarsa: " + varsta;
	}
	
	
	
	
	//Metode de tip Accesor. Get & Set pt accesarea variabilelor Globale Private
	public String getNume() {
		return nume;
	}
	
	public void setNume(String nume) {         //variabila locala "nume"
		this.nume=nume;                        // this. face referire la VARIABILA GLOBALA
	}
	
	public String getPrenume() {
		return prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume=prenume;
	}
	
	public int getVarsa() {
		return varsta;
	}

	public void setVarsta(int varsta) {
		this.varsta=varsta;
	}

}
