package If_else;

import java.io.IOException;

public class If_else {
    public static void main(String[] args) throws IOException {

        char ch, answer = 'B';

        System.out.println("Какую букву я загадал?");
        System.out.print("Попытайтесь ее угадать:  ");

        ch = (char)System.in.read(); //присвавает значение введенное с клавиатуры
        if (ch == answer) {
            System.out.print("Поздравляю!");
        } else if (ch > answer) {
            System.out.print("Перестарался!");
        } else {
            System.out.print("Недостарался!");
        }


    }
}

