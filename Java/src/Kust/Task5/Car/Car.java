/*Конструктор
        --------------------
        Нет пустого конструктора. Так как есть поля в классе, которые нельзя изменять после создания объекта. Например дата производства.
        Конструктор с датой производства.
        Конструктор со всеми полями, кроме массива колес и массива дверей.

        Методы
        --------------------
        Изменить текущую скорость
        Посадить 1 пассажира в машину
        Высадить 1 пассажира
        Высадить всех пассажиров
        Получить дверь по индексу
        Получить колесо по индексу
        Снять все колеса с машины
        Установить на машину X новых колесу (в добаков к имеющимся, то есть если было 4 колеса,
        после вызова метода с Х аргументом равным трем, колес будет 4+3=7)
        Вычислить текущую возможную максимальную скорость (Скорость машины вычисляется так.
        Максимальная скорость новой машины множиться на самое стертое колесо в машине.
        Максимальная скорость равна 0 если в машине нет ни одного пассажира, так как некому ее вести)
        Вывести в консоль данные об объекте (все поля и вычисленную максимальную скорость в зависимости от
        целостности колес и наличия водителя)
*/
        package Kust.Task5.Car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private int dateCar;
    private  String typeEngine;
    private int maxSpeed;
    private int acceleration;
    private  int serviceability;
    private int passengers;
    private int speed;
    private List<CarDoor> carDoors = new ArrayList<>();
    private List<CarWheel> carWheel = new ArrayList<>();


    public void Car(int dateCar){
        this.dateCar = dateCar;
    }

    public void Car(int dateCar, String typeEngine, int maxSpeed, int acceleration, int serviceability,
                     int passengers, int speed){
        this.dateCar = dateCar;
        this.typeEngine = typeEngine;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.serviceability = serviceability;
        this.passengers = passengers;
        this.speed = speed;

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public  void allPasseger(){
        passengers++;
        if(passengers > serviceability) passengers = serviceability;

    }

    public void delPasseger(){
        passengers--;
        if(passengers < serviceability) passengers = 0;
    }

    public  void delDropPass(){
        passengers = 0;

    }

    public CarDoor getDoor (int index){
        return carDoors.get(index);
    }
    public CarWheel getWheel (int index) {
        return carWheel.get(index);
    }

    public void removeAllWheel() {
        carWheel.clear();
    }

    public void installWheels(int number){
        if (number > 0) {
            carWheel.add(new CarWheel());
            number--;
        }

    }

    public int currentMaxSpeed(){
        if(passengers == 0);
          return 0;

       // return maxSpeed * на стертое колесо в машине

    }

    public void show() {
        System.out.println("Машина : \nДата производства " + dateCar);
        System.out.println("Тип двигателя " + typeEngine);
        System.out.println("Максимальная скорость " + maxSpeed);
        System.out.println("Пассажировместимость " + serviceability);
    }







}
