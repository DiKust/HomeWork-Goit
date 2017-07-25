package HomeWork4;

public class Zadacha4 {
    public static void main(String[] args) {
        float result = getMax(7.1f,1.5f);
        System.out.print(result);
    }
    public static int getMax(int a, int b){
        if(a > b)
            return a;
        else
            return b;
    }
    public static float getMax(float a, float b){
        if(a > b)
            return a;
        else
            return b;
    }
}
