
public class CalMain {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		int  result = c.add(50, 40);
		
		if(result ==90){
			System.out.println("더하기 성공");
		}
	}

}
