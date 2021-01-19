import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

	public ExceptionEx() {
		
	}
	public void start() {
		do{
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
			}//catch(InputMismatchException ime) {
				//System.out.println("숫자만 입력하세요..."
			catch(NumberFormatException nfe) {
				System.out.println("숫자만 입력하세요..."
			}catch(ArithmeticException ae) {
				System.out.println("두번째 값은 0외의 값을 입력해야합니다.");
			}catch(ArrayIndexOutOfBoundsException ai) {
				System.out.println("배열의 index를 잘못사용하였습니다...");
			}
		}while(true);
		}

	public static void main(String[] a[])
	{
		
	}

}
