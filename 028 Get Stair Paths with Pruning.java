//Link: https://www.pepcoding.com/resources/online-java-foundation/recursion-with-arraylists/get-stair-paths-official/ojquestion
//TC : O(3 ^ N)
//RS: O(N)
import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     ArrayList<String> res = getStairPaths(n);
     System.out.println(res);
  }

  public static ArrayList<String> getStairPaths(int n) {
        
        
      //positive base    
      if(n == 0) {
          ArrayList<String> res = new ArrayList<>();
          res.add("");
          return res;
      }    
        
      ArrayList<String> res = new ArrayList<>();
      
      if(n > 0) {
            ArrayList<String> smallAns1 = getStairPaths(n - 1);
            for(String path : smallAns1) {
              res.add("1" + path);
            }
      }
      
      if(n > 1) {
            ArrayList<String> smallAns2 = getStairPaths(n - 2);
            for(String path : smallAns2) {
              res.add("2" + path);
            }
      }
      
      if(n > 2) {
            ArrayList<String> smallAns3 = getStairPaths(n - 3);
            for(String path : smallAns3) {
                res.add("3" + path);
            }
      }
      
      
      return res;
  }

}
