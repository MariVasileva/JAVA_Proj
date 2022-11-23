package ProjectCar;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car();
        nissan.color = "blue";
        nissan.name = "nissan 1";
        nissan.model = "sedan";
        nissan.drive();

        Car bmw = new Car();
        bmw.color = "black";
        bmw.name = "bmw 5";
        bmw.model = "crossover";
        bmw.stop();

        System.out.println(bmw.color);
    }
}