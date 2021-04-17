
import java.util.ArrayList;

public class Journal {
	private ArrayList<String> journals = new ArrayList<String>();
    private static int count;

    public void addJournal(String author){
        journals.add((++count)+". "+author);
    }
    public void removeJournal(int index){
        journals.remove(index);
    }

    @Override
    public String toString(){
        return journals.toString().replace(", ", "\n").replace("[","").replace("]","");
    }
}
