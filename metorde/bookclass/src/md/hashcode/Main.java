package md.hashcode;

import md.hashcode.book;

public class Main {
    public static void main(String[] args) {
        book b1=new book();
        b1.title="Tema pentru acasa";
        b1.yearOfPublishing=2005;
        b1.isAvaible=true;
        System.out.println( b1.title+" "+b1.yearOfPublishing+" "+ true );
    }
}