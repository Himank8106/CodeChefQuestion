/* Link - https://www.codechef.com/problems/MIME2 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        sc.nextLine
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String extension = sc.next();
            String mediaType = sc.next();
            hm.put(extension, mediaType);
        }
        sc.nextLine(); 
        String[] arr = new String[q];
        for (int i = 0; i < q; i++) {
            arr[i] = sc.nextLine();
            String[] s = arr[i].split("\\.");
            if (s.length > 1 && hm.containsKey(s[s.length - 1])) {
                System.out.println(hm.get(s[s.length - 1]));
            } else {
                System.out.println("unknown");
            }
        }
    }
}
