
import java.io.File;
import java.io.PrintStream;

public class Persistence {
	 public static void saveToFile(Journal j, String fileName, boolean overwrite)throws Exception{
	        if(overwrite || new File(fileName).exists()){
	            try(PrintStream out = new PrintStream(fileName)){
	                out.println(j.toString());
	            }
	        }
	    }
}
