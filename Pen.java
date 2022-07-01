import java.util.ArrayList;
public class Pen {
	public static void main (String[]args) {
		ArrayList<String>name = new ArrayList<>();
		name.add("karthik");
		name.add("ranjith");
		name.add("kumar");
		name.add("pazilkumar");
		name.add("monisha");
		name.add("dhivya");
		name.add("vijay");
		name.add("naveen");
		name.add("kasini");
		name.add("praveen");
		
		//for(int i=0;i<name.size();i++) {
			
			//System.out.println(name.get(i));
		
	   // int a = 0;
	   // String b = "";
		//for(String x: name ) {
	    	//if(x.length()>a) {
	    		//a = x.length();
	    		//b = x;
	    	//}
	    	//}
	    	
	    		//System.out.println(b);
		
		name.forEach((x)->{System.out.println(x);});
	    	
	    }
				
	}


