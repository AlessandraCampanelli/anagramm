package it.polito.tdp.anagram.model;

import java.util.ArrayList;
import java.util.List;

public class Anagram {
	
public List<String> anagrammi (String parola){
	List <String >risultato= new ArrayList <>();
	permuta("",parola,0,risultato);
	return risultato ; 
}
//livello=lunghezza della soluzione parziale
//parziale= stringa che contiene l'anagramma incompleto 
//lettere= le lettere della parola iniziale 


private void  permuta(String parziale,String lettere,int livello,List <String> risultato ) {
	if(lettere.length()==0) {
		//la soluzione parziale è anche la soluzione completa
		risultato.add(parziale);
	}
	else {
		
		//fai ricorsione
		//sottoproblema= una lettera un singolo carattere di lettere
		for(int pos=0;pos<lettere.length();pos++) {
			char tentativo= lettere.charAt(pos);
			String nuovaParziale=parziale+tentativo;
			String nuovaLettere= lettere.substring(0, pos)+lettere.substring(pos+1 );//togli il carattere pos da lettere; // CARARTTERE POS ESCLUSO 
					permuta(nuovaParziale,nuovaLettere,livello+1,risultato);
			//se ho sporcato le variabili backtarcking 
		}
	}
	}
}

