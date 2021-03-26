package SJ.basic.day09;

import javax.smartcardio.TerminalFactory;

public class Starcraft {

    public static void main(String[] args) {

        Marine m = new Marine();
        Firebat f = new Firebat();


        m.attack();
        m.move();
        m.specialAbility();

        f.attack();
        f.move();
        f.specialAbility();
    }
}

abstract class Unit{
    protected String name;
    protected int hp;
    protected int dmg;
    protected double speed;
    protected int mineral;
    protected int gas;
}

interface UnitActions{
    void attack();
    void move();
    void specialAbility();
}

class Marine extends Unit implements UnitActions{

    public Marine() {
        name = "해병";
        hp = 40;
        dmg = 6;
        speed = 1.875;
        mineral = 50;
        gas = 0;
    }

    @Override
    public void attack(){
        // use abstract method to override attack method related to each unit
        System.out.println(name + "이(가) 대상에 " + dmg + "의 피해를 주고 있습니다.");
    }

    @Override
    public void move(){
        System.out.println(name + "이(가) " + speed + "의 속도로 이동합니다.");
    }

    @Override
    public void specialAbility() {
        System.out.println("특수능력 스팀팩을 이용합니다.");
    }

}

class Firebat extends Unit implements UnitActions{

    public Firebat() {
        name = "화염방사병";
        hp = 50;
        dmg = 12;
        speed = 1.875;
        mineral = 50;
        gas = 25;
    }

    @Override
    public void attack(){
        // use abstract method to override attack method related to each unit
        System.out.println(name + "이(가) 대상에 " + dmg + "의 피해를 주고 있습니다.");
    }

    @Override
    public void move(){
        System.out.println(name + "이(가) " + speed + "의 속도로 이동합니다.");
    }

    @Override
    public void specialAbility() {
        System.out.println("특수능력 스팀팩을 이용합니다.");
    }

}
