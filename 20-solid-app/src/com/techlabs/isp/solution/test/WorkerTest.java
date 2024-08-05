package com.techlabs.isp.solution.test;
import com.techlabs.isp.solution.model.IWorkable;
import com.techlabs.isp.solution.model.Labour;
import com.techlabs.isp.solution.model.Robot;
import com.techlabs.isp.solution.model.ILunchInterval;
public class WorkerTest {
	public static void main(String[] args) {
		IWorkable labour = new Labour();
		labour.start();
		labour.stop();
		ILunchInterval labour1 = new Labour();
		labour1.drink();
		labour1.eat();
		IWorkable robot = new Robot();
		robot.start();
		robot.stop();
		
	}

}
