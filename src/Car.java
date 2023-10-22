class Car {
    String color;
    String motor;
    int numberOfDoors;

    Car(String color, String motor, int numberOfDoors) {
        this.color = color;
        this.motor = motor;
        this.numberOfDoors = numberOfDoors;
    }
}

class CarTest {
    public static void changeNumOfDoors(Car car, int numberOfDoors) {
        car.numberOfDoors = numberOfDoors;
    }
        public static void swapColor(Car car1, Car car2) {
            String colors = car1.color;
            car1.color = car2.color;
            car2.color = colors;
        }

        public static void main(String[] args) {
            Car car1 = new Car("Зеленый", "Бензин", 2);
            Car car2 = new Car("Синий", "Дизель", 4);

            changeNumOfDoors (car1, 2);
            swapColor(car1, car2);

            System.out.println("Цвет первого автомобиля: " + car1.color + ", Двигатель первого автомобиля: " + car1.motor + ", Количество дверей первого автомобиля: " + car1.numberOfDoors);
            System.out.println("Цвет второго автомобиля: " + car2.color + ", Двигатель второго автомобиля: " + car2.motor + ", Количество дверей второго автомобиля: " + car2.numberOfDoors);
        }
    }
