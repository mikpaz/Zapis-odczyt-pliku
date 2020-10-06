import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in,"Cp1250"));

        BufferedWriter out = new BufferedWriter(new FileWriter("nowy.txt"));
        try {
            System.out.println("Dane do pliku: ");
            String inputLine = null;
            do {
                inputLine=in.readLine();
                out.write(inputLine);
                out.newLine();
            } while (!inputLine.equalsIgnoreCase("koniec"));
            System.out.print("Zapisano");
        } catch(IOException e) {
            System.out.println("Blad zapisu pliku" + e);
        } finally {
            out.close();
            in.close();
        }
    }
}
