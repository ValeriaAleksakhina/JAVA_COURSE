public class House {

    private static int roomCount = 10;  //количество комнат в доме

    public String name;  // название дома
    public int squareOfRoom; // площадь его комнат

    public House(String name, int squareOfRoom) {
        this.name = name;
        this.squareOfRoom = squareOfRoom;
    }

    // метод с использованием статичной переменной
    public static int getHulfRoom() {
        return roomCount / 2;
    }

    // метод для переопределения значения статической переменной
    public static void setRoomCount(int newRoomCount) {
        roomCount = newRoomCount;
    }

    public static int getRoomCount(){
        return roomCount;
    }

}
