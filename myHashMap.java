

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


        
       /*  ///////////////////////////////// test method one ////////////////////////////////////
         addStudentGPA(studentsGPAs,444004881, 4);
         System.out.println(studentsGPAs.size());
         System.out.println(studentsGPAs.get(444004881));
         ///////////////////////////////// test method two ////////////////////////////////////
         removeStudentGPA(studentsGPAs,444004881);
         System.out.println(studentsGPAs.size());
         //////////////////////////////// test method three ///////////////////////////////////
         System.out.println( getAverageStudentGPA(studentsGPAs));
         //////////////////////////////// test method four ///////////////////////////////////
         System.out.println(getStudentIDWithHighestGPA(studentsGPAs));
         */
         
                            
   }
  
  
  
  public static Double minVal(HashMap<Integer,Double> hm){
      
      return Collections.min(hm.values());      
  }
  
  
   // TODO: Define a static method that adds an entry to studentsGPAs defined above

   public static void addStudentGPA(HashMap<Integer,Double> hm,int studentID, double gpa) {
    hm.put(studentID, gpa);
}
   // TODO: Define a static method that remove an entry to studentsGPAs defined above using student ID

   public static void removeStudentGPA(HashMap<Integer,Double> hm,int studentID) {
    hm.remove(studentID);
}
   // TODO: Define a static method called `getAverageStudentGPA` that returns the average of all GPA in studentsGPAs
   public static double getAverageStudentGPA(HashMap<Integer, Double> average) {
    double sum = 0.0;
    for (double gpa : average.values()) {
        sum += gpa;
    }
    return sum / average.size();
}
   // TODO: Define a static method called `getStudentIDWithHighestGPA` that returns the student ID with the highest GPA
   public static int getStudentIDWithHighestGPA(HashMap<Integer, Double> GPA) {
    int maxID = 0;
    double maxGPA = 0;
    for (int studentID : GPA.keySet()) {
        double gpa = GPA.get(studentID);
        if (gpa > maxGPA) {
            maxGPA = gpa;
            maxID = studentID;
        }
    }
    return maxID; 
}


}


        