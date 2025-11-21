package morgan;

import java.util.HashSet;
import java.util.Scanner;

public class ExameCopy {


        public static String swapString(String s, int i, int j) {
            char[] b = s.toCharArray();
            char temp;
            temp = b[i];
            b[i] = b[j];
            b[j] = temp;
            return String.valueOf(b);
        }

        public static void generatePermutation(String s, int start, int end, HashSet< String > set) {

            if (start == end - 1)
                set.add(s + " ");
            else {
                for (int i = start; i < end; i++) {
                    s = swapString(s, start, i);
                    generatePermutation(s, start + 1, end, set);
                    s = swapString(s, start, i);
                }
            }

        }
        public static int maxDiff(String str, String s) {
            int c = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == str.charAt(i));
                else
                    c++;
            }
            return c;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            String[] a = new String[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.next();
            }
            for (int i = 0; i < n; i++) {
                HashSet < String > set = new HashSet < String > ();
                String s = a[i];
                generatePermutation(s, 0, s.length(), set);
                int max = 0;
                int k = 0;
                for (String str: set) {

                    k = maxDiff(str, s);
                    max = Math.max(max, k);

                }
                System.out.println(max);
            }
        }

    }

