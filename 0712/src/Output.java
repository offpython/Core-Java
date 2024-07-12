public class Output {
    public Employee[] array;
    public Output(Employee[] array) {this.array = array;}

    void output() {
    	System.out.println("------------------------<<급여 관리 프로그램>>------------------------");
    	System.out.println("-----------------------------------------------------------------------");
    	System.out.println("사번\t급수\t호\t수당\t지급액\t세금\t차인지급액");
    	System.out.println("-----------------------------------------------------------------------");
        if (this.array != null) {
            for (Employee employee : this.array) {
                if (employee != null) {
                    System.out.println(employee);
                }
            }
        } else {
            System.out.println("Array is null.");
        }
        System.out.println("-----------------------------------------------------------------------");
        if (this.array != null) {
            for (Employee employee : this.array) {
                if (employee != null) {
                    System.out.println(employee);
                }
            }
        }
    }
}
