package gestion_notes;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<Etudiant> {
	@Override
	public boolean add(Etudiant e) {
		int index =indexOf(e);
		if(index<0) return super.add(e);
		this.set(index, e);
		return true;
	}
}
