package uet.oop.bomberman;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Integer.parseInt;

public class FileIO {

    private String path = "D://high.txt";

    public int readFile() throws IOException {
        FileReader fr;
        BufferedReader br;
        fr = new FileReader(path);
        br = new BufferedReader(fr);
        String line = br.readLine();
        int high = 0;
        if (line != null) {
            high = parseInt(line);
        }

        System.out.println("R " + high);
        return high;
    }

    public void writeFile(Board board) throws IOException {
        try (FileWriter fileout = new FileWriter(path)) {
            int high = board.getHigh();
            fileout.write(String.valueOf(high));
            fileout.close();
        } catch (Exception e) {
            System.out.println("Writing error!");
        }
        System.out.println("w " + board.getHigh());
    }
}
