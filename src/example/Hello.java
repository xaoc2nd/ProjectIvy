
package example;

import org.apache.commons.lang.WordUtils;
import java.io.FileReader;
import com.opencsv.CSVReader;
import java.util.List;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Hello {
    public static void main(String[] args) {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));
        int nb=0;
        int monmax = 0 ;
        try {
		CSVReader reader = new CSVReader(new FileReader("data.csv")) ;
		List<String[]> myEntries = reader.readAll() ;
		for (String[] ligne : myEntries) {

			for (String colonne : ligne) 
		    		{
		    			System.out.println("nombre lu--" + colonne+"--");

		    			if (colonne.length() != 0){
		    				nb++;
			    			if (Integer.parseInt(colonne) > monmax) 
			    			{
			    				monmax = Integer.parseInt(colonne);
			    			}
			    		}
		    		}
		}
		}
		catch(IOException e)
		{
			System.out.println("Pas de fichier");
		}
		System.out.println("nombre total lu: " + nb);
		System.out.println("nombre max du tableau: " + monmax);
    }
}
        
