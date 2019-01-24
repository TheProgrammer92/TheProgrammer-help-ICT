Exercice 2 :
	
Créez par une classe modélisant le lancement d'un des a plusieurs faces.
Un des sera représenté par son nombre de faces et la valeur de sa face visible. Il pourra être
créé, lance, et il pourra afficher la valeur de sa face visible.
Compléter la classe Des ci-dessous :
public class Des {
// definition des variables de classe
// constructeur d'un des avec argument
// methode qui simule le lancement d'un des
// methode qui revoie la somme des faces visibles de deux des
// methode affiche la valeur de sa face visible
}
public class Essai{
public static void main(String[] args) {
Des a = new Des(6);
Des b = new Des(20);
a.lancer(); a.afficher() ; b.lancer();
int res = a.ajouter(b);
System.out.println(res);
}
}

En écrivant :
1. Un constructeur dont l'argument est un entier indiquant le nombre de faces du des ;
2. Une méthode lancer qui simule le lancement du des en donnant une nouvelle valeur
à la face visible du des ; la nouvelle valeur sera tirée aléatoirement;
3. Une méthode ajouter qui renvoie la somme des faces visibles de 2 des ;
4. Une méthode qui permet de transformer un des en une chaine de caractères, ceci afin
de pouvoir l'afficher à l'écran (vous afficherez la valeur de la face visible).
rndication : Pour générer une valeur aléatoire, vous pouvez utiliser la méthode
java.lang.Math.random(), sur laquelle vous trouverez des indications dans la documentation de
l'API.