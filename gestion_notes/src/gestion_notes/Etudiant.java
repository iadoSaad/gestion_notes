package gestion_notes;

public class Etudiant implements Comparable<Etudiant> {
	
	private int id;
	private String nom;
	private double note;
	
	public Etudiant(int id,String nom){
		this.id=id;
		this.nom=nom;
		this.note=10;
	}
	
	@Override
	public String toString() {
		return "("+this.nom+":"+note+")";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Etudiant)) return false;
		Etudiant etd=(Etudiant)obj;
		return etd.id==this.id;
	}

	@Override
	public int compareTo(Etudiant o) {
		return Double.compare(this.note,o.note);
	}
	
}
