/* 이름: 
신장(cm):
몸무게(kg):
——-
~님은 BMI지수 ~이고 ~단계입니다.   */

public class test2 {

	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("신장 입력(cm): ");
		double height = sc.nextDouble() / 100;
;		System.out.print("몸무게 입력(kg): ");
		double weight = sc.nextDouble();
			
	double bmi = weight / (height * height);
	        String Category;
	        if (bmi < 18.5) {
	        	Category = "저체중";
	        } else if (bmi <= 22.9) {
	        	Category = "정상";
	        } else if (bmi <= 24.9) {
	        	Category = "비만전단계";
	        } else if (bmi <= 29.9) {
	        	Category = "1단계 비만";
	        } else if (bmi <= 34.9) {
	        	Category = "2단계 비만";
	        } else {
	        	Category = "3단계 비만";
	        }
		
		System.out.printf("%s님은 BMI지수 %.2f이고, %s입니다.", name, bmi, Category);
			
	}

}
