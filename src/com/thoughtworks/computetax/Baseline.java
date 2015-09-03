// A Demo class providing an entry point to the application which computes Sales Tax and produces the grand total
package com.thoughtworks.computetax;

import java.util.Scanner;

public class Baseline {

    public static void main(String[] args) {
        final String INPUT_TERMINATOR = "!";
        StringBuilder inputBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);
        String line;
        while(!((line = scanner.nextLine()).equals(INPUT_TERMINATOR))) {
            inputBuilder.append(line);
            inputBuilder.append("\n");
        }
        String input = inputBuilder.toString();
        ReceiptGenerator receiptGenerator = new ReceiptGenerator();
        receiptGenerator.parseInput(input);
        System.out.println(input);
    }
}
