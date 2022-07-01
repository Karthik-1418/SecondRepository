import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[]args) {
		
		Employee e1 = new Employee();
		e1.name = "karthik";
		e1.id = 10;
		e1.gender = "male";
		e1.salary = 5000;
		
		Employee e2 = new Employee();
		e2.name = "ranjith";
		e2.id = 12;
		e2.gender = "male";
		e2.salary = 6000;
		
		Employee e3 = new Employee();
		e3.name = "pazilkumar";
		e3.id = 14;
		e3.gender = "male";
		e3.salary = 7000;
		
		Employee e4 = new Employee();
		e4.name = "arulkumar";
		e4.id = 15;
		e4.gender = "male";
		e4.salary = 8000;
		
		Employee e5 = new Employee();
		e5.name = "vithya";
		e5.id = 17;
		e5.gender = "female";
		e5.salary = 6500;
		
		ArrayList<Employee>emp = new ArrayList<>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		emp.add(e4);
		emp.add(e5);
		
		//for(int i=0;i<emp.size();i++) {
			//System.out.println(emp.get(i).name+" "+emp.get(i).id+" "+emp.get(i).gender+" "+emp.get(i).salary);
		//for(Employee x: emp) {
			//System.out.println(x.name+" "+x.id+" "+x.gender+" "+x.salary);
	
		emp.forEach((x)->{System.out.println(x);});
	}
		
	}

