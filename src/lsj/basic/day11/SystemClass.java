package lsj.basic.day11;

public class SystemClass {
    public static void main(String[] args) {
        // System class
        // provide method and fields related to standard in and output
        // declared as an static - no need to create object
        long start = System.currentTimeMillis();

        long sum = 0;
        for(int i = 0; i < 100000000; i++){
            sum += i;
        }
        System.out.println(sum);

        long end = System.currentTimeMillis();
        System.out.println((double)(end - start) / 100);
    }
}
