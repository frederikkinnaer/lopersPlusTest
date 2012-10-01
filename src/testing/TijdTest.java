package testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Tijd;

public class TijdTest {

	@Before
	public void setUp() throws Exception {
	}
	
	@Test
	public void test_Constructor1param_Aanvaard_GeldigeWaarde() {
		Tijd tijd = new Tijd(10,20,30);
		assertEquals(10,tijd.getUur());
		assertEquals(20,tijd.getMinuut());
		assertEquals(30,tijd.getSeconde());
	}

	@Test
	public void testTijdIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testVerhoogTijd() {
		fail("Not yet implemented");
	}

}
