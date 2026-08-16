/** 
boolean done = false

for(int i+1; !done; i++; {

for(int i=1; !done; i++) {
//....
  if(interrupted()) done = true;
  }
  //*this is one type of variation*
  */


//Parts of the for loop can be empty.
class ForVar {
  public static void main(String args[]) {
    int i;
    boolean done = false;

   i = 0;
    for( ; !done; ) {
      System.out.println(" i is " + i);
      if(i == 10) done = true;
      i++;
    }
  }
}
