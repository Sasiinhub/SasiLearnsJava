class ForTick {
  public static void main(String args[]) {
    int n;

    for(n=10; n>0; n--)
      System.out.println("tick " + n);
    }
}
\* often the variable that controls a for loop is needed only for the purpose of the loop and is not used elsewhere. When this is the case,
  it is possible to declare the variable inside the initialization portion of the for.
  \*
  *//Declaring a loop control variable inside the for.
  *class ForTick {
  *  public static void main(String args[]) {
  * 
  *//here, n is declared inside of the for loop
  * for(int n=10; n>0; n--)
    System.out.println("tick " + n);
  }
}
