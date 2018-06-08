package rs.ac.bg.fon.jgrass.mvnbiblioteka2018.sistemskeoperacije;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.LinkedList;

import rs.ac.bg.fon.jgrass.mvnbiblioteka2018.Knjiga;

public class SOUcitajKnjige {
	
	public static LinkedList<Knjiga> izvrsi(String fajl) {
		try(ObjectInputStream in = 
			 new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(fajl)))){
		
			 return (LinkedList<Knjiga>)(in.readObject());
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
	}

}
