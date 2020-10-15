package WorkWithFIles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class assign {
    public void createFile() {
        try {
            File f = new File("MyFiles");
            f.mkdir();
            File file = new File("MyFiles/data.txt");
            FileWriter write = new FileWriter("MyFiles/data.txt");
            write.write("24, 39 , -40");
            write.close();
            System.out.println(file.createNewFile());
        } catch( Exception e) {
            e.printStackTrace();
        }
    }

    public void writeNums() {
        try {
            FileWriter file = new FileWriter("MyFiles/data1.txt");
            for(int i =0; i < 100; i++) {
                file.write(i + "\n");
            }
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void programmer() {
        try{
            File f = new File("MyFiles1");
            f.mkdir();
            for(int i = 0; i < 30; i++) {
                FileWriter files = new FileWriter("MyFiles1/mariam" + i + ".txt");
                files.write("programmer");
                files.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void programmernums() {
        try{
            File f = new File("MyFiles2");
            f.mkdir();
            for(int i = 0; i < 30; i++) {
                FileWriter files = new FileWriter("MyFiles2/mariam" + i + ".txt");
                files.write("programmer" + i);
                files.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
