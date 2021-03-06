

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DIgitalClock_teacher extends JFrame implements Runnable{
	JLabel timeView = new JLabel("00:00:00",JLabel.CENTER);
	Font fnt = new Font("고딕", Font.BOLD,100);
	public DIgitalClock_teacher() {}
	public DIgitalClock_teacher(int x,int y, int w, int h) {
		add(timeView);
		timeView.setFont(fnt);
		
		setBounds(x,y,w,h); //setSize(폭, 높이), setBound(x,y,w,h), pack():컨텐츠 내용만큼 크기 정해짐
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

	}
	public void run() {
		while(true) {
			Calendar now = Calendar.getInstance(); //현재시간을 구한다.
			SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
			String txt = format.format(now.getTime());
			timeView.setText(txt);
			try {Thread.sleep(10);}catch(Exception e) {} //0.5초 딜레이 주기
		}
	}
}
