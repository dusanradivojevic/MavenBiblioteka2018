package rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije;

import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.Autor;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.Knjiga;

public class SOPronadjiKnjigu {
	
	public static LinkedList<Knjiga> izvrsi(Autor autor, 
			String isbn, String naslov, String izdavac,
			LinkedList<Knjiga> knjige) {
		
		if (naslov == null && autor==null && isbn==null && izdavac==null)
			throw new RuntimeException("Morate uneti bar neki parametar");

		LinkedList<Knjiga> novaLista = new LinkedList<Knjiga>();
		
		for (int i=0;i<knjige.size();i++)
			if (knjige.get(i).getNaslov().contains(naslov))
				novaLista.add(knjige.get(i));
		
		return novaLista;
	}
}
