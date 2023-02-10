package Reto_bodega;

import java.util.Scanner;

public abstract class artikuloa {
	
	protected String Kodea;
	protected String Izena;
	protected String Marka;
	protected double Salneurria;
	protected int stock;
	
	public artikuloa() {
		this.Kodea="";
		this.Izena="";
		this.Marka="";
		this.Salneurria=0.00;
		this.stock=0;
	}
	public artikuloa(String k,String i,String m,double s,int st) {
		this.Kodea=k;
		this.Izena=i;
		this.Marka=m;
		this.Salneurria=s;
		this.stock=st;
	}
	public artikuloa(artikuloa a) {
		this.Kodea=a.Kodea;
		this.Izena=a.Izena;
		this.Marka=a.Marka;
		this.Salneurria=a.Salneurria;
		this.stock=a.stock;
	}
	public String getKodea() {
		return Kodea;
	}
	public void setKodea(String kodea) {
		Kodea = kodea;
	}
	public String getIzena() {
		return Izena;
	}
	public void setIzena(String izena) {
		Izena = izena;
	}
	public String getMarka() {
		return Marka;
	}
	public void setMarka(String marka) {
		Marka = marka;
	}
	public double getSalneurria() {
		return Salneurria;
	}
	public void setSalneurria(double salneurria) {
		Salneurria = salneurria;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	@Override
	public String toString() {
		return "artikuloa [Kodea=" + Kodea + ", Izena=" + Izena + ", Marka=" + Marka + ", Salneurria=" + Salneurria
				+ ", stock=" + stock + "]";
	}
	public void GehituStock(int a) {
		this.stock=this.stock+a;
	}
	
	public void KenduStock(int a) {
		this.stock=this.stock-a;
	}
	
	public abstract void ezaugarriak(Scanner teclado);
	
	public abstract boolean osasungarria(Scanner teclado);
}
