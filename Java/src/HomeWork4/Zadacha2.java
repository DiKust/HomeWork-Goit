package HomeWork4;

public class Zadacha2 {
    public static void main(String[] args){
        drawRectangle(4,7);


    }

    public static  void drawRectangle(int Width, int Height){

        System.out.println("Прямоугольник: ");
        for (int i = 0; i < Width; i++){
            System.out.println();
            for (int j = 0; j < Height; j++){
                System.out.print("+");
            }
        }

    }

}
