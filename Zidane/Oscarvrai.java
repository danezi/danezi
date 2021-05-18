package gui;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Oscarvrai extends Oscarnew{
	public static void main(String[] args) throws FileNotFoundException {
		double wert;
		String stockage =" ";

		String nomDuFichier = "JavaUebung08\\texte.txt";
	File file = new File(nomDuFichier);
	Scanner n = new Scanner(file);
	String eingabe  = n.next();
	while(n.hasNextLine()) {
		String line = n.nextLine();
	}
	
		   eingabe.length() ;  // remplacer n par eingabe la valeur donner au premier code oscar
		      Double c = Double.valueOf(eingabe.length());
		  
		  String l; 
		    l =  JOptionPane.showInputDialog("Geben Sie die lange des Wortes ein ");
		    
		    wert = Double.parseDouble(l); // wert la valeur que lutilisateur va entrer
	               if ( c == wert ) {
	   	   	    	System.out.println(" gut!!! gefunden ");	  
	   	   	    	}
	           else {
	   	   	    	System.out.println(" Falsch!!!  nochmal bitte ");	  
	           }
	      
		for(int i= 0 ; i < eingabe.length(); i++) {
			
			 Scanner LaLettre = new Scanner(System.in);
		System.out.println("Geben Sie  die Buchstaben ein ");
		
				   String lettre = LaLettre.nextLine(); // recuperer la valeur
//				      lettre.toLowerCase();  // CONVERTIR EN MINI

				   char z = lettre.charAt(0);
		    	    
				   
				   if( z == eingabe.charAt(i)) {
						System.out.println("gut gefunden COOL NEXT " + i + " Buchstaben eingeben");


					   stockage = stockage +  eingabe.charAt(i);
		   

					   
				 
			
		 	System.out.println("Das Wort ist" + " " +  stockage  ); 
		


			
				   }

		          else  {
			     	System.out.println("Falsch!! Wiederholen Sie bitte !"); 
                break;
			 }
        }  
	               
	               

	             //  Continuer bien joue zidane
	               
	               
}
}