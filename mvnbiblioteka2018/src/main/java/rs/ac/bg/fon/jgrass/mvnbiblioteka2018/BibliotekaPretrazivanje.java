package rs.ac.bg.fon.jgrass.mvnbiblioteka2018;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.interfejs.BibliotekaInterfejs;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.interfejs.BibliotekaInterfejsPretrazivanje;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije.SODodajKnjigu;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije.SOObrisiKnjigu;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije.SOPronadjiKnjigu;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije.SOSacuvajKnjige;
import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije.SOUcitajKnjige;

/**
 * Klasa koja predstavlja Biblioteku sa nekim osnovnim funkcionalnostima.
 * @author Bojan Tomic
 * @version 1.0
 *
 */
public class BibliotekaPretrazivanje implements BibliotekaInterfejsPretrazivanje{

	/**
	 * Lista knjiga dostupnih u biblioteci
	 */
	private LinkedList<Knjiga> knjige = new LinkedList<Knjiga>();
	
	/**
	 * Pronalazi i vraca listu sa svim knjigama iz biblioteke koji odgovaraju upitu.
	 * 
	 * Nem oraju se uneti svi parametri, oni koji budu null se ne uzimaju u razmatranje prilikom pretrage
	 * 
	 * @param autor autor knjige
	 * @param isbn isbn knjige
	 * @param naslov DEO naslova knjige ili ceo naslov knjige
	 * @param izdavac DEO naziva izdavaca ili ceo naziv
	 * 
	 * @return lista sa knjigam koje odgovaraju upitu
	 * 
	 * @throws java.lang.RuntimeException ako su svi parametri null
	 */
	@Override
	public LinkedList<Knjiga> pronadjiKnjigu(Autor autor, String isbn, String naslov, String izdavac) {
		return SOPronadjiKnjigu.izvrsi(autor,
				isbn, naslov, izdavac, knjige);
	}

	/**
	 * Deserijalizuje (ucitava) sve knjige iz fajla i unosi ih u biblioteku.
	 * 
	 * Pre ucitavanja se brise postojeci sadrzaj biblioteke.
	 * 
	 * @param fajl putanja do fajla sa serijalizovanim knjigama.
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void ucitajKnjige(String fajl) {
		knjige = SOUcitajKnjige.izvrsi(fajl);
	}

}
