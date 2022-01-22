public class Main {
    public static void main(String[] args) {
        Gnome newGnome = new Gnome("Vorchun", 40);
        System.out.println("Вашего гнома зовут: " + newGnome.getName());
        System.out.println("Его возраст:" + newGnome.getAge());
        newGnome.goForward(10);
        newGnome.printPosition();
        newGnome.turnRight();
        newGnome.goBackward(30);
        newGnome.printPosition();
        newGnome.turnLeft();
        newGnome.goForward(50);
    }
}
