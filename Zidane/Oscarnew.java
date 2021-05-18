package gui;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Oscarnew extends Oscar {

	 static String n; // difference entre static et les simple primitiv?
	public static void main(String[] args) throws IOException {
      
		Scanner clavier = new Scanner(System.in);
		
		String n;// n et clavier snt ls valeur que lutilisateur va entrer
		 System.out.println("Geben Sie bitte das Wort ein:");
		 n = clavier.nextLine(); // recuperer la valeur
	      n.toLowerCase(); // convertir en miniscul

		 // creer le fichier Java
		 Path path = Paths.get("JavaUebung08","texte.txt");	 
		 String texte = n;
		 Files.write(path, n.getBytes(Charset.forName("ISO-8859-1")));
		 texte.toLowerCase();
		 
		 // condition
		 for (int i= 0; i< n.length(); i++) {
			 
			 switch(n.charAt(i)) {
	    		case ' ' :
	     			System.out.println("Geben Sie ein nur ein ganzalige Wort ein ");
                break;
			 }
		 }
	
	}
	public String getn() {
		return n;

	}


}
