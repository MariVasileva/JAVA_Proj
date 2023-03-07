package String;

public class Str {
    public static void main(String[] args){
        String str1 = new String("Hello ");
        String str2 = "World";
        String str3= str1+str2;
        System.out.println(str3);

        String str4 = str2.substring(0,3); //0,1,2 символы из str2

        System.out.println(str4);
        System.out.println(str1.equals(str2)); //сравнение
        System.out.println(str1.equalsIgnoreCase(str2));// игнорирует регистр W w (в str1 изменили значение на "world") 

        String str5 = str2.toUpperCase(); //метод делает все символы заглавные. М.выбрать любой метод
        System.out.println(str5);

        int str6 = str2.length(); //длина строки
        System.out.println(str6);

        String [] str7 = {"Hello", "World", "People"}; //массив
        System.out.println(str7[2]);

        System.out.println(args[1] + ' ' + args[0]);
    }
}
