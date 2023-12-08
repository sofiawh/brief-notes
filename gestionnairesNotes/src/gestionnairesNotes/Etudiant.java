package gestionnairesNotes;

import java.util.ArrayList;

public class Etudiant {	
	
	private String nom;
	//private ArrayList<Double> notes;
	private ArrayList<Note> notesMatieres;
	//private HashMap<String, String> capitalCities = new HashMap<String, String>();
	
	public Etudiant(String nom) {
		super();
		this.nom = nom;
		Note noteMatiere1 = new Note("Francais", new ArrayList<Double>());
		this.notesMatieres= new ArrayList<Note>();
		this.notesMatieres.add(noteMatiere1);
		Note noteMatiere2 = new Note("Anglais", new ArrayList<Double>());
		this.notesMatieres.add(noteMatiere2);
		Note noteMatiere3 = new Note("JAVA", new ArrayList<Double>());
		this.notesMatieres.add(noteMatiere3);
		
				}
//	public Etudiant(String nom) {
//		super();
//		this.nom = nom;
//		this.notes = new ArrayList<>();
//	}
	
	public ArrayList<Note> getNotesMatieres() {
		return notesMatieres;
	}

	public void setNotesMatieres(ArrayList<Note> notesMatieres) {
		this.notesMatieres = notesMatieres;
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}/*
	public ArrayList<Double> getNotes() {
		return notes;
	}*/
	/*
	public void setNotes(ArrayList<Double> notes) {
		this.notes = notes;
	}*/
	/*
	public void addNote(double note) {
		notes.add(note);
	}*/
	public void addNote2(double note, String matiere) {
		
		for(Note e: notesMatieres) {
			if(e.getMatiere().equals(matiere)) {
				e.getNotes().add(note);
			}
		}
		
	}
	/*
	public double calculMoyenne() {
        if (notes.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.size();
    }
	*/
	public double calculMoyenne2() {
		
        if (notesMatieres.isEmpty()) {
            return 0.0;
        }
        double sum = 0; int nbrNotes = 0;
        for (Note note : notesMatieres) {
        	
        	for(Double n:note.getNotes()) {
        		sum += n;
        		nbrNotes++;
        	}
            
        }
        return sum / nbrNotes++;
    }
	
public double calculMoyenneParMatiere(int matiere) {
		
        if (notesMatieres.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        
      ArrayList<Double> notesParMatiere = notesMatieres.get(matiere).getNotes();
        
        	
        	for(Double n:notesParMatiere) {
        		
        		sum += n;
        		
        	}
            
        
        return sum / notesParMatiere.size();
    }
//	private String firstName;
//	private String lastName;
//	private ArrayList<Note> notes;
//	
//	
//	public Etudiant(String firstName, String lastName, ArrayList<Note> notes) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.notes = notes;
//	}
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public ArrayList<Note> getNotes() {
//		return notes;
//	}
//	public void setNotes(ArrayList<Note> notes) {
//		this.notes = notes;
//	}
//	
//	
	

}
