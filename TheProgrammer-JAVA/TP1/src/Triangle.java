import java.util.Scanner;

public class Triangle {
		
	
	int nombre = 0;
	
	
		public void afficheTriangle() {
			
			System.out.println("Entrez un nombre de ligne");
			
			Scanner sc= new Scanner(System.in);
			
			
		
			
			
			nombre = sc.nextInt();
			
			
			System.out.println("vous avez choisie " + nombre);
			
			
			
			//parcours de la boucle

			for (int k = 0; k <= nombre; k++)
			{	
				
				//parcours de la boucle pour affichage des espace
				for (int j = 0; j < nombre-k; j++)
					
					//affichage des espace
					System.out.print(" ");
				
				
					//parcours de la boucle pour affichage des etoiles
					for (int i = 0; i < (k*2+1); i++)
						
						System.out.print("*");
					
				
				
				//affichage du dernier espace
				System.out.println("");
				
				
			}
		}
}
