public class BookVO {
	private int bookNum;//책번호
	private String bookName;//책이름
	private String bookPub;// 출판사
	private String bookMng;//대여관리 :서고 ,대출
	

	public BookVO() {}
	public BookVO(int bookNum, String bookName,String bookPub, String bookMng) {
		this.bookNum = bookNum;
		this.bookName = bookName;
		this.bookPub = bookPub;
		this.bookMng = bookMng;
	}
	public int getBookNum() {
		return bookNum;
	}
	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookPub() {
		return bookPub;
	}
	public void setBookPub(String bookPub) {
		this.bookPub = bookPub;
	}
	public String getBookMng() {
		return bookMng;
	}
	public void setBookMng(String bookMng) {
		this.bookMng = bookMng;
	}
	

}
