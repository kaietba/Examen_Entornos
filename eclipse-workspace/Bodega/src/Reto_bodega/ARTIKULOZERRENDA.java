package Reto_bodega;

import java.util.ArrayList;
import java.util.Scanner;

public class ARTIKULOZERRENDA {
	Scanner teklatua=new Scanner(System.in);

	ArrayList<artikuloa>lista;
	
	public ARTIKULOZERRENDA() {
		this.lista=new ArrayList<artikuloa>();
		
	}
	
	public ArrayList<artikuloa> getLista() {
		return lista;
	}



	public void setLista(ArrayList<artikuloa> lista) {
		this.lista = lista;
	}
	

	public void filldata(){
		artikuloa f1=new FRESKAGARRIAK("f1","Fanta","Coca-Cola",0.67,61,"laranja",true,true,15);
		artikuloa f2=new FRESKAGARRIAK("f2","Coca-Cola","Coca-Cola",0.80,47,"cola",false,true,37);
		artikuloa f3=new FRESKAGARRIAK("f3","Sprite","Coca-Cola",0.53,82,"lima-limón",false,true,6);
		artikuloa f4=new FRESKAGARRIAK("f4","Pepsi-MAX","PepsiCO",0.73,82,"cola",false,true,7);
		lista.add(f1);
		lista.add(f2);
		lista.add(f3);
		lista.add(f4);
		artikuloa a1=new ARDOA("a1","Marqués de Murrieta Reserva 2018","Marques de Murrieta",21.50,25,"Tinto","errioxa",2018,"Tempranillo");
		artikuloa a2=new ARDOA("a2","El Castro de Valtuille Mencía Joven 2021","Bodegas y Viñedos Castro Ventosa",6.45,86,"Tinto","Bierzo",2021,"Mencia");
		artikuloa a3=new ARDOA("a3","Pazo Barrantes 2020","Pazo Barrantes",40.90,64,"Blanco","Rias Biaxas",2020,"Albariño");
		artikuloa a4=new ARDOA("a4","Artazuri Rosado 2021","Bodegas y Viñedos Artazu",7.50,71,"Rosado","Navarra",2021,"Garnacha");
		lista.add(a1);
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		}
	public ArrayList<artikuloa>reponer(){
		ArrayList<artikuloa>a=new ArrayList<artikuloa>();
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).stock<(50)){
				a.add(lista.get(i));
			}
		}
		return a;
	}
	public ArrayList<artikuloa>garestiena(){
		ArrayList<artikuloa>b=new ArrayList<artikuloa>();
		double max=0;
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).Salneurria>max){
				max=lista.get(i).Salneurria;
			}
		}
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).Salneurria==max) {
				b.add(lista.get(i));
			}
		}
		return b;
	}
	public ArrayList<artikuloa>ekibalenteak(){
		ArrayList<artikuloa>c=new ArrayList<artikuloa>();
	
		
		return c;
	}
	public double salneurria(String pKodea) {
		boolean encontrado=false;
		int pos=0;
		double pre=0;
		while((!encontrado==false)||pKodea.equals(lista.get(pos).Kodea)){
			if(pKodea.equals(lista.get(pos).Kodea)){
				encontrado=true;
			
			}else{
				pos++;
			}
		}
		
		pre=lista.get(pos).Salneurria;
		return pre;
	}

	public ArrayList<artikuloa>ekibalentea(String kodea){
		ArrayList<artikuloa>d=new ArrayList<artikuloa>();
		double sal=salneurria(kodea);
		for(int i=0;i<lista.size();i++) {
			if(lista.get(i).Salneurria==sal) {
				d.add(lista.get(i));
			}

		}
		return d;
	}
	
}
	

	
