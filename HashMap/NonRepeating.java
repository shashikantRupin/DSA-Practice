// You are given an array of integers. Write a function to find the first
// non-repeating element in the array. If there is no such element, return -1.
import java.util.*;

public class NonRepeating {

      public static int findFirstNonRepeating(int[] nums) {
            // Create a hashmap to store the frequency of each element
            HashMap<Integer, Integer> map = new HashMap<>();

            // Iterate through the array to populate the hashmap
            for (int num : nums) {
                  if (map.containsKey(num)) {
                        map.put(num, map.get(num) + 1);
                  } else {
                        map.put(num, 1);
                }
            }

            // Iterate through the array again to find the first non-repeating element
            for(Map.Entry<Integer,Integer>i:map.entrySet()){
                if(i.getValue()==1){
                  return i.getKey();
                }
            }

            // If no non-repeating element is found, return -1
            return -1;
      }

      public static void main(String[] args) {
            int[] array1 = { 2, 3, 5, 3, 7, 2, 5 };
            int result1 = findFirstNonRepeating(array1);
            System.out.println("Output 1: " + result1);

      }
}
