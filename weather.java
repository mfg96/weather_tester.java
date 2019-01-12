
import java.lang.Math;
import java.math.*;

/**
 * weather object class
 * @author mfarazsohail
 *
 */
public class weather {

	private int tempF; // Temp in F
	private int windSpeed; //wind speed in mph
	private double windChill;
	private boolean severe;
	
	/**
	 * normal constructor
	 */
	public weather() {
		tempF=0;
		windSpeed=0;
		windChill=0;
	}
	
	/**
	 * overloaded constructor
	 * @param tempF
	 * @param windSpeed
	 */
	public weather(int tempF, int windSpeed) {
		this();
		setTempF(tempF);
		setWindSpeed(windSpeed);
		
	}
	
	/**
	 * getting value constructor
	 * @param W
	 */
	public weather(weather W) {
		
		tempF=W.getTempF();
		windSpeed=W.getWindSpeed();
		
	}
	
	/**
	 * getters and setters methods
	 * @return
	 */
	public int getTempF() {
		if(tempF>=(-50)&&tempF<=150)
			return tempF;
		else
			return 0;
	}

	public void setTempF(int tempF) {
		this.tempF = tempF;
	}

	public int getWindSpeed() {
		if(windSpeed>0) 
			return windSpeed;
		else
			return 0;
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}
	
	/**
	 * method to calculate windchill
	 * @return
	 */
	public double getWindChill() {
		
		windChill=35.74+0.6215*(double)tempF-35.75*(Math.pow((double)windSpeed, 0.16))+0.4275*(double)tempF*(Math.pow((double)windSpeed, 0.16));
		return windChill;
	}
	
	/**
	 * method to check the severity 
	 * @return
	 */
	public boolean isSevere() {
		
		if(windChill<-15)
			return true;
		else
			return false;
	}
	
	//severe= isSevere(windChill);
	
	/**
	 * method to print the string
	 */
	public String toString() {
		
		if(isSevere()==true)
			return "The temp is "+tempF+" but feels like "+(Math.ceil(windChill*100))/100+" and wind speed is "+windSpeed+" and the weather is severe.";
		else
			return "The temp is "+tempF+" but feels like "+(Math.ceil(windChill*100))/100+" and wind speed is "+windSpeed+" and weather is not severe.";
	}
	
}
