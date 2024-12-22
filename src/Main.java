import datastructures.classes.Cookie;

public class Main {
    public static void main(String[] args) {
        Cookie cookieOne = new Cookie("green");
        Cookie cookieTwo = new Cookie("yellow");

        cookieOne.setColor("blue");

        System.out.println(cookieOne.getColor());
        System.out.println(cookieTwo.getColor());
    }
}