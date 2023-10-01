import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

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
	
	//CALCULATING THE TRAINGLE'S SURFACE (SIMPLY)
	public float surface (){
		return ((base * hauteur)/2);
	}
	
	//CALCULATING THE TRAINGLE'S SURFACE (USING A CERTAIN API)
	/*public float surface() {
        //MAKE AN HTTP GET REQUEST TO API
        try {
            //CREATING URL FOR THE API
            String apiUrl = "https://rapidapi.com/abrahaelill-GRIsGuS-TSY/api/math7/surface";
            String queryParameters = "?base=" + base + "&hauteur=" + hauteur;
            URL url = new URL(apiUrl + queryParameters);

            //MAKE A CONNECTION WITH API
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("X-RapidAPI-Key", "YOUR_API_KEY"); // Replace with your API key

            //THE RESPONSE FROM API
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String responseLine;
                StringBuilder responseContent = new StringBuilder();

                while ((responseLine = reader.readLine()) != null) {
                    responseContent.append(responseLine);
                }
                reader.close();

                //PARSING THE STRING RESULT WE GET TO A FLOAT AND RETURNING IT
                return Float.parseFloat(responseContent.toString());
            } else {
                //HANDLING THE API'S ERROR IF THERE'S ANY
                System.err.println("API request failed with response code: " + responseCode);
                return -1.0f; //RETURNING A NEGATIVE NUMBER
            }
        } catch (IOException e) {
            //HANDLING ANY EXEPTIONS DURING HTTP REQUEST
            e.printStackTrace();
            return -1.0f;  //RETURNING A NEGATIVE NUMBER
        }
    }*/
	
	//CALCULATING THE TRIANGLE'S PERIMETER
	public float perimetre (){
		double hypothenuse = Math.sqrt((base * base)+(hauteur * hauteur));
		return (float) (base + hauteur + hypothenuse);
	}
}
