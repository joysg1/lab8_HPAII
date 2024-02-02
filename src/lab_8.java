import java.util.Scanner;
import java.util.Arrays;
public class lab_8 {

	public static void main(String[] args) {
		Integer dis[]= {1,2,3,4,5};
		Integer ca[]= {194,180,221,432,820};
		Integer cb[]= {48,20,90,50,61};
		Integer cc[]= {206,320,140,821,946};
		Integer cd[]= {45,16,20,14,18};
		res(dis,ca,cb,cc,cd);
		
		
		

	}
	
	
	public static void res(Integer dis[], Integer ca[], Integer cb[], Integer cc[], Integer cd[]) {
		int i,suma=0,sumb=0,sumc=0,sumd=0,total;
		double pa,pb,pc,pd;
		
		System.out.println("Distrito   Candidato A    Candidato B   Candidato C   Candidato D");
		for(i=0; i<dis.length && i<ca.length && i<cb.length && i<cc.length && i<cd.length; i++) {
			System.out.println("   " + dis[i] +"           "+ ca[i]+ "             "+cb[i]+"           "+cc[i]+"           "+cd[i]);
			
		}
		System.out.println("");
		
		
		for(i=0; i<ca.length && i<cb.length && i<cc.length && i<cd.length; i++) {
			suma=suma+ca[i];
			sumb=sumb+cb[i];
			sumc=sumc+cc[i];
			sumd=sumd+cd[i];
		}
		total=suma+sumb+sumc+sumd;
		
		System.out.println("");
		System.out.println("Total de votos emitidos: "+total);
		System.out.println();
		pa=(suma*100)/total;
		pb=(sumb*100)/total;
		pc=(sumc*100)/total;
		pd=(sumd*100)/total;
		System.out.println("Votos Totales por candidato");
		System.out.println("");
		System.out.println(+pa + "%" + "    Total Votos Candidato A: "+suma);
		System.out.println(+pb + "% " + "    Total Votos Candidato B: "+sumb);
		System.out.println(+pc + "%" + "    Total Votos Candidato C: "+sumc);
		System.out.println(+pd + "% " + "    Total Votos Candidato D: "+sumd);
		System.out.println("");
		
		if(pa>50) {
			System.out.println("El Candidato A con el "+pa +"%"+ " ha ganado las elecciones.");
			System.out.println("");
		}
		
		else if(pb>50) {
			System.out.println("El Candidato B con el "+pb +"%"+ " ha ganado las elecciones.");
			System.out.println("");
		}
		
		else if(pc>50) {
			System.out.println("El Candidato C con el "+pc +"%"+ " ha ganado las elecciones.");
			System.out.println("");
		}
		
		else {
			System.out.println("El Candidato D con el "+pd +"%"+ " ha ganado las elecciones.");
			System.out.println("");
		}
		
		
	    
		
		
		
		
		
		
	}

}
