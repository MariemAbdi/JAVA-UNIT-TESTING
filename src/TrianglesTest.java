import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

//TEST CLASS FOR THE CLASS "TRIANGLE"
public class TrianglesTest {
    private Triangles triangles; //CREATING A LIST OF TRIANGLES

    //THIS ANNOTATION IS USED TO DESIGNATE A METHOD THAT SHOULD BE RUN BEFORE EACH TEST METHOOD IN THE TEST CLASS
    //IT'S COMMONLY USED FOR SETTING UP THE INITIAL STATE OR PERFORMING ANY NECESSARY PREPARATIONS THAT ARE REQUIRED FOR EACH TEST
    @Before
    public void setUp() {
        triangles = new Triangles();
    }

	//TESTING THE ADD FUNCTION
    @Test
    public void testAdd() {
        Triangle triangle = new Triangle(14.0f, 30.0f);
        triangles.add(triangle);
        assertEquals(1, triangles.getSize());
    }

	//TESTING THE REMOVE FUNCTION
    @Test
    public void testRemove() {
        Triangle triangle = new Triangle(10.0f, 12.0f);
        triangles.add(triangle);
        triangles.remove(0);
        assertEquals(0, triangles.getSize());
    }

	//TESTING THE FINDBYINDEX FUNCTION (INDEX WITHIN RANGE)
    @Test
    public void testFindByIndex() {
        Triangle triangle1 = new Triangle(6.0f, 9.0f);
        Triangle triangle2 = new Triangle(15.0f, 60.0f);
        triangles.add(triangle1);
        triangles.add(triangle2);

        Triangle foundTriangle = triangles.findByIndex(1);

        assertNotNull(foundTriangle);
        assertEquals(triangle2, foundTriangle);
    }

	//TESTING THE FINDBYINDEX FUNCTION (INDEX OUT OF RANGE)	
    @Test
    public void testFindByIndexOutOfBounds() {
        Triangle triangle = new Triangle(14.0f, 8.0f);
        triangles.add(triangle);

        Triangle foundTriangle = triangles.findByIndex(1);

        assertNull(foundTriangle);
    }
}