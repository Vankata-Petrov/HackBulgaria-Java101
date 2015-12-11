package task24;

import java.util.Calendar;

public class Time {
	private int hour;
	private int mins;
	private int secs;
	private int day;
	private int month;
	private int year;
	
	Time(int hour, int mins, int secs, int day, int month, int year)
	{
		setHour(hour);
		setMinutes(mins);
		setSeconds(secs);
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	
	public void setHour(int hour)
	{
		this.hour = hour;
	}
	
	public void setMinutes(int mins)
	{
		this.mins = mins;
	}
	
	public void setSeconds(int secs)
	{
		this.secs = secs;
	}
	
	public void setDay(int day)
	{
		this.day = day;
	}
	
	public void setMonth(int month)
	{
		this.month = month;
	}
	
	public void setYear(int year)
	{
		this.year = year;
	}
	
	public int getHour()
	{
		return this.hour;
	}
	
	public int getMinutes()
	{
		return this.mins;
	}
	
	public int getSeconds()
	{
		return this.secs;
	}
	
	public int getDay()
	{
		return this.day;
	}
	
	public int getMonth()
	{
		return this.month;
	}
	
	public int getYear()
	{
		return this.year;
	}
	
	public String toString()
	{
		String res = "";
		return res.format("%02d:%02d:%02d %02d.%02d.%04d", 
				           hour, mins, secs, day, month, year);
	}
	
	public static Time now() 
	{
		Calendar cal = Calendar.getInstance();

		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int month = cal.get(Calendar.MONTH);
		int year = cal.get(Calendar.YEAR);

		return new Time(hour, minute, second,
				        day, month, year);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time a = new Time(5,3,20,3,2,1994);
		System.out.println(a.toString());
		System.out.println(now());
	}

}
