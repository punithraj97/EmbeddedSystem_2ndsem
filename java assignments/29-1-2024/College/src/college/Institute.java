package college;
import java.util.*;

public class Institute {
	
	String name;
	List<Department> departments;
	
	public Institute(String name)
	{
		this.name=name;
		this.departments = new ArrayList<>();
	}
	
	String getName()
	{
		return name;
	}
	
	 public void addDepartment(Department department) {
	        departments.add(department);
	    }

	   public int countTotalStudents() {
	        int totalStudents = 0;
	        for (Department department : departments) {
	            totalStudents += department.getStudents().size();
	        }
	        return totalStudents;
	    }

}
