/* Класс CarDoor
На прямую к переменным этого класса никто не может, только через методы
--------------------
Хранит:
состояние двери(открыта/закрыта)
состояние окна (открыто/закрыто)

Конструктор
--------------------
Требуется несколько конструкторов на различные случаи
Один без аргументов. Он должен присвоить переменым значения на случай если данных нет.
Один конструктор принимает оба состояния, двери и окна. Присваивает эти значения переменным внутри объекта.

Методы
--------------------
открыть дверь
закрыть дверь
открыть/закрыть дверь (если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
открыть окно
закрыть окно
открыть/закрыть окно(если дверь открыта и вызывается эта функция, значит дверь необходимо закрыть и наоборот)
Вывести в консоль данные об объекте */
package Kust.Task5.Car;

public class CarDoor {
    private  boolean openDoor ;
    private boolean openWindow ;
    // конструктор без переменных
    public CarDoor() {
        openDoor = false;
        openWindow = false;

    }
    // конструктор
    public CarDoor(boolean openDoorDoor, boolean openWindow){
        this.openDoor = openDoorDoor;
        this.openWindow = openWindow;
    }
    // метод дверь открыта
    public void openDoor(){
        openDoor = true;

    }
    // метод дверь закрыта
    public void closeDoor(){
        openDoor = false;
    }
    // операто "!" не
    public void Door(){
        openDoor =! openDoor;
    }
    // метод открыть окно
    public void openWindow(){
        openWindow = true;
    }
    // метод закрыть окно
    public void closeWindow(){
        openWindow = false;
    }
    // оеперето НЕ
    public void Window(){
        openWindow =! openWindow;
    }
    // вывод в кансоль
    public void show(){
        if(openDoor)
            System.out.println("Дверь открыта");
        else
            System.out.println("Дверь закрыта");
        if(openWindow)
            System.out.println("Окноно открыто" );
        else
            System.out.println("Окно закрыто");

    }
}
