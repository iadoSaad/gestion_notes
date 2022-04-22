package gestion_notes;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant> {
	@Override
	public boolean add(Etudiant e) {
		int index =indexOf(e);
		if(index<0) return super.add(e);
		this.set(index, e);
		return true;
	}
	
	public List<Etudiant> filtrer(Condition c){
		List<Etudiant> ret=new ListEtudiants();
		for (int i = 0; i < this.size(); i++) {
			Etudiant next = this.get(i);
			if(c.estVrai(next)) ret.add(next);
		}
		return ret;
	}
}
