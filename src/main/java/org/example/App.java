package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Logger logger = Logger.getLogger(App.class.getName());
        logger.info("Hello and welcome!");

        logger.info("How many numbers to display in the loops?");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num <= 0) {
            logger.info("Choose number larger than 0");
        } else if (num >= 1) {
            printNumbers(num);
        }
    }
        public static void printNumbers (int num){
            for (int i = 1; i <= num; i++) {
                System.out.println("i = " + i);
            }
        }
    }