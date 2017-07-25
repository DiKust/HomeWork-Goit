package HomeWork4;

public class Zadacha6 {
    public static void main(String[] args) {
        drawRectangel(3,2);

    }

    public static void drawRectangel(int Width, int Height ){
        if( Width > 0){

            System.out.print("+");

            if(Height > 0)
                drawRectangel(Width - 1, Height - 1);
            System.out.print("+");
           // System.out.print("+");
        }

    }



}
