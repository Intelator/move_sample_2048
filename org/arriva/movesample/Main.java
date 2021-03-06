package org.arriva.movesample;

import org.arriva.movesample.core.Field;
import org.arriva.movesample.core.impl.FieldImpl;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Field field = new FieldImpl(4, 4);
        field.generateInitialState();
        System.out.println(field.toString());

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            String input = scanner.next();
            if (!isControlKey(input)) {
                break;
            }

            if (input.equals("a")) {
                field.moveLeft();
            } if (input.equals("d")) {
                field.moveRight();
            } if (input.equals("w")) {
                field.moveUp();
            } else {
                field.moveDown();
            }

            /*
            //needs source 1.7!
            switch (input) {
                case "a": field.moveLeft();
                    break;
                case "d": field.moveRight();
                    break;
                case "w": field.moveUp();
                    break;
                case "s": field.moveDown();
                    break;
                default: System.out.println("Use w, a, s or d keys!");
            }
            */

            System.out.println(field.toString());
        }
    }

    public static boolean isControlKey(String input) {
        if (input.equals("a") || input.equals("d") || input.equals("s") || input.equals("w")) {
            return true;
        }

        return false;
    }
}
