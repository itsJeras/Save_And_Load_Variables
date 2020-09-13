package com.itsJeras;
// Imports:
import java.lang.*;
import java.util.*;

public class Main {
    private static Formatter f;
    public static void main(String[] args) {

        createFile("newClass");
        // Variables:
        String something = "text or something ... idk";
        // Puts
        String text = "String text = " + '"' + something + '"' + ";";
        // Write to file:
        // Compact one line version:
        writeInFile("package com.itsJeras;\nclass newClass {\n"+text+"\n}");
        // Multiple line slower and non-compact version:
//        writeInFile("package com.itsJeras;");
//        writeInFile("class newClass {");
//        writeInFile(text);
//        writeInFile("}");
        // Close file:
        closeFile();
        // Make object from a class:
        com.itsJeras.newClass newClass = new com.itsJeras.newClass();
        // Print variable to console:
        System.out.println(newClass.text);

    }

    public static void createFile (String fileName) {
        try {
            f = new Formatter("src/com/itsJeras/folder/" + fileName + ".java");
        } catch (Exception e) {
            System.out.println("OOPSIE WOOPSIE!!\nUwu We made a fucky wucky!! A wittle\nfucko boingo! The code monkeys at our\nheadquarters are working VEWY HAWD\nto fix this!");
        }
    }
    public static void writeInFile (String text) {
        f.format("%s", text);
    }
    public static void closeFile () {
        f.close();
    }
}