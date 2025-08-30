// the target of a loop can be empty.
class NoBody {
    public staic void main("String args[]) {
      int i, j;

  i=100;
  j= 200;

  //find midpoint between i and j
  while(++i < --j); //no body in the loop

  System.out.println("MidPoint is " + i);
    }
}
