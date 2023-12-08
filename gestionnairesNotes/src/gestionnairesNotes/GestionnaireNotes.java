package gestionnairesNotes;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionnaireNotes implements Services {
	
	private static ArrayList<Etudiant> etudiants = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
	
	

	public static void main(String[] args) {
		
		GestionnaireNotes gestionnaireNotes = new GestionnaireNotes();
		
		 while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1: Saisir les notes d'un étudiant");
	            System.out.println("2: Calculer  la moyenne");
	            System.out.println("3: Quitter");
	            System.out.print("Faites votre choix : ");

	            int choix = scanner.nextInt();

	            switch (choix) {
	                case 1:
	                    gestionnaireNotes.ajout();
	                    break;
	                case 2:
	                	gestionnaireNotes.calculMoyenne();
	                    break;
	                case 3:
	                    System.out.println("Programme terminé.");
	                    System.exit(0);
	                default:
	                    System.out.println("Choix invalide. Veuillez réessayer.");
	            }
	        }
	    }
	@Override
	   public void ajout() {
	        System.out.print("\nEntrez le nom de l'étudiant : ");
	        String etudiantName = scanner.next();
	        

	        Etudiant etudiant = rechercherEtudiant(etudiantName);

	        if (etudiant == null) {
	        	etudiant = new Etudiant(etudiantName);
	        	etudiants.add(etudiant);
	        }
	        int i=0; int nbrMatieres = etudiant.getNotesMatieres().size();
	        
	                
	        
	        while (true && i<nbrMatieres) {
	        	System.out.println(etudiant.getNotesMatieres().get(i).getMatiere()+" : Saisissez des notes (entre 0 et 20). Entrez une note négative pour terminer.");
	            System.out.print(" Entrez une note : ");
	            double note = scanner.nextDouble();
	            
	            if (note < 0) {
	            	if(i<nbrMatieres) {
	            	i++;
	            
	                } else break;
	            } 
	            

	            if (NoteValide(note) ) {
	            	
	                etudiant.addNote2(note, etudiant.getNotesMatieres().get(i).getMatiere());
	            } else if(note > 20){ 
	            	System.out.println("Note invalide. Veuillez réessayer.");
	            
	                
	            }
	            
	        }
	    }
	   @Override
	   
	   public void calculMoyenne() {
	        System.out.print("\nEntrez le nom de l'étudiant : ");
	        String etudiantName = scanner.next();

	        Etudiant etudiant = rechercherEtudiant(etudiantName);

	        if (etudiant == null) {
	            System.out.println("Étudiant non trouvé. Veuillez réessayer.");
	            return;
	        }

	        System.out.println("Calcul de la moyenne pour quelles matières ?");
	       // ArrayList<Double> notes = etudiant.getNotes();
	        ArrayList<Note> notes = etudiant.getNotesMatieres();
	        
	        System.out.println("0. Moyenne générale");

	        for (int i = 0; i < notes.size(); i++) {
	          
	        	System.out.println((i + 1) + ". Matiere : " + notes.get(i).getMatiere());
	        }

	        System.out.println(" tabl matieres notes : ");
	       notes.forEach(e-> System.out.println(e.getMatiere()+" : "+e.getNotes()));

	        System.out.print("Choix : ");
	        int choice = scanner.nextInt();

	        if (choice == 0) {
	            System.out.println("Moyenne générale : " + etudiant.calculMoyenne2());
	        } else if (choice > 0 && choice <= notes.size()) {
	            System.out.println("Moyenne pour la matière " + choice + " : " + etudiant.calculMoyenneParMatiere(choice - 1));//notes.get(choice - 1));
	        } else {
	            System.out.println("Choix invalide. Veuillez réessayer.");
	        }
	    }

	    
	   private static Etudiant rechercherEtudiant(String name) {
	        for (Etudiant etudiant : etudiants) {
	            if (etudiant.getNom().equalsIgnoreCase(name)) {
	                return etudiant;
	            }
	        }
	        return null;
	    }
	    
	   private static boolean NoteValide(double note) {
	        return note >= 0 && note <= 20;
	    }
	    
		
		

}