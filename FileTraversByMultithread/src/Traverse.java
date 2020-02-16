import com.sun.istack.internal.FinalArrayList;

import java.io.*;
import java.util.ArrayList;


public class Traverse implements Runnable {

    private static File myFile = new File("D:\\Academic\\Java学习资料\\JAVADemo");
    private static ArrayList<File> fileArrayList = new FinalArrayList<>();

    public static void main(String[] args) throws IOException {

        fileTraverse(myFile);

        Traverse traverse = new Traverse();
        new Thread(traverse).start();

    }

    public static void fileTraverse(File directory) throws IOException{

        if (!directory.exists()) {
            throw new IllegalArgumentException("The directory is not existent.");
        } else if (!directory.isDirectory()) {
            throw new IllegalArgumentException("The directory is not a directory.");
        }
        File[] files = directory.listFiles();

        if (files != null && files.length > 0) {
            for (File file : files
                    ) {
                if (!file.isDirectory()) {
                    if (file.getName().endsWith("java")) {
                        fileArrayList.add(file);
                    }
                    System.out.println(file.getAbsolutePath());
                } else {
                    System.out.println(file.getAbsolutePath());
                    fileTraverse(file);
                }
            }
        }

    }

    @Override
    public void run() {
        try {
            if (fileArrayList.size() > 0) {
                for (File file : fileArrayList
                        ) {
                    System.out.println(Thread.currentThread().getName() + "  " + file.getName());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


