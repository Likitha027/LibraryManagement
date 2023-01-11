package org.example;

public class Main {
    public static void main(String[] args) {
        User B = new User();
        B.setUserName("Akash");
        B.setUserId(101);
        B.setPassword("Abh4685");

        Book B1 = new Book();
        B1.setBookName("Electricals");
        B1.setBookId("A101");
        B1.setPrice(2560);
        B1.setNumOfPages(350);

        System.out.println("UserName:" + B.getUserName());
        System.out.println("UserId:" + B.getUserId());
        System.out.println("User Password:" + B.getPassword());
        System.out.println("Book Name:" + B1.getBookName());
        System.out.println("Book Id:" + B1.getBookId());
        System.out.println("Book Number Of Pages:" +B1.getNumOfPages());
        System.out.println("Book Price:" + B1.getPrice());


    }
}