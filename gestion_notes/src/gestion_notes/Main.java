package gestion_notes;

import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		Etudiant e1,e2,e3;
		e1=new Etudiant(1, "hamid");
		e2=new Etudiant(2, "driss");
		e3=new Etudiant(1, "youssef");
		
		e1.setNote(15); e2.setNote(12);
		e3.setNote(16);
		
		ListEtudiants mesEtudiants =new ListEtudiants();
		mesEtudiants.add(e1); mesEtudiants.add(e2); 
		mesEtudiants.add(e3);
		
		Collections.sort(mesEtudiants);
		System.out.println(mesEtudiants);
		
		List<Etudiant> note13=	mesEtudiants.filtrer(etd -> etd.getNote()<13);
		System.out.println(note13);
		
	}
}
