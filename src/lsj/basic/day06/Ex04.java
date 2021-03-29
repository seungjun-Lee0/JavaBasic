package lsj.basic.day06;

public class Ex04 {
    public static void main(String[] args) {

        char[] letter;
        letter = new char[3];

        letter[0] = 'a';
        letter[1] = 'b';
        letter[2] = 'c';

        //char[] letter = {'a', 'b', 'c'};

        for(int i = 0; i < 3; i++){
            System.out.print(letter[i] +" ");
        }
        System.out.println();

        double [] a = {1.1, 2.2, 3.3};
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
        a[1] = a[2];
        System.out.println(a[0] + " " + a[1] + " " + a[2]);


        int [] sampleArray = new int [10];
        for ( int index = 0; index < sampleArray.length; index++)
            sampleArray[index] = 3*index;
        System.out.println(sampleArray[3]);
    }
}

