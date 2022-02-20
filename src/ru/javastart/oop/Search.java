package ru.javastart.oop;

public class Search {
    static boolean Comparing(String s1, String s2) {
        int b = 0; //счетчик символов s2
        for (int i = 0; i < s1.length(); i++) {
            //Если не совпали, сбрасываем b и берем новый i
            if (s1.charAt(i) != s2.charAt(b)){
                b = 0;
                continue;}
            b += 1;
            // Если b становиться равным длине строки s2, значит строка совпала полностью.
            // Завершаем функцию
            if (b == s2.length())
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "12345";
        String s2 = "143";
        System.out.println(Comparing(s1, s2)); //передаем строки, выводим на печать true или false
    }
}
