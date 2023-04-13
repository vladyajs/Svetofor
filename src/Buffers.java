import java.io.*;
public class Buffers {
    public static void main(String[] args) throws IOException {
        /*BufferedWriter buff = new BufferedWriter(new FileWriter("C:\\Users\\user\\Desktop\\JavaTest.txt"));
        String s = "Hello Java";
        buff.write(s);
        buff.close();*/

        BufferedReader buff = new BufferedReader(new FileReader("C:\\\\Users\\\\user\\\\Desktop\\\\JavaTest.txt"));
        int c;
        while ((c=buff.read())!=-1){
            System.out.println((char)c);
        }
        buff.close();

    }
}
