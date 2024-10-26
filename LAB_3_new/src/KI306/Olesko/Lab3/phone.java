package KI306.Olesko.Lab3;

public class phone extends monitor implements TouchScreenimplement{
	private boolean Work;  // Touch screen operation status
	
	public phone() {
		
	}
	@Override
	public void turnOnTouchScreen() {
		// TODO Auto-generated method stub
		setWorks(true);
		n += 1;
        writeToLogFile(" p on "+n);
	}
	
	@Override
	public void turnOffTouchScreen() {
		setWorks(false);
		m+=1;
        writeToLogFile(" p off ");
	}
	public void setWorks(boolean work) {
		Work = work;
		writeToLogFile("");
	}
}
