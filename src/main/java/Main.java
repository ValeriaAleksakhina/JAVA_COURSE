import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        showRandomElement();

//        House myHouse = new House("Квартира", 120);
//
//        // переопределяем статичную переменную
//        House.setRoomCount(4);
//
//        System.out.println("Теперь количество комнат стало " + House.getRoomCount());

       // Создаем несколько экземпляров класса Car

//        Car bmw = new Car("BMW", 2025);
//        Car toyota = new Car("Toyota", 2015);
//        Car lada = new Car("lada", 1997);
//
//        // создаем экземпляр с другим конструктором
//        Car volvo = new Car(2020);
//
//        // вызываем метод для всех экземпляров
//        bmw.makeBeBe();
//        lada.makeBeBe();
//        volvo.makeBeBe();
//        toyota.makeBeBe();
//
//        // переопределяем переменные
//        toyota.setYear(2020);
//        lada.setYear(2000);
//
//        // вызываем метод, чтобы убедиться, что изменения применились
//        toyota.makeBeBe();
//        lada.makeBeBe();


//        Scanner scanner = new Scanner(System.in);
//        final float rate = 0.07f;
//        float deposit = 0;
//        int month = 0;
//
//        while (true) {
//            try {
//                System.out.println("Введите сумму вклада: ");
//                deposit = scanner.nextFloat();
//                if (deposit <= 0) {
//                    System.out.println("Сумма вклада должна быть больше нуля!");
//                    continue;
//                } break;
//            } catch (InputMismatchException e){
//                System.out.println("Введите число!");
//                scanner.next();
//            }
//        }
//
//        while (true) {
//            try {
//                System.out.println("Введите количество месяцев: ");
//                month = scanner.nextInt();
//                if (month <= 0) {
//                    System.out.println("Количество меясцев должно быть больше нуля!");
//                    continue;
//                } break;
//            } catch (InputMismatchException e) {
//                System.out.println("Введите целое число");
//                scanner.next();
//            }
//        }
//
//
//        for (int i = 0; i < month; i++) {
//            deposit += deposit * rate;
//        }

//        System.out.println("По итогам " + month + " месяцев общая сумма вклада стала " + deposit);
//
//        scanner.close();


        /*System.out.println(strings[0].toUpperCase());
        System.out.println(strings[1].toLowerCase());

        for (String str : strings) {
            if (str.charAt(1) == 'О') {
                System.out.println(strings[1].substring(0, 3) + " " + strings[1].substring(3));
            }


        }*/

      /*  Employee employee = new Employee("Маша", 40000);
        Manager manager = new Manager("Саша", 60000);
        Developer developer = new Developer("Паша", 100000);

        employee.work();
        manager.work();
        developer.work();

       Shape circle = new Circle();
       Shape rectangle = new Rectangle();

       circle.draw();
       rectangle.draw();*/

       /* int guitarStrings = MusicData.StringCount.GUITAR_STRING.getCount();
        int pianoStrings = MusicData.StringCount.PIANO_STRING.getCount();

        Playable guitar = new Guitar();
        Playable piano = new Piano();

        guitar.play(guitarStrings);
        piano.play(pianoStrings);*/

    }
    public static void showRandomElement(){
        String[] strings = {"привет", "ПОКА", "гипербола"};
        Random random = new Random();
        int randomElement = random.nextInt(strings.length);
        String randomString = strings[randomElement];
        System.out.println("Случайная строка из массива: " + randomString);
    }

}
