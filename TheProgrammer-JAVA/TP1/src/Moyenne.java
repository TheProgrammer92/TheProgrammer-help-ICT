import java.util.Scanner;

public class Moyenne {
	
	
		int n = 0;
	
		Scanner sc= new Scanner(System.in);
		
		public void affiche() {
			int nbre= 0;
			System.out.println("Entrez le nombre n");
			//recuperation du  nombre
			n = sc.nextInt();
			
			
			float tab[] = new float[n];
			
			// lecture des n valeurs flottantes;
			
			
			System.out.println("veuillez entrer les valeur flottantes");
			
			for (int i = 0; i < tab.length; i++) {
				
				
				//lecture du nombre
				nbre=sc.nextInt();
				
				//on l'insere dans le tableau
				tab[i]=nbre; 
				
			}
			
			//affichage des valeur du tableau
			for (int j = 0; j < tab.length; j++) {
			
				System.out.println(tab[j]);
			}
			
			bigSmallMoyenne(tab);
			
			
		}
		
		
		public void bigSmallMoyenne(float tab[]) {
			
			float max_val=Float.MAX_VALUE; // celui qui compte le plus grand
			
			float min_val = Float.MIN_VALUE; // celui qui compte le plus petit
			
			float moyenne;
			
			float somme=0;
			
				for (float nombre:tab) {
				
				// calcule de la somme pour calculer la moyenne a la fin
				somme = somme+nombre;
				for (int j = 0; j < tab.length; j++) {
						
					
					//s'il es inferieur a max_val
					 if(tab[j] <max_val) {
						 max_val=tab[j];
						 
					 }
					 
					 if(tab[j]> min_val) {
						 
						 min_val=tab[j];
					 }
					
					 
					 
				}
				
				}
			moyenne=somme/tab.length;
			//affichage des valeur
			System.out.println(" La valeur minimale es " + max_val);
			System.out.println("La valeur max es " + min_val);
			
			System.out.println("la moyenne es " + moyenne );
			
			
			
		}
				
				
}
