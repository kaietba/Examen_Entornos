package Reto_bodega;

public class fakturaLerroak {
	private String Kodea; 
	private int Kopurua;
	private double guztiraLerro;
	
	public fakturaLerroak() {
		this.Kodea="";
		this.Kopurua=0;
		this.guztiraLerro=0.00;
	}

	public fakturaLerroak(String pKodea,int pKopurua,double pGuztira) {
		this.Kodea=pKodea;
		this.Kopurua=pKopurua;
		this.guztiraLerro=pGuztira;
	}

	public String getKodea() {
		return Kodea;
	}

	public void setKodea(String kodea) {
		Kodea = kodea;
	}

	public int getKopurua() {
		return Kopurua;
	}

	public void setKopurua(int kopurua) {
		Kopurua = kopurua;
	}

	public double getGuztiraLerro() {
		return guztiraLerro;
	}

	public void setGuztiraLerro(double guztiraLerro) {
		this.guztiraLerro = guztiraLerro;
	}

	@Override
	public String toString() {
		return "fakturaLerroak [Kodea=" + Kodea + ", Kopurua=" + Kopurua + ", guztiraLerro=" + guztiraLerro + "]";
	}
	
}
