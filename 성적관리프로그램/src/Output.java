
public class Output {
	public Employee [] array;   
	
	public Output(Employee [] array) {
		this.array = array;
	}
	
    void output() {
        if (this.array != null) {
            for (Employee employee : this.array) {
                if (employee != null) {System.out.println(employee);}
            } 
        } else {System.out.println("Array is null.");}
    }
}