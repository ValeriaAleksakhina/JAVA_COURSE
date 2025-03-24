public class Car {

    private String model;
    private int year;


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public Car(int year) {
        this.year = year;
        this.model = "Неизвестная машина";
    }

    public void setYear(int year) {
        this.year = year;
    }


    // Создаем метод с условиями, чтобы создать уникальность вывода метода для каждого экземпляра класса

    public void makeBeBe(){
        if ("lada".equals(model) && year == 1997) {
            System.out.println("Мотор чихает и кашляет");
        } else
        System.out.println("Машина " + model + " (" + year + " года) говорит: Би-бип!");

        }

    }



