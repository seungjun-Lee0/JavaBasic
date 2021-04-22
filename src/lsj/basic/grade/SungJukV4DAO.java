package lsj.basic.grade;

import java.util.List;

public interface SungJukV4DAO {

    int insertSungJuk(SungJukVO sj);
    List<SungJukVO> selectSungJuk();
    SungJukVO selectOneSungjuk(int sjno);
    int updateSungJuk(SungJukVO sj);
    int deleteSungJuk(int sj);

}
