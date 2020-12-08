import java.io.*;
import java.util.ArrayList;

public class FileLoader {

    public ArrayList<String> info = new ArrayList<>();

    public FileLoader() {

    }

    public void reading() {

        File file = new File("userData.txt");

        try {

            FileReader fr = new FileReader(file);
            BufferedReader bfr = new BufferedReader(fr);

            String line = bfr.readLine();

            while (line != null) {

                info.add(line);
                line = bfr.readLine();
            }

            bfr.close();

        } catch (FileNotFoundException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<String> getInfo() {
        return info;
    }
}
