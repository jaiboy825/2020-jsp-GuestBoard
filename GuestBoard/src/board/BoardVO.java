package board;

public class BoardVO {
//멤버 변수
	// 생성자
	//게터 세터
	//투스트링 오버라이딩
	private int boardNum;
	private String name;
	private String pass;
	private String title;
	private String content;
	private String writeDate;
	
	//BoardVO vo = new BoardVO();
	//vo.setXXX
	
	
	public BoardVO(int boardNum, String name, String pass, String title, String content, String writeDate) {
		this.boardNum = boardNum;
		this.name = name;
		this.pass = pass;
		this.title = title;
		this.content = content;
		this.writeDate = writeDate;
	}
	public BoardVO() {
		
	}
	public int getBoardNum() {
		return boardNum;
	}
	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}

	@Override
	public String toString() {
		return "20121전제 [boardNum=" + boardNum + ", name=" + name + ", pass=" + pass + ", title=" + title + ", content="
				+ content + ", writeDate=" + writeDate + "]";
	}
	
}
