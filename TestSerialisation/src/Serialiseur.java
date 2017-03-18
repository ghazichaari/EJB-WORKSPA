import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class Serialiseur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Voiture v=new Voiture();
		v.setCouleur("rouge");
		v.setNumChassis("001");
		
		File file=new File("voiture1.serial");

		try {
			FileOutputStream fos=
					new FileOutputStream(file);
		     
			ObjectOutputStream oos=
					
					new ObjectOutputStream(fos);
			
			oos.writeObject(v);
		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
