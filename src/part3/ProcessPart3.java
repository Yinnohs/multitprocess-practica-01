package part3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProcessPart3 {

    public void run (){
        Scanner sc = new Scanner(System.in);
        System.out.println("agregame la ruta de un archivo");
        String route = sc.nextLine();
        File file = new File(route);

        ProcessBuilder processBuilder = new ProcessBuilder(
                new String[]{
                        "/bin/bash",
                        "-c",
                        " cat $(readlink -f " + route + ") | wc"
                }
        );
        try{
            Process process = processBuilder.start();
            BufferedReader reader = new BufferedReader
                    (
                        new InputStreamReader(process.getInputStream())
                    );

            String line = reader.readLine();
            System.out.println(line);

        } catch ( IOException e) {
            System.out.println("Something went wrong :/ ");
            throw new RuntimeException(e);
        }
    }
}
