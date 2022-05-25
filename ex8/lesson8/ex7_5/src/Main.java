import java.util.Scanner;

public class Main {
   public static int countFreq(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        int res = 0;

        /* un for pentru numara una cite una */
        for (int i = 0; i <= N - M; i++) {
            /* Pentru indexul i, verifica daca se potriveste*/
            int j;
            for (j = 0; j < M; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }

            // if pat[0...M-1] = txt[i, i+1, ...i+M-1]
            if (j == M) {
                res++;
            }
        }
        System.out.println(res);
        return M;
    }
    static public void main(String[] args) {
        Scanner sc=new Scanner( System.in );
              String txt = sc.nextLine();
        String pat = sc.nextLine();
        System.out.println(countFreq(pat, txt));
    }

    }

