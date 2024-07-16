/*
 * @author Sohee
 * @version 1.0.0
 * @since jdk 17
 */
public enum Season {
	spring(5), summer(100), fall(1000), winer(30_000_000);
	private int value;
	Season(int value){
		this.value = value; 
	}
	public int getValue() {
	return this. value;
	}
}