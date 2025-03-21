public class Main {
    public static void main(String[] args) {

        House myHouse = new House("Квартира", 120);

        // переопределяем статичную переменную
        House.setRoomCount(4);

        System.out.println("Теперь количество комнат стало " + House.getRoomCount());


    }
}