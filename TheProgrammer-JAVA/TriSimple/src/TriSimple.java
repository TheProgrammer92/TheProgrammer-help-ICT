import java.util.Iterator;

public class TriSimple {
	
	private int[] tab = new int[100];
	private int lastValueTab = 0;
	private int numberInsertTab=0;
	private int lastCountTab=0;
	private int cobail = 0;

	
	protected void inserer(int entier) {
		
		
		//s'il y'a aucune valeur dans la tableau
	
		
		System.out.println();
		
		if (this.numberInsertTab==0) {
			
			this.tab[0]=entier;
			this.numberInsertTab++;
			this.lastValueTab=entier;
			
			
			
		}
		
		
		else {
			
			int iCount=0;
			
			
			
		
			for (int i =0; i <= this.numberInsertTab+1; i++) {
				
				
				if (entier>tab[i]) {
					
				
					//si on es a la fin du tableau
					if (this.tab[i]==this.lastValueTab) {
						
						
						this.tab[i+1] = entier;
						
						//on reinitialise la derniere valeur du tableau
						this.lastValueTab=entier;
						//nombre d'element inseré dans le tableau
						this.numberInsertTab++;
					
						
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
 