package KI306.Olesko.Lab3;

public class monitorapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		monitor monitor = new  monitor();
		monitor.clearLogFile();
		monitor.status();
		monitor.addCount(5);
		monitor.addPrice(200);
		monitor.buy(3);
		monitor.changeType("AAADC47");
		monitor.changeVersion("DDF212");
		monitor.checkAdditional();
		monitor.changeAdditionalDevices("loudspeakers");
		monitor.turnOffAvailable();
	}

}
