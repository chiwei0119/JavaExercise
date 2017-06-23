package tw.larry.myproject.type;

public class TestTypeCasting {

	public static void main(String[] args) {
	byte a = 1, b = 2, c ;
	/*
	 * java再做運算時會怕有異位的情形,所以計算完後會轉成int型態
	 * 所以這邊用type casting運算完後再轉回byte
	 */
	c = (byte)(a+b);
	
	System.out.println("c = " + c);
		}
}