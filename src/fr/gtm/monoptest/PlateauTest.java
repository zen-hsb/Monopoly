package fr.gtm.monoptest;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import fr.gtm.monop.Case;
import fr.gtm.monop.Plateau;

public class PlateauTest {

	@Test
	public void testInitialisationPlateau() throws InstantiationException, IllegalAccessException, ClassNotFoundException, IOException {
		Plateau test = new Plateau();
		assertNotNull(test);
		test.initialisationPlateau();
		int cnt = 0;
		Case c = test.getCaseDepart();
		assertNotNull(c);

		while (c.getNext() != test.getCaseDepart()) {
			if (c.getCouleurCase() != null) {
				System.out.println(c.getNomCase() + " // " + c.getCouleurCase());
			} else {
				System.out.println(c.getNomCase());
			}
			// System.out.println(c);
			c = c.getNext();
			cnt = cnt + 1;

		}
		cnt = cnt + 1;
		if (c.getCouleurCase() != null) {
			System.out.println(c.getNomCase() + " // " + c.getCouleurCase());
		} else {
			System.out.println(c.getNomCase());
		}
		// System.out.println(c);

		assertEquals(40, cnt);

	}

}
