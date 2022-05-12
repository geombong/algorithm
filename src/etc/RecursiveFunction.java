package etc;

class RecursiveFunction {
    static class Main {
        public int dfs(int n) {
            if (n == 1) return 1;
            else return n * dfs(n - 1);
        }

        public static void main(String[] args) {
            Main main = new Main();
            System.out.println(main.dfs(4));
        }
    }
}
