
public class Student {
	private String name;
	private int id;
	private int fees;
	private boolean ismale;

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return this.id;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public int getFees() {
		return this.fees;
	}
	public void setIsmale(boolean ismale) {
		this.ismale = ismale;
	}
	public boolean getIsmale() {
		return this.ismale;
	}
	
	public Student(String name, int id, int fees, boolean ismale) {
		this.name = name;
		this.id = id;
		this.fees = fees;
		this.ismale = ismale;
	}
	public String toString() {
		return name+id+fees+ismale;
	}
}
