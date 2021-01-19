import java.util.Scanner;

public class Exception2 {

	public Exception2() {
		start();
	}

	public void start() {
		try {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째수 ->");
		//int num1 = scan.nextInt(); //-----InputMisExceprion
		//콘솔의 문자열 1줄을 입력받는다. 
		int num1 = Integer.parseInt(scan.nextLine());//문자를 입력받아서 정수로 변환
		
		System.out.print("두번째수 ->");
		int num2 = Integer.parseInt(scan.nextLine());
		
		int result = num1*num2;
		int result2 = num1/num2; //--0으로 나누기 ArithemeticException
		
		System.out.println(num1+"*"+num2+"="+result);
		System.out.printf("$d/$d=$d\n",num1,num2,result2);
		String names[] = {"세종대왕", "이순신"}; //배열 index ArrayIndexOutOfBoundsExceprtion
		for(int i = 0; i<=names.length;i++) {
			System.out.println("name["+i+"]="+names[i]);
			}
		}//catch문 순서가 바뀌면 실행되지 않는다.
		//상속관계때문에 가능하다. 
		catch(ArrayIndexOutOfBoundsException aoe) {
			System.out.println("배열에서 예외발생...");
		}catch(Exception e) {
			System.out.println("0을 제외한 정수 입력하세요 ");
		}
	}
	public static void main(String[] args) {
		new Exception2().start();

	}

}
