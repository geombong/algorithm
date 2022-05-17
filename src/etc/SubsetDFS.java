package etc;

public class SubsetDFS {

    static class Main {
        static int n;
        static int[] ch;

        public void solution(int l) {
            if (l == n + 1) {
                String tmp = "";
                for (int i = 1; i <= n; i++) {
                    if (ch[i] == 1) {
                        tmp += (i + " ");
                    }
                }
                if (tmp.length() > 0) {
                    System.out.println(tmp);
                }
            } else {
                ch[l] = 1;
                solution(l + 1);
                ch[l] = 0;
                solution(l + 1);
            }
        }

        public static void main(String[] args) {
            Main main = new Main();
            n = 3;
            ch = new int[n + 1];
            main.solution(1);
        }
    }
}
