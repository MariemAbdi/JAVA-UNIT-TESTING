public class Triangle {
	private float base;
	private float hauteur;
	
	//CONSTRUCTOR
	public Triangle(float base, float hauteur) {
		super();
		this.base = base;
		this.hauteur = hauteur;
	}
	
	//GETTERS AND SETTERS
	public float getBase() {
		return base;
	}
	
	public void setBase(float base) {
		this.base = base;
	}
	
	public float getHauteur() {
		return hauteur;
	}
	
	public void setHauteur(float hauteur) {
		this.hauteur = hauteur;
	}
	
	//CALCULATING THE TRAINGLE'S SURFACE
	public float surface (){
		return ((base * hauteur)/2);
	}
	
	//CALCULATING THE TRIANGLE'S PERIMETER
	public float perimetre (){
		double hypothenuse = Math.sqrt((base * base)+(hauteur * hauteur));
		return (float) (base + hauteur + hypothenuse);
	}
}
