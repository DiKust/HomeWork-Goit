package Kust.Task5.Car;

public class Car {
    private int dateCar;
    private  String typeEngine;
    private int maxSpeed;
    private int acceleration;
    private  int serviceability;
    private int passengers;
    private int speed;
    private int[] CarDoor = {1, 2, 3, 4};
    private int[] window = {1, 2, 3, 4};

    // конструктор с датой производства
    public void Car(int dateCar){
        this.dateCar = dateCar;
    }

    // конструктор со всеми полями
    public void Car(int dateCar, String typeEngine, int maxSpeed, int acceleration, int serviceability,
                     int passengers, int speed, int[] door, int[] window){
        this.dateCar = dateCar;
        this.typeEngine = typeEngine;
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
        this.serviceability = serviceability;
        this.passengers = passengers;
        this.speed = speed;

    }
    // изменить текущую скорость
    public void setSpeed(int speed) {
        this.speed = speed;
    }
     // посадить одного пасажира (не больше посажира вместимости)
    public  void allPasseger(){
        passengers++;
        if(passengers > serviceability) passengers = serviceability;

    }
     // высадить одного пасажира
    public void delPasseger(){
        passengers--;
        if(passengers < serviceability) passengers = 0;
    }
    // высадить всех пасажиров
    public  void delDropPass(){
        passengers = 0;

    }

    //public  void door(){
      //  int door = CarDoor[1];

    //}

}
