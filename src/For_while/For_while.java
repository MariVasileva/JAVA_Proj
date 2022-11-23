package For_while;

import java.io.IOException;

public class For_while {
    public static void main(String[] args) throws IOException {

//        for (int i = 0; i < 5; i++) { //итерация с 0 по 4 (5 строк)
//            System.out.println("итерация" + i);
//        }
        for (int i = 0; (char) System.in.read() !='S'; i++) {
            System.out.println("итерация" + i);
        }
    }
}
