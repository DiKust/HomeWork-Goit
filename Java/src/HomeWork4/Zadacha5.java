package HomeWork4;

public class Zadacha5 {
    public static void main(String[] args) {
        printNumber(7);
    }

    public static void printNumber(int x){
        if(x > 0){
            printNumber(x - 1);
            System.out.print(x);
        }
    }

}
