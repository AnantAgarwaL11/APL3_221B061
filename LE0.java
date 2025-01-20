public class LE0 {
    String name;
    int speed;

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setName(String name) {
        this.name = name;
    }

    int getSpeed() {
        return this.speed;
    }

    String getName() {
        return this.name;
    }

    public static void main(String[] args) {
        LE0 obj = new LE0();
        obj.setName("Car");
        obj.setSpeed(120);

        System.out.println("Name: " + obj.getName());
        System.out.println("Speed: " + obj.getSpeed());
    }
}