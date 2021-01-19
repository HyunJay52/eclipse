import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public RandomAccessFileTest() {
		try {
			//RandomAccessFile : 읽기 쓰기가 가능하며 인덱스를 지정할 수 있다. 
			File f = new File("C:\\io","random.txt"); //io폴더에 random.txt파일 생성fmf aksemsek.
			//mode : r->읽기전용 rw->읽기쓰기 가능 w->쓰기가능
			RandomAccessFile raf = new RandomAccessFile(f,"rw");
			
			String txt = "Java api input/output Test";
			
			String txt2 = "Sample Date"; //getBytes() 스트링 -->바이트 배열변경
			
			//원하는 index 위치 이동
			raf.seek(3); //seek 원하는 위치로 이동하는 기능
			//byte txtArr[] = txt2.getBytes() 이런식으로 해도 된다.
			raf.write(txt2.getBytes(),0,txt2.getBytes().length );
			raf.writeChars(txt);
			
			//읽어오기
			raf.seek(3);
			//raf.read(b, off, len)
			String readData = raf.readLine();
			System.out.println("readData ->"+readData);
			
			
			byte[] readData2 =new byte[20];
			raf.seek(3);
			int strCount =raf.read(readData2, 0, readData2.length);
			String readData3 = new String(readData2,0,strCount);
			System.out.println("readData3="+readData3);
			
			int numInt =1234; //0
			double numDouble = 56.3; //10
			//쓰기
			raf.seek(0);
			raf.writeInt(numInt);
			
			raf.seek(10);
			raf.writeDouble(numDouble);
			//읽기
			raf.seek(0);
			int readData4 = raf.readInt();
			System.out.println("readData4->"+readData4);
			
			raf.seek(10);
			double readData5 = raf.readDouble();
			System.out.println("readData5->"+readData5);
			raf.close();
		}catch(Exception e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new RandomAccessFileTest();

	}

}
