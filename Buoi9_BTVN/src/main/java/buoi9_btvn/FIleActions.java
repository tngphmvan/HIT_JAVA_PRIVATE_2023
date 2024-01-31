/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi9_btvn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FIleActions {
//create the file
//write data in the file
//read data from the file
//rename the file
//delete the file

    public static void createFile(String filePath) {
        File myObj = new File(filePath);
        try {
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File is already exists.");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void writeFile(String filePath) {
        try {
            FileWriter mywritter = new FileWriter(filePath);
            mywritter.write("Welcome to my House\n");
            mywritter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void writeBuffer(String filePath) {
        FileWriter mywriter;
        try {
            mywriter = new FileWriter(filePath);
            BufferedWriter buffer = new BufferedWriter(mywriter);
            buffer.write("Fuckoff", 0, 0);
            buffer.close();
            mywriter.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void writePrint(String filePath) {
        try {
            FileWriter mywriter = new FileWriter(filePath, true);
            BufferedWriter bufferwriter = new BufferedWriter(mywriter);
            PrintWriter printwriter = new PrintWriter(bufferwriter);
            printwriter.printf("Im %d years old", 20);
            printwriter.close();
            bufferwriter.close();
            mywriter.close();
            System.out.println("File written");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void readFile(String filePath) {
        File myObj = new File(filePath);
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public static void renameFile(String oldFilePath, String newFilePath) {
        File oldFile = new File(oldFilePath);
        File newFile = new File(newFilePath);
        if (oldFile.renameTo(newFile)) {
            System.out.println("Rename Success");
        } else {
            System.out.println("DBRR");
        }
    }

    public static void deleteFile(String filePath) {
        File myObj = new File(filePath);
        if (myObj.delete()) {
            System.out.println("Deleted the file" + myObj.getName());
        } else {
            System.out.println("File not found !");
        }
    }

    public static void main(String[] args) {
        String filePath = "FileDemo.txt";
        createFile(filePath);
        writeFile(filePath);
        writePrint(filePath);
        readFile(filePath);
        renameFile(filePath,"Dcmm.txt");
    }
}
