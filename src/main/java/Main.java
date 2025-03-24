public class Main {
    public static void main(String[] args) {

//        House myHouse = new House("Квартира", 120);
//
//        // переопределяем статичную переменную
//        House.setRoomCount(4);
//
//        System.out.println("Теперь количество комнат стало " + House.getRoomCount());

       // Создаем несколько экземпляров класса Car

        Car bmw = new Car("BMW", 2025);
        Car toyota = new Car("Toyota", 2015);
        Car lada = new Car("lada", 1997);

        // создаем экземпляр с другим конструктором
        Car volvo = new Car(2020);

        // вызываем метод для всех экземпляров
        bmw.makeBeBe();
        lada.makeBeBe();
        volvo.makeBeBe();
        toyota.makeBeBe();

        // переопределяем переменные
        toyota.setYear(2020);
        lada.setYear(2000);

        // вызываем метод, чтобы убедиться, что изменения применились
        toyota.makeBeBe();
        lada.makeBeBe();






    }
}