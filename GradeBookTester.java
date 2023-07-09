import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook gbook1 = new GradeBook(5),gbook2 = new GradeBook(5);
	@BeforeEach
	void setUp() throws Exception {
		
		gbook1.addScore(4.9);
		gbook1.addScore(48.9);
		gbook2.addScore(3.9);
		gbook2.addScore(2.9);
		
		
		
		
	}

	@AfterEach
	void tearDown() throws Exception {
		 gbook1 = null;gbook2 = null;
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
		
	}

	@Test
	void testToStringDoubleArray() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {
		assertTrue(gbook1.toString()=="4.9 48.9");
		assertTrue(gbook2.toString()=="3.9 2.9");
		assertEquals(2,gbook1.getScoreSize(),.1);
		assertEquals(2,gbook2.getScoreSize(),.1);

	}

	@Test
	void testSum() {
		assertEquals(53.8,gbook1.sum(),.1);
		assertEquals(6.8,gbook2.sum(),.1);

			}

	@Test
	void testMinimum() {
		assertEquals(gbook1.minimum(),4.9,.001);
		assertEquals(gbook2.minimum(),2.9,.001);

	}

	@Test
	void testFinalScore() {
		assertEquals(44.0,gbook1.finalScore(),.001);
		assertEquals(1.0,gbook2.finalScore(),.001);
	}

}
