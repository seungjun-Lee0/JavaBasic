package lsj.basic.board;

import java.util.List;

public interface BoardDAO {

    int insertBoard(BoardVO bd);
    List<BoardVO> selectBoard();
    BoardVO selectOneBoard(int bdno);
    int updateBoard(BoardVO bd);
    int deleteBoard(int bd);

}
