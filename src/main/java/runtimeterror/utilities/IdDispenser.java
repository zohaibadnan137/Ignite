package runtimeterror.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class IdDispenser {

    public static int getID() throws FileNotFoundException {
        Scanner input = new Scanner(new File(System.getProperty("user.dir") + "/src/main/java/runtimeterror/utilities/id.txt"));
        int id = input.nextInt() + 1;
        PrintStream output = new PrintStream(System.getProperty("user.dir") + "/src/main/java/runtimeterror/utilities/id.txt");
        output.print(id);
        output.close();
        return id;
    }
}
