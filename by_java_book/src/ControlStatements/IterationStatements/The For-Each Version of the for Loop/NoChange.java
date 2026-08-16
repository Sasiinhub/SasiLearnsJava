// the for-each loop is esentially read - only.
class NoChange {
    public static void main(String args[]) {
      int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

      for(int x : nums) {
        System.out.print(x + " ");
        x = x *10; // no effect on nums) {
      }
      System.out.println();

  for( int x : nums)
    System.out.print(x + " ");

  System.out.println();
    }
} 
/* the one of the important point to understand about the for-each style loop.
    its iteration variable is " read only" as it relates to the underlying array. 
    An assignment  to the iteration statement has no effect on the underlying array. 
    in other words we can't change the contents of the array by assigning the iteration variable a new value. 
    the first for loop increases the value of the iteration variable by a factor of 10. However this assignment has no effect on underlying 
    array nums, as the second for loop illustrates.
    the output proves this point. */
