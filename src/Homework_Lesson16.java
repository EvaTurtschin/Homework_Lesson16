public class Homework_Lesson16
{
    public static void main(String[] args)
    {
    /* Task1
Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
Пример: Hello -> 10*/
        String string1 = "Berlin";
        System.out.println("The double length of the string Berlin is " + doubleLength(string1));

        /* Task2
Написать метод, принимающий две строки и возвращающий эти строки, соединенные вместе,
но без первых букв и в верхнем регистре. Пример: "Hello", "There" -> ELLOHERE */

        String str1 = "Jelly";
        String str2 = "Belly";
        System.out.println("Our result of Integrtaion is " + integration(str1, str2));

        /* Task3
Написать метод, принимающий строку и возвращающий эту строку с переставленной в конец строки
первой буквой. Примет: abcd -> bcda */

        String string = "abab";
        System.out.println("The changed string from abab is = " + changeString(string));

    }
    public static int doubleLength (String string1)
    {
        return string1.length()*2;
    }

    public static String integration (String str1, String str2)
    {
        return str1.substring(1).toUpperCase().concat(str2.substring(1).toUpperCase());
    }

    public static String changeString (String string)
    {
        String tempo = string.substring(0,1);
        return string.substring(string.length() - 1).concat(string.substring(1, string.length() - 1)).concat(tempo);
    }


}
