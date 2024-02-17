import java.util.Scanner;

class Solution {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    System.out.println("How many digits in the array?");
    int size = kbd.nextInt();
    System.out.println("enter the ints 1 at a time");
    int[] nums = new int[size];
    for (int i = 0; i < size; i++) {
      nums[i] = kbd.nextInt();
    }
    removeDuplicates(nums);
  }

  public static int removeDuplicates(int[] nums) {
    // current index that's available
    int index = 0;
    // how many spaces are to be removed
    int subtract = 0;
    for (int i = 0; i < nums.length; i++) {
      // if it's not the value then set the fist available index to the number being
      // looked at

      try {
        if (nums[i] != nums[i + 1]) {
          nums[index] = nums[i];
          index++;
        }
        // if it is the value then add 1 more space to be ignored
        else {

          subtract++;
        }
      } catch (Exception e) {
        nums[index] = nums[i];
      }
    }
    System.out.println("the new array");
    for (int i = 0; i < nums.length - subtract; i++) {
      System.out.println(nums[i]);
    }
    return nums.length - subtract;
  }
}