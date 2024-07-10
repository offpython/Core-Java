
public class Student {
	//Field, 속성(Attribute, Property, State)
	private String hakbun;
	private int kor; 		
	private int eng;
	private int math;
	private int tot;
	private double avg;
	private char grade;
	
	public void print() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%c%n", 
				hakbun, kor, eng, math, tot, avg, grade);
	}
	
	public String getHakbun() {
		return hakbun;
	}
	public void setHakbun(String hakbun) {
		this.hakbun = hakbun;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
}

