package FilIO;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileIOPractice
{
    public static void main(String[] args) {
        String directory = "./";
        String filename = "info.txt";
//
        Path dataDirectory = Paths.get(directory);
        Path dataFile = Paths.get(directory, filename);
        try {
            if (Files.notExists(dataDirectory)) {
                Files.createDirectories(dataDirectory);
            }
            if (!Files.exists(dataFile)) {
                Files.createFile(dataFile);
            }

//            List<String> newList = new ArrayList<>();
//            newList.add("strawberry");
            Files.write(
                    Paths.get("data", "groceries.txt"),
                       // newList
                    Arrays.asList("eggs"), // list with one item
                    StandardOpenOption.APPEND
            );

//            List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//            Path filepath = Paths.get("data", "groceries.txt");
//            Files.write(filepath, groceryList);

            Path groceriesPath = Paths.get("data", "groceries.txt");
            List<String> groceryList = Files.readAllLines(groceriesPath);
            for (int i = 0; i < groceryList.size(); i += 1) {
                System.out.println((i + 1) + ": " + groceryList.get(i));
            }

        } catch (IOException ioe){
            System.out.println(ioe);
        }

    }
}
