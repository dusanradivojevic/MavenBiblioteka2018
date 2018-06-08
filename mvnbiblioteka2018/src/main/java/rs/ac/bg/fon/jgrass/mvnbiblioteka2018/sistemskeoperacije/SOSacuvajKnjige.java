package rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.Knjiga;

public class SOSacuvajKnjige {

	public static void izvrsi(String fajl, 
			LinkedList<Knjiga> knjige){
		try(ObjectOutputStream out = 
				 new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(fajl)))){
			
				out.writeObject(knjige);
			}
			catch(Exception e) {
				throw new RuntimeException(e);
			}
	}
	
}
