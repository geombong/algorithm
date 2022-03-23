package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class FindString {
    public static void main(String[] args) throws IOException {
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        String str = buf.readLine().toLowerCase(Locale.ROOT);
        String ch = buf.readLine().toLowerCase(Locale.ROOT);
        int count = 0;
        for (String s : str.split("")) {
            if (s.equals(ch)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
