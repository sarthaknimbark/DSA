class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing Something");
    }

    // public void printdata(String color) {
    //     System.out.println(color);
    // }

    // public void printdata(String type) {
    //     System.out.println(type);
    // }

    public void printdata(String color, String data) {
        System.out.println(color + " " + type);
    }

    // Pen(String color, String type) {
    //     this.color = color;
    //     this.type = type;
    // }
}

public class oops {
    public static void main(String args[]) {
        Pen p1 = new Pen();
        p1.color = "Black";
        p1.type = "gel";

        p1.write();

        Pen p2 = new Pen();
        p2.color = "Red";
        p2.type = "Ballpoint";

        p1.printdata(p1.color, p1.type);

    }
}
