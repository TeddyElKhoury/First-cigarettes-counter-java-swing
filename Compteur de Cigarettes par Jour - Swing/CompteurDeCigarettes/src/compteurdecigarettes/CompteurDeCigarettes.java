package compteurdecigarettes;

import java.text.SimpleDateFormat;
import java.util.*;
import java.io.*;

/**
 *
 * @author teddy
 */
public class CompteurDeCigarettes {

    public static void main(String[] args) {
        
        File f = new File("cigarettes.dat");
        if(!f.exists()){
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            Date date = new Date();
            Map<String, Integer> cigarettes = new HashMap<String, Integer>();
            cigarettes.put(sdf.format(date)+"", 0);
            try{
                f.createNewFile();
                FileOutputStream fos = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(cigarettes);
                oos.close();
                fos.close();
                System.out.println("ObjectHasBeenWrittenSuccessfullyForTheFirstTimeStartingTheApp");
            }catch(FileNotFoundException fnfe){}
            catch(IOException ioe){}
        }
        
        new MainFrame().setVisible(true);
        
    }
    
}
