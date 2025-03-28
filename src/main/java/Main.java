import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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




        String [] strings = {"привет", "ПОКА", "гипербола"};

        System.out.println(strings[0].toUpperCase());
        System.out.println(strings[1].toLowerCase());

        for (String str : strings) {
            if (str.charAt(1) == 'О') {
                System.out.println(strings[1].substring(0, 3) + " " + strings[1].substring(3));
            }


        }
    }
}