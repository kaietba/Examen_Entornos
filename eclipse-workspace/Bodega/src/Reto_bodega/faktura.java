package Reto_bodega;

import java.util.ArrayList;



public class faktura extends fakturaLerroak implements fakturazioa {
	private int zenbakia;
	private String Izena;
	private String Abizena;
	private ArrayList<fakturaLerroak> fakturaLerroak;
	private double Totala;
	
	
	
	public void faktura() {
		this.zenbakia=0;
		this.Izena="";
		this.Abizena="";
		this.fakturaLerroak=new ArrayList();
		this.Totala=0.00;
	}
	
	public void faktura(int z,String i,String a,ArrayList f,double t){
		this.zenbakia=z;
		this.Izena=i;
		this.Abizena=a;
		this.fakturaLerroak=f;
		this.Totala=t;
	}
	



	
	public int getZenbakia() {
		return zenbakia;
	}

	public void setZenbakia(int zenbakia) {
		this.zenbakia = zenbakia;
	}

	public String getIzena() {
		return Izena;
	}

	public void setIzena(String izena) {
		Izena = izena;
	}

	public String getAbizena() {
		return Abizena;
	}

	public void setAbizena(String abizena) {
		Abizena = abizena;
	}

	public ArrayList<fakturaLerroak> getFakturaLerroak() {
		return fakturaLerroak;
	}

	public void setFakturaLerroak(ArrayList<fakturaLerroak> fakturaLerroak) {
		this.fakturaLerroak = fakturaLerroak;
	}

	public double getTotala() {
		return Totala;
	}

	public void setTotala(double totala) {
		Totala = totala;
	}
	
	public void LerroaGehitu(String pKodea,int pKopurua,double pGuztira) {
		fakturaLerroak f1=new fakturaLerroak(pKodea,pKopurua,pGuztira);
		fakturaLerroak.add(f1);	
		}
	

	@Override
	public String toString() {
		return "faktura [zenbakia=" + zenbakia + ", Izena=" + Izena + ", Abizena=" + Abizena + ", fakturaLerroak="
				+ fakturaLerroak + ", Totala=" + Totala + "]";
	}
	
	public void print() {
		System.out.println(this.zenbakia);
		System.out.println(this.Izena);
		System.out.println(this.Abizena);
		System.out.println(this.Totala);
		for(fakturaLerroak l:fakturaLerroak) {
			System.out.println(fakturaLerroak);
			}
		
	}
	

	@Override
	public double kalkulatuTotala() {
		// TODO Auto-generated method stub
		return 0;
	}

}
