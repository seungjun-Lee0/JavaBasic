package lsj.basic.day09;

public class Phones {
    public static void main(String[] args) {

    }
}

abstract class Phone {
    protected int phoneNum;
}

interface CellphoneActions{
    void makeCall();
    void getCall();
}

interface MP3Interface{
    void playMusic();
    void viewMovie();
}


// 상속 :  부모클래스가 가진 특성과 기능을 변화없이 받음
class MP3phone implements CellphoneActions, MP3Interface {

    @Override
    public void makeCall() {

    }

    @Override
    public void getCall() {

    }

    public void playMusic() {

    }

    @Override
    public void viewMovie() {

    }
}

class SmartPhone extends Phone implements CellphoneActions{

    @Override
    public void makeCall() {

    }

    @Override
    public void getCall() {

    }

    public void takePhoto() {

    }

    public void surfInternet() {

    }


    public void playGame() {

    }
}
