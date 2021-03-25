package SJ.basic.day07;

public class Ex07 {
    static class ElectricFan{
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;

        private int speed;
        private Boolean onAndOff;
        private double radius;
        private String color;

        public ElectricFan() {
            speed = SLOW;
            onAndOff = false;
            radius = 5.0;
            color = "blue";
        }

        public ElectricFan(int speed, Boolean onAndOff,
                           double size, String color) {
            this.speed = speed;
            this.onAndOff = onAndOff;
            this.radius = size;
            this.color = color;
        }

        public void display() {
            String fmt = "%d %s %.1f %s\n";
            System.out.printf(fmt, speed, onAndOff,
                    radius, color);
        }
    }

    public static void main(String[] args) {
        ElectricFan ef = new ElectricFan();
        ElectricFan ef2 = new ElectricFan(ef.FAST, true, 10, "yellow");
        ElectricFan ef3 = new ElectricFan(ef.MEDIUM, false, 5, "blue");
        ef.display();
        ef2.display();
        ef3.display();
    }
}
