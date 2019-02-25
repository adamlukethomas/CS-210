package lab_01;

/**
 * CS-210 Lab Assignment 1:
 * 
 * @author adamlt
 * 
 *         1. Look at the available methods in theThreadclass. Is there a method
 *         that will let a thread sleep? How do you call it? [Beware of the
 *         exception.]
 * 
 *         2. Create a Java class that derives from theThreadclass. The run
 *         method of the class should write something to the screen, sleep for a
 *         little while, and then write something to the screen again before
 *         finally returning.
 * 
 *         3. Same as previous but as a class that implements
 *         theRunnableinterface.
 * 
 *         4. Write a Java program that creates one thread from each of the
 *         classes above and then starts them both. The program should wait
 *         until both threads have finished before ending.
 * 
 *         5. Create a Counter class using either of the above alternatives that
 *         has a private static tally, a public getValue method that returns the
 *         current tally, and whose run method increments the tally 10000000
 *         times.
 * 
 *         6. Run two Counter threads in parallel. What is the tally after both
 *         threads have terminated?
 * 
 *         7.[Optional] Repeat 2 in Haskell. That is, create and run a Haskell
 *         thread that prints,sleeps and prints before exiting. You will need to
 *         importControl.Concurrentand for sleeping you needthreadDelay.
 * 
 */

public class Demo_01 {

	public static void main(String[] args) {

		ExtendsMyThread extended = new ExtendsMyThread("EXTENDED_THREAD_1");

		ImplementsRunnable runnable = new ImplementsRunnable("RUNNABLE_THREAD_2");

		Counter counter = new Counter("COUNTER_THREAD_3");
		Counter counter2 = new Counter("COUNTER_THREAD_4");

	}

}
