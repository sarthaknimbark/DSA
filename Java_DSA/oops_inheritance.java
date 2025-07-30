import bank_package.*;

class Shape {
    public void area() {
        System.out.println("Display Area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

class EqTrinagle extends Triangle {
    @Override
    public void area() {
        
    }
}

public class oops_inheritance {
    public static void main(String[] args) {
      
    }
}
