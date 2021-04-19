package lsj.basic.test01;

public class LibraryVO {
    protected String lbname;
    protected String sido;
    protected String gugun;
    protected String lbtype;
    protected String clsday;
    protected String addr;
    protected String phone;
    protected String homepage;
    protected double lat;
    protected double lon;

    public LibraryVO(String lbname, String sido, String gugun, String lbtype, String clsday, String addr, String phone, String homepage, double lat, double lon) {
        this.lbname = lbname;
        this.sido = sido;
        this.gugun = gugun;
        this.lbtype = lbtype;
        this.clsday = clsday;
        this.addr = addr;
        this.phone = phone;
        this.homepage = homepage;
        this.lat = lat;
        this.lon = lon;
    }

    public String getLbname() {
        return lbname;
    }

    public void setLbname(String lbname) {
        this.lbname = lbname;
    }

    public String getSido() {
        return sido;
    }

    public void setSido(String sido) {
        this.sido = sido;
    }

    public String getGugun() {
        return gugun;
    }

    public void setGugun(String gugun) {
        this.gugun = gugun;
    }

    public String getLbtype() {
        return lbtype;
    }

    public void setLbtype(String lbtype) {
        this.lbtype = lbtype;
    }

    public String getClsday() {
        return clsday;
    }

    public void setClsday(String clsday) {
        this.clsday = clsday;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
