package Reto_bodega;

import java.util.Scanner;

public class ARDOA extends artikuloa{

	private String Kolorea;
	private String Jatorria;
	private int Urtea;
	private String Mahatsa;
	
	public ARDOA() {
		this.Kolorea="";
		this.Jatorria="";
		this.Urtea=0;
		this.Mahatsa="";
	}
	public ARDOA(String k,String i,String m,double s,int st,String ko,String j,int u,String ma){
		super(k,i,m,s,st);
		this.Kolorea=ko;
		this.Jatorria=j;
		this.Urtea=u;
		this.Mahatsa=ma;
	}
	
	
	public String getKolorea() {
		return Kolorea;
	}
	public void setKolorea(String kolorea) {
		Kolorea = kolorea;
	}
	public String getJatorria() {
		return Jatorria;
	}
	public void setJatorria(String jatorria) {
		Jatorria = jatorria;
	}
	public int getUrtea() {
		return Urtea;
	}
	public void setUrtea(int urtea) {
		Urtea = urtea;
	}
	public String getMahatsa() {
		return Mahatsa;
	}
	public void setMahatsa(String mahatsa) {
		Mahatsa = mahatsa;
	}
	
	@Override
	public String toString() {
		return super.toString()+" ARDOA [Kolorea=" + Kolorea + ", Jatorria=" + Jatorria + ", Urtea=" + Urtea + ", Mahatsa=" + Mahatsa
				+ "]";
	}
	@Override
	public void ezaugarriak(Scanner teclado) {
		// TODO Auto-generated method stub
		System.out.println(this.Kodea);
		System.out.println(this.Izena);
		System.out.println(this.Marka);
		System.out.println(this.Salneurria);
		System.out.println(this.stock);
		System.out.println(this.Kolorea);
		System.out.println(this.Jatorria);
		System.out.println(this.Urtea);
		System.out.println(this.Mahatsa);
	}
	@Override
	public boolean osasungarria(Scanner teclado) {
		// TODO Auto-generated method stub
		if(this.Jatorria.equals("errioxakoa")){
			return true;
		}else {
			return false;
	}
		
		
	}
	}
