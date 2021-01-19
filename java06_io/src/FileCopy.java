import java.io.File;
import java.io.FileInputStream;
import java.io.Serializable;

//직렬화를 하여 객체를 파일로 저장하도록한다.
public class FileCopy implements Serializable{

	public FileCopy() {
		// TODO Auto-generated constructor stub
	}
	public void start() {
		try {
			File srcFile = new File("C:\\h\\img\\movie01.png");
			
			FileInputStream fi = new FileInputStream(srcFile);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
