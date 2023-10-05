package KI306.Olesko.Lab3;
/**
 * monitor Application class implements main method for TouchScreenimplement
 class possibilities demonstration
 *
 * @author Olesko Bohdan
 * @version 1.0
 * @since version 1.0
 */
public class monitorapp {

	public static void main(String[] args) {
		TouchScreen monitor = new TouchScreen();
		TouchScreen monitor1 = new TouchScreen();
		TouchScreen monitor2 = new TouchScreen();
		phone sam = new phone();
		phone sam1 = new phone();
		phone sam2 = new phone();
		phone sam3 = new phone();
		monitor.clearLogFile();
		sam.turnOffTouchScreen();
		sam1.turnOnTouchScreen();
		sam2.turnOnTouchScreen();
		sam3.turnOffTouchScreen();
		monitor.turnOffTouchScreen();
		monitor1.turnOnTouchScreen();
		monitor2.turnOnTouchScreen();
		monitor2.turnOffTouchScreen();
		System.out.println(monitor.n+" on");
		System.out.println(monitor.m+" off");
	}

}