
public class InfoPharmacie {
		
	public Ville ville;
	public int nombreVendu;
	public int nombreEmploye;
	
	
	public InfoPharmacie() {
		//initialisation d'une ville
		
		this.ville= new Ville();
		
		this.ville.lieu="";
		
		this.ville.x=0;
		
		this.ville.y=0;
		
		
		//autre informations
		this.nombreEmploye=0;
		this.nombreVendu=0;
	}
	
}
