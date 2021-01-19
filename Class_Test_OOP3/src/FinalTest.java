
public final class FinalTest { //바로 다른 클래스로 상속 불가능해진다.
	//한번 값이 설정되면 수정할 수없다.
	final int STATUS;
	public FinalTest() {
		STATUS =2;
	}
	//상속가능
	public final void total() {
		int i =0;
		for(int j=1;j<=100;j+=2) {
			i+=j;
		}
		System.out.println("1~100까지의 홀수의 합은 "+i);
	}

}
