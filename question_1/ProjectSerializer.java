package question_1;

/* import java.io.FileOutputStream;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class ProjectSerializer {
    List<Employee> elist1 = new ArrayList<>();
    List<Employee> elist2 = new ArrayList<>();
    List<Employee> elist3 = new ArrayList<>();
    Map<Project, List<Employee>> projectMap1 = new HashMap<>();

    public static void main
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
public class ProjectSerializer {
	List<Employee> elist1 = new ArrayList<>();
	List<Employee> elist2 = new ArrayList<>();
	List<Employee> elist3 = new ArrayList<>();
	Map<Project,List<Employee>> projectMap1 = new HashMap<>();
	public Object projectMap;

	public static void main(String[] args) {

		ProjectSerializer projectSerializer = new ProjectSerializer();
		// Sample Data
		Project project1 = new Project("P1", "Music Synthesizer", 23);
		Project project2 = new Project("P2", "Vehicle Movement Tracker", 13);
		Project project3 = new Project("P3", "Liquid Viscosity Finder", 15);

		Employee e1 = new Employee("E001","Harsha","9383993933","RTNagar",1000);
		Employee e2 = new Employee("E002","Harish","9354693933","Jayanagar",2000);
		Employee e3 = new Employee("E003","Meenal","9383976833","Malleswaram",1500);

		// Add employees to projects
		projectSerializer.elist1.add(e1);
		projectSerializer.elist1.add(e2);
		projectSerializer.elist1.add(e3);
		
		Employee e4 = new Employee("E004","Sundar","9334593933","Vijayanagar",3000);
		Employee e5 = new Employee("E005","Suman","9383678933","Indiranagar",2000);
		Employee e6 = new Employee("E006","Suma","9385493933","KRPuram",1750);
		
		// Add employees to projects
		projectSerializer.elist2.add(e4);
		projectSerializer.elist2.add(e5);
		projectSerializer.elist2.add(e6);

		Employee e7 = new Employee("E007","Chitra","9383978933","Koramangala",4000);
		Employee e8 = new Employee("E008","Suraj","9383992133","Malleswaram",3000);
		Employee e9 = new Employee("E009","Manu","9345193933","RTNagar",2000);
		
		// Add employees to projects
		projectSerializer.elist3.add(e7);
		projectSerializer.elist3.add(e8);
		projectSerializer.elist3.add(e9);

		projectSerializer.projectMap1.put(project1, projectSerializer.elist1);
		projectSerializer.projectMap1.put(project2, projectSerializer.elist2);
		projectSerializer.projectMap1.put(project3, projectSerializer.elist3);

		// Serialize
		projectSerializer.serializeProjectDetails(projectSerializer.projectMap1);

	}

	private void serializeProjectDetails(Map<Project, List<Employee>> projectMap12) {
		// TODO Auto-generated method stub
		String filename="EmpProj.txt";
		// Serialization
		try {
			//saving of Object in a File
			FileOutputStream file=new FileOutputStream(filename);
			ObjectOutputStream ob=new ObjectOutputStream(file);
			//Storing the information to the target file
			
			ob.writeObject(projectMap12);
			ob.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Serialized Map of Project Succesfully");
		
	}

	public static void serializerData(HashMap<question_2.Project, List<question_2.Employee>> hMap1) {
		// TODO Auto-generated method stub
		
	}

}






