package college;
import java.util.*;

public class TestCollege {

	public static void main(String[] args) {
	  
	    Student student1 = new Student(1, "punith", "ES");
        Student student2 = new Student(2, "Deepak", "ES");
        Student student3 = new Student(3, "varun", "ES");
        Student student4 = new Student(4, "sudeep", "ES");
       
        Student student5 = new Student(1, "pavan", "VLSI");
        Student student6 = new Student(2, "gopi", "VLSI");
        Student student7 = new Student(3, "dilip", "VLSI");
        Student student8 = new Student(4, "adarsh", "VLSI");
        
        Department esDepartment = new Department("ES");
        esDepartment.getStudents().add(student1);
        esDepartment.getStudents().add(student2);
        esDepartment.getStudents().add(student3);
        esDepartment.getStudents().add(student4);
        
        Department vlsiDepartment = new Department("VLSI");
        vlsiDepartment.getStudents().add(student5);
        vlsiDepartment.getStudents().add(student6);
        vlsiDepartment.getStudents().add(student7);
        vlsiDepartment.getStudents().add(student8);

        Institute msisInstitute = new Institute("MSIS");
        msisInstitute.addDepartment(esDepartment);
        msisInstitute.addDepartment(vlsiDepartment);

        int totalStudents = msisInstitute.countTotalStudents();
        System.out.println("Total students in " + msisInstitute.getName() + ": " + totalStudents);
        
        
	}
	}

