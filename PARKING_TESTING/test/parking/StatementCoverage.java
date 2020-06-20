package parking;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class StatementCoverage {
	
	@Test
	void testStatement() {
	
		//Creo l'oggetto e controllo che non sia nullo
		Parcheggio p = new Parcheggio();
		assertNotNull(p);
		
		//Controllo che il garage non sia pieno
		assertFalse(p.pieno());
		
		//Scelgo un posto che non esiste
		assertFalse(p.scegliPosto(3));
		
		//Lo riempo male con un auto nel posto 2 e il resto vuoto, poi libero
		assertTrue(p.scegliPosto(2));
		assertTrue(p.malRiempito());
		assertTrue(p.scegliPosto(2));
		
		//Lo riempo male con un auto nel posto 1 e posto 0 vuoto, poi libero
		assertTrue(p.scegliPosto(1));
		assertTrue(p.malRiempito());
		assertTrue(p.scegliPosto(1));
		
		//Riempo il parcheggio controllando di non creare nel mentre situazioni di mal riempito
		assertTrue(p.scegliPosto(0));
		assertFalse(p.malRiempito());
		
		assertTrue(p.scegliPosto(1));
		assertFalse(p.malRiempito());
		
		//Stampo lo stato intermedio del garage
		assertEquals(p.toString(), "**O");
		
		assertTrue(p.scegliPosto(2));
		assertFalse(p.malRiempito());
		
		//Controllo che il parcheggio sia pieno
		assertTrue(p.pieno());
	
	}

}
