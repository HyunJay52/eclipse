import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest1 {

	public ExceptionTest1() {
		try {
			//예외처리하기
			//예외발생가능한 코드와 예외발생가능성이 없는 코드도 명시가 가능하다.
			Scanner scan = new Scanner(System.in);
			System.out.println("정수를 입력하세요");
			int n = scan.nextInt();
			System.out.println("n="+n);
		}catch(InputMismatchException ime) { //데이터를 잘못입력했을때 에러를 해결해주는 클래스
		//try영역의 코드가 예외가 발생하면 실행될 영역
			ime.printStackTrace();//에러가 어디서 발생했는지 찾아준다.
			
			//System.out.println(ime.getMessage());
			//System.out.println("숫자를 잘못입력하였습니다..");
		}
		System.out.println("프로그램이 정료 되었습니다.");
		
		}

	public static void main(String[] args) {
		new ExceptionTest1();

	}

}
