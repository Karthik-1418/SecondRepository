
public class Programmer {
	 String name;
	 String designation;
	 boolean ismale;
	 String codinglang;
	
	public Programmer(String name, String designation, boolean ismale, String codinglang) {
		this.name = name;
		this.designation = designation;
		this.ismale = ismale;
		this.codinglang = codinglang;
	}
	public String toString () {
		return name+" "+designation+" "+ismale+" "+codinglang;
	}
	

}
