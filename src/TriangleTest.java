import static org.junit.Assert.*;

import org.junit.Test;

//TEST CLASS FOR THE CLASS "TRIANGLE"
public class TriangleTest {

	//TESTING THE SURFACE FUNCTION (SIMPLE)
	@Test(timeout = 100) //TIMEOUT IN MILLISECONDS (THE RESPONSE SHOULD BE IN LESS THAN 0.1 SECOND)
    public void testSurface() {
        Triangle triangle = new Triangle(20.0f, 5.0f);
        assertEquals(50.0f, triangle.surface(), 0.001f);
    }

    //TESTING THE PERIMETRE FUNCTION
    @Test
    public void testPerimetre() {
        Triangle triangle = new Triangle(6.0f, 8.0f);
        assertEquals(24.0f, triangle.perimetre(), 0.001f);
    }
}

