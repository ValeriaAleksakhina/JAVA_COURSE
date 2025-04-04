public class Guitar implements Playable{

    @Override
    public void play(int stringCount) {
        System.out.println("Гитара играет на " + stringCount + " струнах");
    }
}
