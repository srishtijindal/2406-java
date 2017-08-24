import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Comparator;
import java.io.IOException;
import java.util.StringTokenizer;
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

}
class EvenEntryLoop {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner br = new Scanner(System.in);
        while (true) {
            int a = br.nextInt();
            if (a % 2 == 0) {
                System.out.println("Good job!");
            } else if (a == 999)
                break;
            else {
                System.out.println("Not an even number. Enter Again");
            }
        }
    }
}