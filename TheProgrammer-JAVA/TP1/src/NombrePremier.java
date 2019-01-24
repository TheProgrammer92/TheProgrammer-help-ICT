import java.util.Scanner;

public class NombrePremier {
	
	int tab[] = new int[100];
	
	int numberOfPremier=0;
	int countTab=0;
	
	public void nombrePremier () {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Entrez le nombre n ");
		
		
		//recuperation du nombre
		numberOfPremier= sc.nextInt();		
		
		
		//parcours de la boucle , 
		for (int i=1; i <= numberOfPremier; i++) {
			
			int count = 0;
			
			
			//traitement du nombre on veut regarder, si  i a cette instant es premier
			
			for (int k = 1; k <=i; k++) {
				
				
				
				if(i%k==0) {
					
				
					count ++;
				}
				
				
				
				
			}
			
			
			//si on a trouvé deux nombres qui le divisent
			
			if(count==2) {
				
				
				//alors il es premier
				//on remplis le tableau
				
				tab[countTab]= i*i;
				
				
				countTab++;
				
				
			
			}
		
		}
		
		
		// fin
		
		System.out.println("Affichage des valeurs");
		
		//affichage du tableau
		for (int j = 0; j < countTab; j++) {
			
			System.out.println(tab[j]);
		}
		
		
		
	}

}
