////package UI_2016.fall.DSA.codetest.edu.innopolis.ru.Assignment2.KnapsackPacking;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//class FileReaderWriter {
//    ArrayList<Integer> readFromInputFile() {
//        ArrayList<Integer> inputList = new ArrayList<>();
//        Scanner scanner = null;
//        try {
//            String inputFileName = "input.txt";
//            scanner = new Scanner(new FileInputStream(inputFileName));
//
//            while (scanner.hasNextInt())
//                inputList.add(scanner.nextInt());
//
//        } catch (FileNotFoundException e) {
//            assert false : "Input file has not been found.";
//        } finally {
//            if (scanner != null)
//                scanner.close();
//        }
//
//        return inputList;
//    }
//
//    void writeToOutputFile(String outputString) {
//        FileWriter out = null;
//        try {
//            String outputFileName = "output.txt";
//            out = new FileWriter(outputFileName);
//            out.write(outputString);
//        } catch (IOException e) {
//            assert false : "Some problem with output file: IOException.";
//        }
//        finally {
//            if (out != null) {
//                try {
//                    out.close();
//                } catch (IOException e) {
//                    assert false : "There is no FileWriter.";
//                }
//            }
//        }
//    }
//}