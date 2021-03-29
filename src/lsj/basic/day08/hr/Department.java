package lsj.basic.day08.hr;

public class Department {
    private int depart_id;
    private String depart_name;
    private int manager_id;
    private int location_id;

    public Department() { }

    public Department(int depart_id, String depart_name, int manager_id, int location_id) {
        this.depart_id = depart_id;
        this.depart_name = depart_name;
        this.manager_id = manager_id;
        this.location_id = location_id;
    }

    public int getDepart_id() {
        return depart_id;
    }

    public void setDepart_id(int depart_id) {
        this.depart_id = depart_id;
    }

    public String getDepart_name() {
        return depart_name;
    }

    public void setDepart_name(String depart_name) {
        this.depart_name = depart_name;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getLocation_id() {
        return location_id;
    }

    public void setLocation_id(int location_id) {
        this.location_id = location_id;
    }
}
