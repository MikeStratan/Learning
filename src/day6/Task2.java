package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Bowing",1990,50, 14000);
        airplane1.setLength(100);
        airplane1.setYear(2000);
        airplane1.fillUp(20);
        airplane1.fillUp(50);
        airplane1.info();
    }
}
