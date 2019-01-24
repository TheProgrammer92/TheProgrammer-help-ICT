import java.util.Random;

public class Des {
	
	//definition des variables
	
	
	//nombre de face du des..
	private int nombre_de_face=0;
	private int face_visible_des;
	
	
	
	//contructeur
	public Des(int nombre_de_face) 
	{
		//initialisation du nombre de face
		this.nombre_de_face = nombre_de_face;
		
	}
	
	//methode si simule le lancement d'un Des
	
   
	
	public void Lancer() {
		System.out.println("Lancement du dé");
		System.out.println();
		
		
		Random random = new Random();
		
		//generation d'un nombre aleatoire entre 0.0 et 1.0
		//Math.ceil renvoie l'entier le plus proche superieur ou egale a l'argument
		//random.nextInt genere un nombre aleatoire entre  0
		int newFace=(int)( Math.ceil(Math.random())+random.nextInt(this.nombre_de_face-1));
		//on s'arrange a ce que la valeur qui es tiré ne sois jamais egale a this.nombre_de_face
		this.setFace_visible_des(newFace);
		
		
	
	}
	
	
	
	//affichage de la valeur de la face visible
	public String afficher() {
		
		String transform_des= Integer.toString(this.getFace_visible_des());
		
		System.out.println("La face visible du des est : " + this.getFace_visible_des());
		
		return transform_des;
	}
	
	
	public int ajouter(Des des) {
		
		int sommes_face_visible;
		//appell du getters getFace_visible_des qui  nous renvois la valeur de la face visible
		sommes_face_visible = this.getFace_visible_des() + des.getFace_visible_des();
		
		return sommes_face_visible;
	}
	
	
	
	//des getters et setters pour recuperer les faces visibles du des qui sont en mode private
	public int getFace_visible_des() {
		return face_visible_des;
	}

	public void setFace_visible_des(int face_visible_des) {
		this.face_visible_des = face_visible_des;
	}
	
	
}
