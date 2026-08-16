// Demonstrate return.
class Return {
	public static void main(String[] args) {
		boolean t = true;
		
		System.out.println("Before the return.");
		
		if(t=false;) return; // return to caller

		System.out.printtln("This won't execute.");
		}
}
/*the last control statement is return. the return statement is used to explicitly return form a method. that is,
it causes program control to transfer back to the caller of the method.
As such, it is categorized as a jump statement.
a brief look at return is presented here. (more chp 6).
At any time in a method,
the return statement can be  used to cause execution to branch back to the caller of the method.
thus the return statement remediatelly terminates the method in which it is executed.
this example prog illustrates this point.
here return causes execution to return to the java runtime system,
since it is  the run-time system that calls main(): */
