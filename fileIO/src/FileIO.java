import java.io.*;

public class FileIO {
    public static void main(String[] args) throws IOException {

        File file = new File("fileIO/donut.txt");

        if (file.exists()) {
            System.out.println(file.isFile());
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            //file.delete();
        }
        else {
            System.out.println("The file doesn't exist...");
        }

        FileWriter writer = new FileWriter("fileIO/password.txt");

        try {
            writer.write("Here is my password.\n");
            writer.append("\n...I cannot remember what it was.");
            //System.out.println("Task completed successfully");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            writer.close();
        }

        FileReader reader = new FileReader("fileIO/donut.txt");

        try {
            int data;

            do {
                data = reader.read();
                System.out.print((char) data);
            } while (data != -1);
        }
        //catch (FileNotFoundException e) {
        //    e.printStackTrace();
        //}
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            reader.close();
        }
    }
}
