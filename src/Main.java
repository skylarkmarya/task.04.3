import java.io.*;
import java.util.Scanner;
public class Main {
    private String s;
    private StringBuilder sb = new StringBuilder();

    private void readFile() {
        File file = new File("D:\\My tasks\\JAVA\\MASHA JAVA\\S0403\\src\\text8.txt");
        try {
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(file), "UTF8"));
            Scanner scanner = new Scanner(in);
            while (scanner.hasNextLine()){
                sb.append(scanner.next()+" ");
            }
            s = new String(sb);
            in.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void writeFile(String text) {
        try (
                BufferedWriter fos = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream("D:\\My tasks\\JAVA\\MASHA JAVA\\S0403\\src\\text16.txt"), "UTF16"))){
            fos.write(text);
            fos.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(text);
    }
    public static void main(String[] args) {
        Main r = new Main();
        r.readFile();
        String[] words = r.s.split(" ");
        String text = "";
        for (String w: words){
                text = text + " " + w;
        }
        r.writeFile(text);
    }
}
