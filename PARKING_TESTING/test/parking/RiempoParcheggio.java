package parking;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class RiempoParcheggio {
	
	@Test
	void testParcheggio() {
	
		//Creo l'oggetto e controllo che non sia nullo
		Parcheggio p = new Parcheggio();
		assertNotNull(p);
		
		//Riempo il parcheggio controllando di non creare nel mentre situazioni di mal riempito
		assertTrue(p.scegliPosto(0));
		assertFalse(p.malRiempito());
		
		assertTrue(p.scegliPosto(1));
		assertFalse(p.malRiempito());
		
		assertTrue(p.scegliPosto(2));
		assertFalse(p.malRiempito());
		
		//Controllo che il parcheggio sia pieno
		assertTrue(p.pieno());
	
	}

}
