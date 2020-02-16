package tema4;

public class Imobil {
	
	private String tipCasa;
	private int nrEtaje;
	private double pret;
	
	
	public Imobil (String tipCasa, int nrEtaje, double pret) {
		this.tipCasa=tipCasa;
		this.nrEtaje=nrEtaje;
		this.pret=pret;
		
	}
	
	
	public Imobil (int nrEtaje, double pret) {
		this.nrEtaje=nrEtaje;
		this.pret=pret;
	}
	
	
	
	public String gettipCasa() {
		return tipCasa;
	}
	
	public void settipCasa(String tipCasa) {
		this.tipCasa=tipCasa;
	}
	
	public int getnrEtaje() {
		return nrEtaje;
	}
	
	public void setnrEtaje(int nrEtaje) {
		this.nrEtaje=nrEtaje;
	}
	
	public double getpret() {
		return pret;
	}
	
	public void setpret (double pret) {
		this.pret=pret;
	}
	
	
	
	
	
	
	
	
	
	
	

}
