import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class FileWriter {

    public FileWriter() {

    }

    public void save() {
        File file = new File("userData.txt");

        try {

            FileOutputStream fos = new FileOutputStream(file, true);

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }

        PrintWriter pw = null;

        try {

            pw = new PrintWriter(file);

            FileLoader fl = new FileLoader();

            for (String line : fl.getInfo()) {
                System.out.println(line);
            }

            pw.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        }
    }
}
