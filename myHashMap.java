

import java.util.*;
import java.lang.*;
import java.io.*;
        
public class myHashMap {
    
    //create hashmap
    private static HashMap<Integer,Double> studentsGPAs=new HashMap<Integer,Double>();
    
  public static void main(String args[])
   {
		
		//----------------add entry hashmap--------------------------------		
		studentsGPAs.put(4448763,4.0);
		studentsGPAs.put(4446337,3.7);
		studentsGPAs.put(4449728,2.3);
		studentsGPAs.put(4448343,3.74);
		studentsGPAs.put(4441955,3.81);
		studentsGPAs.put(4447282,2.0);
		
		//-------------------------------
		//Printing all elements of Hashmap
        System.out.println("printing using toString");
        System.out.println("Created hashmap is" + studentsGPAs);
		
		
        System.out.println("printing using forEach");
		for (Integer m:studentsGPAs.keySet()) {
			System.out.println(m+" "+studentsGPAs.get(m));
		}
                
        
		System.out.println("***************************");
        // finding min value
        System.out.println("Finding min value using Way 1");
        Double min=100.0;
        for (Integer m:studentsGPAs.keySet()) {
	        if(min >studentsGPAs.get(m))
            {
               min=studentsGPAs.get(m);
            }                     
		}
        System.out.println("Min GPA is: "+ min);
            

			
        System.out.println("Finding min value using Way 2");
        System.out.println("Min GPA is: "+minVal(studentsGPAs));
                            
   }
  
  
  
  public static Double minVal(HashMap<Integer,Double> hm){
      
      return Collections.min(hm.values());      
  }
  
  
   // TODO: Define a static method that adds an entry to studentsGPAs defined above
   // TODO: Define a static method that remove an entry to studentsGPAs defined above using student ID
   // TODO: Define a static method called `getAverageStudentGPA` that returns the average of all GPA in studentsGPAs
   // TODO: Define a static method called `getStudentIDWithHighestGPA` that returns the student ID with the highest GPA
  
  
}
        