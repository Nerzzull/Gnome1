public class Gnome {
    int x, y;
    int dir;
    private String name;
    private int age;

    public Gnome(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void goForward(int i) {
        if (dir == 0) x += i;
        else if (dir == 1) y += i;
        else if (dir == 2) x -= i;
        else y -= i;
    }

    public void printPosition() {
        System.out.println("Сейчас гном находится на координатах " + x + ", " + y);
    }

    public void turnLeft() {
        dir--;
        if (dir == -1) dir = 3;
    }

    public void turnRight() {
        dir++;
        if (dir == 4) dir = 0;
    }

    public void goBackward(int i) {
        goForward(-i);
    }
}