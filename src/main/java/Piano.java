public class Piano implements Playable{

    @Override
    public void play(int stringCount) {
        System.out.println("Пианино играет на " + stringCount + " клавишах");
    }
}
