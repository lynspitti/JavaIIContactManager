package dk.mercantec.javaii;

public class Main {

    public static void main(String[] args) {
        UI ui = new UI(new Contacts());
        while (true) {
            ui.MainMenu().Show();
        }
    }
}
