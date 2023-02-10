package Reto_bodega;

import java.util.Scanner;

public class FRESKAGARRIAK extends artikuloa{
	
	private String Zaporea;
	private boolean Zukua;
	private boolean Gasa;
	private int Azukrea;
	
	public FRESKAGARRIAK() {
		super();
		this.Zaporea="";
		this.Zukua=false;
		this.Gasa=false;
		this.Azukrea=0;
	}
	
	public FRESKAGARRIAK(String k,String i,String m,double s,int st,String z,boolean zu,boolean g,int a) {
		super(k,i,m,s,st);
		this.Zaporea=z;
		this.Zukua=zu;
		this.Gasa=g;
		this.Azukrea=a;
	}
	
	
	public String getZaporea() {
		return Zaporea;
	}

	public void setZaporea(String zaporea) {
		Zaporea = zaporea;
	}

	public boolean isZukua() {
		return Zukua;
	}

	public void setZukua(boolean zukua) {
		Zukua = zukua;
	}

	public boolean isGasa() {
		return Gasa;
	}

	public void setGasa(boolean gasa) {
		Gasa = gasa;
	}

	public int getAzukrea() {
		return Azukrea;
	}

	public void setAzukrea(int azukrea) {
		Azukrea = azukrea;
	}
	
	

	@Override
	public String toString() {
		return super.toString()+" FRESKAGARRIAK [Zaporea=" + Zaporea + ", Zukua=" + Zukua + ", Gasa=" + Gasa + ", Azukrea=" + Azukrea+ "]";
	}

	@Override
	public void ezaugarriak(Scanner teclado) {
		// TODO Auto-generated method stub
		System.out.println(this.Kodea);
		System.out.println(this.Izena);
		System.out.println(this.Marka);
		System.out.println(this.Salneurria);
		System.out.println(this.stock);
		System.out.println(this.Zaporea);
		System.out.println(this.Zaporea);
		System.out.println(this.Zukua);
		System.out.println(this.Gasa);
		System.out.println(this.Azukrea);
	}

	@Override
	public boolean osasungarria(Scanner teclado) {
		// TODO Auto-generated method stub
		if(this.Azukrea<25){
			return true;
		}else {
			return false;
		}
	}

}
