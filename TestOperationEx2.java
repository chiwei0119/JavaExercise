package tw.larry.myproject.type;

public class TestOperationEx2 {

	public static void main(String[] args) {
	int i = 1, j;
	j = i++;    //先取值再+1
	//j = ++i;  //先+1再取值
	
	System.out.println("i = " + i + " j = " + j );

	}

}
