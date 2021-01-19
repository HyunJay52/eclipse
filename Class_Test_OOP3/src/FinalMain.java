
public class FinalMain extends FinalTest{

	public FinalMain() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		System.out.pritnln("STATUS= "+STATUS);
		total();//main total이 실행된다.
		super.total();//상위 클래스 total이 실행된다. 
	}
	//오버라이딩

	public void total() {
		System.out.println("1~100까지의 짝수의 합은 2550");
	}
	public static void main(String[] args) {
		new FinalMain().start();

	}

}
