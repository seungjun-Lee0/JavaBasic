package lsj.basic.day08.hr;

import sun.reflect.generics.visitor.Reifier;

public class Regions {
    private int region_id;
    private String region_name;

    public Regions() { }

    public Regions(int region_id, String region_name) {
        this.region_id = region_id;
        this.region_name = region_name;
    }

    public int getRegion_id() {
        return region_id;
    }

    public void setRegion_id(int region_id) {
        this.region_id = region_id;
    }

    public String getRegion_name() {
        return region_name;
    }

    public void setRegion_name(String region_name) {
        this.region_name = region_name;
    }
}
