package stepCountProject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import stepCountProject.stepCountClass;

public class stepCountTest {
	
			//Set of Tests to compare the returned results with the correct Fib value
		
		@Test
		public void assertForBoundaryValue01() {
			int n=0;
			assertEquals(stepCountClass.countWays(n), 1);
			
		}
		
		@Test
		public void assertForBoundaryValue02() {
			int n=-1;
			assertEquals(stepCountClass.countWays(n), 0);
		}
		
		@Test
		public void assertForBoundaryValue03() {
			int n=1;
			assertEquals(stepCountClass.countWays(n), 1);
		}
		
		@Test
        public void assertForValidFibReturnValue(){
		    int n=6;
			assertEquals(stepCountClass.countWays(n), 13);
        }
		
	
}
