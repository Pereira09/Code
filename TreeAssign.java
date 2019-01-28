package TreeAssign;

import java.util.Collection;
 import java.util.Iterator;
import java.util.TreeMap;

public class TreeAssign {
 
    public static void main(String[] args){
       
        //creating TreeMap
        
       TreeMap<Integer,String> Student = new TreeMap<Integer,String>();
       
       // Using put method to assign objects to Student
       
       Student.put(01,("Chris,Male,20"));
       Student.put(02,("Mary,Female,19"));
       Student.put(03,("Princess,Female,21"));
       Student.put(04,("Owen,Male,19"));
       
        System.out.println ("/nTreeMap after adding the objects: "+ Student);
       
        //Getting the size of the Object
        System.out.println("Size of TreeMap : " + Student.size());
        
        
         // Get a set of all the entries (key - value pairs) contained in the TreeMap

         Collection entrySet = Student.entrySet();
         
         // Obtain an Iterator for the entries Set

            Iterator it = entrySet.iterator();
            
            
            // Iterate through TreeMap entries

        System.out.println("TreeMap entries : ");
        while(it.hasNext())

        System.out.println(it.next());
    }
}

