import java.util.Iterator;

public class TriSimple {
	
	private int[] tab = new int[100];
	// lasValueTab nous permettra de connaitre la derniere valeur du tableau
	private int lastValueTab = 0;
	
	//nombre d'element inserés dans le tableau
	private int numberInsertTab=0;

	
	protected void inserer(int entier) {
		
		
		//s'il y'a aucune valeur dans la tableau
	
		
		System.out.println();
		
		
		//si on tente d'inserer qu'il n'y a aucune valeur dans le tableau
		// donc  this.numberInsertTab === 0
		//on inserer l'element a la position 0
		if (this.numberInsertTab==0) {
			
			this.tab[0]=entier;
			this.numberInsertTab++;
			this.lastValueTab=entier;
			
			
			
		}
		
		
		// s'il y'a au moins une valeur dans le tableau
		
		else {
			
			int iCount=0;
			
			
			
			// parcours, du tableau jusqu'au derniere element inseré + 1
			for (int i =0; i <= this.numberInsertTab+1; i++) {
				
				
				// si a cet instant l'entier entré es superieur a tab[i] ,l'elément actuel dans le tableau
				if (entier>tab[i]) {
					
				
					//si on es a la fin du tableau
					
					if (this.tab[i]==this.lastValueTab) {
						
						//Et qu'on a trouvé au cun element qui es inferieur a entier
						
						//alors, ici la case suivant vide du tableau , on l'affecte entier
						this.tab[i+1] = entier;
						
						//on reinitialise la derniere valeur du tableau , a entier ^^
						this.lastValueTab=entier;
						
						//nombre d'element inseré dans le tableau
						this.numberInsertTab++;
					
						//on appelle la fonction qui affiche les valeur definie juste en bas
						this.afficheValeurTab(entier,entier);
						
						
						return;
						
					}
					
					
				}
				
				//si entier es inferieur a l'element dans le tableau
				//on fais un decalage et on remplace l'element
				
				else {
					
					
					i++;
					
					
					//on essaye de prendre l'element et les mettre dans les case suivente
					// tout en laissant la case actuel vide
					//last value tab prendra la derniere valeur
					
					for (int j = i; j <=this.numberInsertTab; j++) {
						this.tab[j]=this.tab[j-1];
						this.lastValueTab=this.tab[j-1];
					}
				
					this.tab[i-1]=entier;
					this.numberInsertTab++;
				
					
					
					
					
					
					
					this.afficheValeurTab(this.lastValueTab,entier);
				
					
					
				}
				
				
				
			
			}
			
			
		}
		
			
		
	
		
	}
	
	public void retirer(int entier) {
		
		for (int i = 0; i < this.tab.length; i++) {
			
			
			if (this.tab[i]==entier) {
				
				for (int j = i; j <=this.numberInsertTab; j++) {
//					System.out.println("j= "+ 5+ " et numerfinal = " + this.numberInsertTab);
					this.tab[j]=this.tab[j+1];
					
				}
				
				this.afficheValeurTab(this.lastValueTab,entier,1);
				return ;
			}
		}
		
	
		
		
		
	}
	
     private void afficheValeurTab (int endValue, int entier,int retirer) {
		
		
		System.out.println("Nous avons retire" + entier+ " Affichage des valeur finale du tab");
		for (int j : this.tab) {
			
			//si on es a la derniere valeur
			if (j==endValue) {
				System.out.print(j + "");
				System.out.println();

				return;
				
			}
			System.out.print(j + "");
			
		}
		//on va a la ligne
		System.out.println();
		
		System.out.println();
	}
	
	private void afficheValeurTab (int endValue, int entier) {
		
		
		System.out.println("insertion de " + entier+ " Affichage des valeur finale du tab");
		for (int j : this.tab) {
			
			//si on es a la derniere valeur
			if (j==endValue) {
				System.out.print(j + " ");
				System.out.println();

				return;
				
			}
			System.out.print(j + " ");
			
		}
		//on va a la ligne
		System.out.println();
		System.out.println();
	}
	
	
	
	
	
}
 