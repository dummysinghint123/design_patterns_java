
public class Demo {
    public static void main(String arg[])throws Exception{
           Journal j = new Journal();
           j.addJournal("Single Responsibilty");
           j.addJournal("OCP");
           System.out.println(j);

           Persistence p = new Persistence();
           String filename = "output.txt";
           p.saveToFile(j, filename, true);

           Runtime.getRuntime().exec("notepad.exe "+filename);
       }
}
