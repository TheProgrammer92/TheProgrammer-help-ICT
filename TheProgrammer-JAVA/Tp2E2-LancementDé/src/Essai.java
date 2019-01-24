
public class Essai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			
			Des a = new Des(6);
			Des b = new Des(20);
		
			
			a.Lancer();
			a.afficher();
			b.Lancer();
			
			int res= a.ajouter(b);
			
			
			System.out.println("la somme des deux des  es: " + res);
	}

}
