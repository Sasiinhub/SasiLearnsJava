// demonstrate the do-while loop
class DoWhile {
  public static void main(String args[]) {
    int n = 10;

    do {
      System.out.println("tick " = n);
      n--;
    } while(n>0);
  }
}
// can be written more efficiently as
// do {
// System.out.println("tick " + n);
// } while(--n > 0);
//}
//}
