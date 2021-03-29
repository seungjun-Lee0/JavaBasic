package lsj.basic.day10;

public class Polymoph {
    // type change between class and interface
    // casting is meaning of type change

    // inherited parent/child/interface are able to be type changed
    // these type change is 'up casting' and parent type to child
    // type is 'down casting'
    public static void main(String[] args) {
        paint(new Line());
        paint(new Circle());
        paint(new Triangle());

        // dynamic binding
        // auto upcasting
        paint2(new Line());
        paint2(new Circle());
        paint2(new Triangle());

        Line[] lines = new Line[3];
        Circle[] circles = new Circle[3];
        Triangle[] triangles = new Triangle[3];

        lines[0] = new Line();
        lines[0].draw();

        circles[0] = new Circle();
        circles[0].draw();

        triangles[0] = new Triangle();
        triangles[0].draw();

        // dynamic binding
        Shape[] shapes = new Shape[10];
        shapes[0] = new Line();
        shapes[1] = new Circle();
        shapes[2] = new Triangle();

        for(int i =0; i < 3; i++){
            shapes[i].draw();
        }

        // binding
        // decide value and type of the components which was used in the program
        // thus, when the variable stores value, or call function
        // connect with the address of functions in the memory

        // binding has static and dynamic binding
        // static binding : 컴파일시 변수의 타입이나 함수의 위치가 정해짐
        // 실행전에 많은 정보들이 미리 결정되기 때문에 효율 증가
        
        // dynamic binding : 실행시 변수의 타입이나 함수의 위치가 결정됨
        // 실행중 자유롭게 변수의 성격이 바뀌므로 적응성 증가
    }
    public static void paint(Line l) {
        l.draw();
    }
    public static void paint(Circle c) {
        c.draw();
    }
    public static void paint(Triangle t) {
        t.draw();
    }

    public static void paint2(Shape s) {
        s.draw();
    }
}

class Shape {
    public void draw() {
        System.out.println("draw a shape");
    }
}

class Line extends Shape{
    @Override
    public void draw() {
        System.out.println("draw a line ");
    }
}

class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw a circle");
    }
}

class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("draw a triangle");
    }
}