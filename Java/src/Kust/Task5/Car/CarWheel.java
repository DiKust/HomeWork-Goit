/*Класс CarWheel
        На прямую к переменным этого класса никто не может, только через методы
        --------------------
        Хранит:
        Состояние целостности шины (дробное число от 0-стерта до 1-новая)

        Конструктор
        --------------------
        Аналогичный принцип как в классе CarDoor

        Методы
        --------------------
        Сменить шину на новую
        Стереть шину на X%
        Получить состояние (return)
        Вывести в консоль данные об объекте*/
package Kust.Task5.Car;

public class CarWheel {
    private float Wheel;
    // конструктор без переменных
    public CarWheel(){
        Wheel = 1.0f;
    }
    // конструктор с исключением
    public CarWheel(float wheel){
        if(wheel < 0.0f || wheel > 1.0f)
            throw new  IllegalArgumentException("Error, состояние шины от 0 до 1" + wheel);
        else
            this.Wheel = wheel;
    }
    // новая шина
    public void newWheel(){
        Wheel = 1.0f;
    }
    // стереть шину на Х%
     public void tireWear(float tw){
        if(tw < 0.0F || tw > 100.0f)
            throw new IllegalArgumentException("Error, состояние шины от 0 до 1" + tw);
        else
            Wheel -= (Wheel / 100.0f * tw);
     }
    //возврат
    public float state(){
        return Wheel;
    }
    //вывод в кансоль
    public void show(){
        System.out.println("Состояние шины - " + Wheel + "%");
    }
}
