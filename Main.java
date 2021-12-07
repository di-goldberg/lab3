package com.company;
import java.util.Scanner;

public class Main {
    public static void main(final String ar[]) {
        String password;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль ");
        password = in.next();

        boolean hasLetter = false;
        boolean hasDigit = false;

        if (password.length() >= 8) {
            for (int i = 0; i < password.length(); i++) {
                char x = password.charAt(i);
                if (Character.isLetter(x)) {

                    hasLetter = true;
                }

                else if (Character.isDigit(x)) {

                    hasDigit = true;
                }

                if(hasLetter && hasDigit){

                    break;
                }

            }
            if (hasLetter && hasDigit) {
                System.out.println("Надёжный пароль");
            } else {
                System.out.println("Ненадёжный пароль");
            }
        } else {
            System.out.println("Пароль должен содержать как минимум 8 символов");
        }
    }}