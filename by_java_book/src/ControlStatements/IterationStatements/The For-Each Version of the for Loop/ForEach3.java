// use for-each style for on a two-dimentional array.
class ForEach3 {
  public static void main(String args[]) {
    int sum = 0;
    int [][] nums = new int [3][5];

  // give nums some values
  for(int i = 0; i < 3; i++)
    for( int j = 0; j< 5; j++)
      nums[i][j] = (i+1)*(j+1);

  //use for-each for to display and sum the values
  for(int[] x : nums) {
    for(int y : x) {
      System.out.println("Value is: " + y);
      sum += y;
    }
    System.out.println("Summation: " + sum);
  }
  }
  /*
in this program pay attention to this line:
for(int [] x: nums) {
 Notice how x is declared. it is a reference to a one-dimentional array of intergers. 
 this is necessory because each iteration of the for 
 obtains the next array in nums, beggining with the array specified by nums[0].
 the inner for loop then cycles through each of these arrays, displaying the values of the each element.
  */
  
