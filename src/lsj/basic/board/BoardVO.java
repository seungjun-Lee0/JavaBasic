package lsj.basic.board;

import java.io.Serializable;

public class BoardVO implements Serializable {
    protected String bdno;
    protected String title;
    protected String userid;
    protected String regdate;
    protected int views;
    protected int thumsup;
    protected String contents;

    public BoardVO(){}

    public BoardVO(String title, String userid, String contents) {
        this.title = title;
        this.userid = userid;
        this.contents = contents;
    }

    public String getBdno() {
        return bdno;
    }

    public void setBdno(String bdno) {
        this.bdno = bdno;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getThumsup() {
        return thumsup;
    }

    public void setThumsup(int thumsup) {
        this.thumsup = thumsup;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
