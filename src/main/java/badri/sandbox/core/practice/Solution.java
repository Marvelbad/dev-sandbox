package badri.sandbox.core.practice;

import java.awt.print.Book;

public class Solution {
    public static void main(String[] args) {
        Human human = new Human.Builder()
                .setName("Alex")
                .setAge(30)
                .setGender("Man")
                .setIsEmployed(true)
                .build();
        System.out.println(human.toString());
    }
}
