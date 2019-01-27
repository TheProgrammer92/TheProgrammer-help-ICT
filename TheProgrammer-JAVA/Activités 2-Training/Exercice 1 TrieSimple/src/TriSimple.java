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
		
		//completer cette fonction
		
		/*
		 * Information neccessaire :
		 * 
		 * entier= entier entré par l'utilisateur
		 * 
		 * vous pouvez acceder au tableau a l'aide de ""this.tab""
		 * 
		 * this.lastValueTab= derniere valeur du tableau
		 * this.numberInsertTab = nombre d'element inseré dans le tableau
		 * 
		 * 
		 */	
		//parcours du tableau
		
		for (int i = 0; i < this.tab.length; i++) {
			
			//si on a trouvé un element egale a "entier""
			if (this.tab[i]==entier) {
				
				//on sais que this.tab[i] == entier
				//et donc on connais sa position qui es  """i""" dans le tableau
				//votre mission es de trouver un moyen  de retirer entier du tableau 
				//ensuite d'afficher les valeurs du tableau
				
			  
				
				//a completer 
				
			
				return;
			}
		}
		
	
		
		
		
	}
	
	
	
	
	
	
     //affichage des valeur, quand il y'a ajout d'un element
	private void afficheValeurTab (int endValue, int entier) {
		
		
		// TAF ::    completer cette fonction
		
	
		
		/* INFORMATION NECESSAIRES : 
		 * 
		 * endValue= "derniere valeur du tableau
		 * entier = l'entier entré par l'utilisateur
		 * 
		 * 
		 * vous pouvez acceder au tableau a l'aide de  ""this.tab""
		 */
		
	}
	
	//affichage des valeur quand l'element est retiré
	private void afficheValeurTab (int endValue, int entier,int retirer) {
		
		
		System.out.println("Nous avons retire" + entier+ " Affichage des valeur finale du tab");
		
		//completer
		
	}
	
	
	
}
 