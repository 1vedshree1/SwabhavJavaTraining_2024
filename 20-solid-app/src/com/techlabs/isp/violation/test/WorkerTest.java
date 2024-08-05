package com.techlabs.isp.violation.test;
import com.techlabs.isp.violation.model.IWorker;
import com.techlabs.isp.violation.model.Labour;
import com.techlabs.isp.violation.model.Robot;
public class WorkerTest {
	public static void main(String[] args) {
		IWorker labour = new Labour();
		labour.startWork();
		labour.stopWork();
		labour.drink();
		labour.eat();
		IWorker robot = new Robot();
		robot.startWork();
		robot.stopWork();
		robot.drink();
		robot.eat();
	}
	

}
