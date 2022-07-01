import java.util.ArrayList;
public class UseProgrammer {
	public static void main (String[]args) {
		
		Programmer p1 = new Programmer("ranjith","labour",true,"java");
		Programmer p2 = new Programmer("pazil","incharge",true,"python");
		Programmer p3 = new Programmer("monisha","serviceman",false,"c++");
		Programmer p4 = new Programmer("kanmani","suervisor",false,"developer");
		Programmer p5 = new Programmer("kumar","manager",true,"coding");
		
		ArrayList<Programmer>program = new ArrayList<>();
		program.add(p1);
		program.add(p2);
		program.add(p3);
		program.add(p4);
		program.add(p5);
		//for(int i=0;i<program.size();i++) {
			
			//System.out.println(program.get(i));
	
		//String a = "";
		//for(Programmer x: program) {
			//a = a.concat(x.name)+" ";
	
//	}
	//	System.out.println(a);

	int a = 0;
	String b = "";
    for(Programmer x: program) {
		if(x.designation.length()>a) {
			a = x.designation.length();
			b= x.designation;
		}
    }
	
      System.out.println(b);
	}
	

}
