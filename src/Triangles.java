import java.util.ArrayList;
import java.util.List;

public class Triangles {
    private List<Triangle> triangles; //LIST PF TRIANGLES

    //CONSTRUCTOR 
    public Triangles() {
        triangles = new ArrayList<>();
    }

    //ADD TRIANGLE TO THE LIST
    public void add(Triangle triangle) {
        triangles.add(triangle);
    }

    //REMOVE TRIANGLE FROM LIST
    public void remove(int index) {
        if (index >= 0 && index < triangles.size()) {
            triangles.remove(index);
        }
    }
    
	//GETTING THE LIST'S SIZE (GOING TO BE USEFUL LATER WHEN WE WANT TO TEST WHETEHER THE TRIANGLES WERE INSERTED/REMOVED)
    public int getSize() {
    	return this.triangles.size();
    }

    //GET TRIANGLE BY ITS INDEX IF IT EXISTS WITHIN THE EXISTING RANGE
    public Triangle findByIndex(int index) {
        if (index >= 0 && index < triangles.size()) {
            return triangles.get(index);
        }
        return null;
    }
}
