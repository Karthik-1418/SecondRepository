import java.util.ArrayList;
public class UseStudent {
	public static void main (String[]args) {
		
		Student s1 = new Student("karthik",14,5000,true);
		Student s2 = new Student("ranjith",15,6000,true);
		Student s3 = new Student("monisha",17,5500,false);
		Student s4 = new Student("dhivya",18,5800,false);
		Student s5 = new Student("kumar",19,6500,true);
		ArrayList<Student>students = new ArrayList<>(); 
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		ArrayList<Student>malestudents = new ArrayList<>();
		ArrayList<Student>femalestudents = new ArrayList<>();
		students.forEach((x)->{
			if(x.getIsmale()==true) {
				malestudents.add(x);
			}
			else {
				femalestudents.add(x);
			}
			});
		for(Student x: malestudents) {
			System.out.println(x);
			
		}
		
	}

}
