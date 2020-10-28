package board;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class BoardDAO {
	private static BoardDAO instance = new BoardDAO();

	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		return instance;
	}

	private static ArrayList<BoardVO> list = new ArrayList<BoardVO>();

	public ArrayList<BoardVO> selectAllBoards() {
		System.out.println("게시글 출력 완료");
		return list;
	}

	public int getBoardNum() {
		int boardNum = 0;
		for (int i = 0; i < list.size(); i++) {
			if (boardNum < list.get(i).getBoardNum()) {
				boardNum = list.get(i).getBoardNum();
			}
		}
		return boardNum + 1;
	}

	public String getDate() {
		Date today = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd HH/mm/ss");
		String writeDate = df.format(today);
		System.out.println("작성날짜" + writeDate);
		return writeDate;
	}

	public int insertBoard(BoardVO vo) {
		int check = 1;
		list.add(vo);
		return check;
	}
	
	public void updateBoard() {
		
	}
}
