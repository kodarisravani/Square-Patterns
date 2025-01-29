public class SquarePatterns {
        public static void main(String[] args) {
            int n = 5; // size of the square
            printSquarePatterns(n);
        }
        public static void printSquarePatterns(int n) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }
    
