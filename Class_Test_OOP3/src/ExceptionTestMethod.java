
public class ExceptionTestMethod {

	public ExceptionTestMethod() throws ArithmeticException{
		method1(); //method1에 에러는 method1을 포함한 코드도 에러와 같은것이다. 
	}
	public void method1() throws ArithmeticException, NumberFormatException,ArrayIndexOutOfBoundsException{
		int a=100, b=10;
		int c=a/b;//----
		System.out.println("c="+c);
		method2();
	}
	public void method2() throws NumberFormatException,ArrayIndexOutOfBoundsException{
		String numStr ="12";
		int num = Integer.parseInt(numStr);//NumberFormatException
		System.out.println("num ="+num);
		method3();
	}
	public void method3() throws ArrayIndexOutOfBoundsException{
		int num[] = {10,20,30};
		System.out.println(num[num.length]);
	}
	public static void main(String args[]) {
		try {
			new ExceptionTestMethod();
		}catch(ArithmeticException ae){
			System.out.println("0으로 나눌수 없습니다."+ae.getMessage());
		}catch(NumberFormatException nf) {
			System.out.println("문자는 숫자로 변경할 수 없습니다.");
		}catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("배열의 첨자값을 잘못입력하였습니다.");
			ae.printStackTrace();
		}
			System.out.println("프로그램 종료.....");
	}

}
