package While;

import java.sql.SQLOutput;

public class While {
    public static void main(String[] args) {
        int count=0;
//        while (count<10){
//            System.out.println(count);
//            count++;
//        }


//        do {
//            System.out.println(count); //Сначала операция, затем условие
//            count++;
//            } while (count<10);
//

//        while (count<10) {
//            System.out.println(count);
//            count++;
//
//            if (count==5) break; //выйти из цикла
//        }

        while (count<10){
            count++;
            if ((count%2) !=0) continue; //возврат в начало, если нечетное продолжаем, цикл проскакивает
            System.out.println(count);
        }
    }
}
