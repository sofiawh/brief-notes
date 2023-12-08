package gestionnairesNotes;

import java.util.ArrayList;
import java.util.List;

public class Note {
	
	private String matiere;
	private ArrayList<Double> notes;
	
	public Note() {
		super();
		
		// TODO Auto-generated constructor stub
	}
	public Note(String matiere, ArrayList<Double> notes) {
		super();
		this.matiere = matiere;
		this.notes = notes;
	}
	public String getMatiere() {
		return matiere;
	}
	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}
	public ArrayList<Double> getNotes() {
		return notes;
	}
	public void setNotes(ArrayList<Double> notes) {
		this.notes = notes;
	}
	public void addNoteToMatiere(double note) {		
		this.notes.add(note);
	}
	
//	
//	
//	public Note() {
//		super();
//		
//	}
//	public String getMatiere() {
//		return matiere;
//	}
//	public void setMatiere(String matiere) {
//		this.matiere = matiere;
//	}
//	public ArrayList<Double> getNotes() {
//		return notes;
//	}
//	public void setNotes(ArrayList<Double> notes) {
//		this.notes = notes;
//	}
//	
//	

}
