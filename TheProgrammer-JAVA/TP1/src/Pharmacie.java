
import java.util.Iterator;
import java.util.Scanner;

public class Pharmacie {
		
	
	public int nombrePhar;
	//generation d'un tableau de pharmacie
	public InfoPharmacie[] infoPharmacie;
	Scanner sc= new Scanner(System.in);
	public int cobail;
	
	
	public void lirePharmacie() {
		int count= 1;
		
		System.out.println("Veuillez entrez le nombre de pharmacies");
		
		nombrePhar =sc.nextInt();
		
		
		//initialisation du tableau contenant les info de la pharmacie
		
		this.infoPharmacie = new InfoPharmacie[nombrePhar];
		
		
		
		System.out.println("Veuillez entre les informations des " + nombrePhar + "   pharmacies");
		
		
		for (int i = 0; i < nombrePhar; i++) {
			
			

			try {
				//generation de la pharmaci de cet instance
				this.infoPharmacie[i] = new InfoPharmacie();
				
				sc.nextLine();
				
				System.out.println(" Entrez le lieu de la pharmacie " + count);
			
		
				this.infoPharmacie[i].ville.lieu=sc.nextLine();
				
				System.out.println("Entrez la coordonné x de la pharmacie" + count);
				
				this.infoPharmacie[i].ville.x=sc.nextInt();
				
				System.out.println("Entrez la coordonné y de la pharmacie"+ count);
				
				this.infoPharmacie[i].ville.y=sc .nextInt();
				 
			
				
				System.out.println("Entrez le nombre vendu");
				this.infoPharmacie[i].nombreVendu = sc.nextInt();
				
				
				System.out.println("Entrez le nombre employe");
				this.infoPharmacie[i].nombreEmploye = sc.nextInt();
//				
			
				
				count++;
				
			}
			catch(Exception e) {
				
				System.out.println(e.getMessage());
			}
			
		}
		
	
		
		
		System.out.println("fin de la boule premiere");
		
		
		for (int i = 0; i < nombrePhar; i++) {
				System.out.println("information de la pharmacie " + (i+1));
				System.out.println();
			  System.out.println("lieu ville = " + infoPharmacie[i].ville.lieu + "  ");
			  System.out.println("coordonnee x = " + infoPharmacie[i].ville.x + "  ");
			  System.out.println("coordonne y  = " + infoPharmacie[i].ville.y);
			  System.out.println("nombre vendu =" + infoPharmacie[i].nombreVendu);
			  System.out.println("nombre employe =" + infoPharmacie[i].nombreEmploye);
			  
			  System.out.println();
			
		}
	 
		
	}
	
	
	
//	public void demandeCoordonnee() {
//		
//	
//		Ville point = new Ville();
//		InfoPharmacie pharmacie = new InfoPharmacie();
//		
//		do {
//			
//			
//			for (int i = 0; i < infoPharmacie.length; i++) {
//				
//				
//				//recherche du plus grand 
//				
//				
//				int max_valX=Integer.MAX_VALUE; // celui qui compte le plus grand
//				
//				int min_valY = Integer.MIN_VALUE; // celui qui compte le plus petit
//				
//				
//					for (InfoPharmacie tab:infoPharmacie) {
//						
//						
//						for (int k = 0; k < infoPharmacie.length; k++) {
//							
//							if (infoPharmacie[k].ville.x<max_valX) {
//								max_val=
//								
//							}
//							
//						}
//					
//					
//					
//					for (new InfoPharmacie phar:tab) {
//							
//						
//						//s'il es inferieur a max_val
//						 if(tab[j] <max_val) {
//							 max_val=tab[j];
//							 
//						 }
//						 
//						 if(tab[j]> min_val) {
//							 
//							 min_val=tab[j];
//						 }
//						
//						 
//						 
//					}
//					
//					}
//			}
//			
//			
//		} while (point.x!=0 && point.y!=0);
//		
//		
//		
//	}


	
}
