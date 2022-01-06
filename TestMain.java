import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);   
		System.out.print("Enter Student name or subject title: ");  
		String str= sc.nextLine();                
		//System.out.print("You have entered: "+str); 
		addElements(str);
	}

	public static void addElements(String str) {
		ArrayList<String> student_name = new ArrayList<String>();
		 
		student_name.add("Ananth");
		student_name.add("Bhagath");
		student_name.add("Chaya");
		student_name.add("Esharath");
		student_name.add("Bhagath");
		student_name.add("Chaya");
		student_name.add("Ananth");
		student_name.add("Ananth");
		student_name.add("Ananth");
		student_name.add("Ananth");
		student_name.add("Ananth");
		student_name.add("Ananth");
	//	System.out.println(student_name);
        
        ArrayList<String> subject = new ArrayList<String>();
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ComputingTechnologies");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
        subject.add("ElectroFields");
 
        ArrayList<String> assignment_cat = new ArrayList<String>();
        assignment_cat.add("test_1");
        assignment_cat.add("test_1");
        assignment_cat.add("test_1");
        assignment_cat.add("test_1");
        assignment_cat.add("quiz_1");
        assignment_cat.add("lab_1");
        assignment_cat.add("project_1");
        assignment_cat.add("quiz_1");
        assignment_cat.add("test_1");
        assignment_cat.add("quiz_2");
        assignment_cat.add("lab_1");
        assignment_cat.add("test_2");
        
        ArrayList<String> submission_date = new ArrayList<String>();
        submission_date.add("21-Jul-16");
        submission_date.add("21-Jul-16");
        submission_date.add("21-Jul-16");
        submission_date.add("21-Jul-16");
        submission_date.add("22-Jul-16");
        submission_date.add("23-Jul-16");
        submission_date.add("24-Jul-16");
        submission_date.add("26-Jul-16");
        submission_date.add("29-Jul-16");
        submission_date.add("29-Jul-16");
        submission_date.add("30-Jul-16");
        submission_date.add("1-Aug-16");
        
        ArrayList<Integer> points = new ArrayList<Integer>(); 
        points.add(100);
        points.add(78);
        points.add(68);
        points.add(87);
        points.add(20);
        points.add(10);
        points.add(100);
        points.add(100);
        points.add(86);
        points.add(100);
        points.add(100);
        points.add(100);
        
      //to get the index of the matching elements
    	ArrayList<Integer> matchingIndices = new ArrayList<Integer>();
    	for (int i = 0; i < student_name.size(); i++) {
    	    String element = student_name.get(i);

    	    if (str.equals(element)) {
    	        matchingIndices.add(i);
    	    }
    	}
    	
        if(student_name.contains(str)) {
        	System.out.println("Contains student name");
        	
        	
        	//System.out.println("Matching"+ matchingIndices);
        	
        	HashSet<String> hset_sub = new HashSet<String>(subject);
        	/*System.out.println("ArrayList Subject Unique Values are : "
                    + hset_sub);*/
        	
        	HashSet<String> hset_assgn = new HashSet<String>(assignment_cat);
        	/*System.out.println("ArrayList Assgn cat Unique Values are : "
                    + hset_assgn);*/
        	
        		String[] subjectArray = hset_sub.toArray(new String[hset_sub.size()]);
        		  
                // Accessing elements by index
                /*System.out.println("Element at index 3 is: "
                                   + subjectArray[1]);*/
               /* int [] testcount = new int[20];
                int count=0;
                for(int i=0;i<subjectArray.length;i++) {
               	 for(int j=0;j<matchingIndices.size();j++) {
               		if((subjectArray[i].equals(subject.get(matchingIndices.get(j)))) && assignment_cat.get(matchingIndices.get(j)).startsWith("test")) {
               			testcount[i]=count+1;
               		}
               	 }
               	System.out.println("Testcount"+ testcount[i]);
               	 }*/
                
                for(int i=0;i<subjectArray.length;i++) {
                	double calculation_test = 0, calculation_quiz=0,calculation_lab=0,calculation_project=0;
                	 for(int j=0;j<matchingIndices.size();j++) {
                		 if((subjectArray[i].equals(subject.get(matchingIndices.get(j)))) && assignment_cat.get(matchingIndices.get(j)).startsWith("test")) {
                			 double cal_test = (40/2)*points.get(matchingIndices.get(j))/100.00;
                			 //System.out.println(subjectArray[i]+ subject.get(matchingIndices.get(j))+ calculation);
                			calculation_test=calculation_test +cal_test;
                		 }
                		 if((subjectArray[i].equals(subject.get(matchingIndices.get(j)))) && assignment_cat.get(matchingIndices.get(j)).startsWith("quiz")) {
                			double cal_quiz = (20/2)*points.get(matchingIndices.get(j))/100.00;
                			 calculation_quiz=calculation_quiz +cal_quiz;
                		 }
                		 if((subjectArray[i].equals(subject.get(matchingIndices.get(j)))) && assignment_cat.get(matchingIndices.get(j)).startsWith("lab")) {
                			 double cal_lab = (10/1)*points.get(matchingIndices.get(j))/100.00;
                			 calculation_lab=calculation_lab +cal_lab;
                		 }
                		 
                		 if((subjectArray[i].equals(subject.get(matchingIndices.get(j)))) && assignment_cat.get(matchingIndices.get(j)).startsWith("project")) {
                			double cal_project = (30/1)*points.get(matchingIndices.get(j))/100.00;
                			 calculation_project=calculation_project +cal_project;
                		 }
                	 }
                	 System.out.println("Subject: " + subjectArray[i]);
                	 System.out.println("TestScore"+":"+ calculation_test);
                	 System.out.println("QuizScore"+":"+ calculation_quiz);
                	 System.out.println("LabScore"+ ":"+ calculation_lab);
                	 System.out.println("ProjectScore"+":"+ calculation_project);
                	 double rating = calculation_test+calculation_quiz+calculation_lab+calculation_project;
                	 System.out.println("Overall rating: " + rating+"%");
                	 System.out.println("\n");
                }
        	}
        
        else if(subject.contains(str)) {
        	System.out.println("Contains assignment category");
        }
	}
}
