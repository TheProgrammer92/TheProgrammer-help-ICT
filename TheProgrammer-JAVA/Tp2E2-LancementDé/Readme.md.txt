Exercice 2 :
	
Cr�ez par une classe mod�lisant le lancement d'un des a plusieurs faces.
Un des sera repr�sent� par son nombre de faces et la valeur de sa face visible. Il pourra �tre
cr��, lance, et il pourra afficher la valeur de sa face visible.
Compl�ter la classe Des ci-dessous :
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

En �crivant :
1. Un constructeur dont l'argument est un entier indiquant le nombre de faces du des ;
2. Une m�thode lancer qui simule le lancement du des en donnant une nouvelle valeur
� la face visible du des ; la nouvelle valeur sera tir�e al�atoirement;
3. Une m�thode ajouter qui renvoie la somme des faces visibles de 2 des ;
4. Une m�thode qui permet de transformer un des en une chaine de caract�res, ceci afin
de pouvoir l'afficher � l'�cran (vous afficherez la valeur de la face visible).
rndication : Pour g�n�rer une valeur al�atoire, vous pouvez utiliser la m�thode
java.lang.Math.random(), sur laquelle vous trouverez des indications dans la documentation de
l'API.