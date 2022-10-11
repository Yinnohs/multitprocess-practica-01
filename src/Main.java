import part1.ProcessPart1;
import part2.ProcessPart2;
import part3.ProcessPart3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input times Procesess will repeat");
        int userInput = Integer.parseInt(sc.nextLine());


    // First Part Implementation

        ProcessPart1 processPart1 = new ProcessPart1("https://www.google.com");
        processPart1.run(userInput);

        Thread.sleep(200);


        // Second Part
        for (int i = 0; i < userInput; i++) {
            ProcessPart2 processPart2 = new ProcessPart2("" + (i+1));
            processPart2.run();
        }
        Thread.sleep(200);

        // Third Implemantation
        // I used ~/asd.txt having the file in /home/yinnoh/<file>

        ProcessPart3 processPart3 = new ProcessPart3();
        processPart3.run();
    }

}