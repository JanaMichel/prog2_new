package Vorlesung3Part2;

public class UmrechnungTimeZeit 
{
	public String convert(String time)
	{
		final int LAST_THREE_CHARS = 3; // pm oder am
		if(time.endsWith("am"))
		{
			return time.substring(0, (time.length()-LAST_THREE_CHARS));
		}
		else // endet mit pm
		{
			final int DIFF = 12;
			int hourInt = this.getHoursInt(time);
			hourInt+=DIFF;
			String minutes = this.getMinutesStr(time);
			String zeit = hourInt + ":" + minutes;
			return zeit;
		}
	}
	
	String getHoursString(String time)
	{
		String[] allStr = time.split(":");
		return allStr[0];
	}
	
	String getMinutesStr(String time)
	{
		final int FIRST_TWO_CHARS = 2;
		String[] allStr = time.split(":");
		String afterDoppel = allStr[1];
		String minutesStr = afterDoppel.substring(0, FIRST_TWO_CHARS);
		return minutesStr;
	}
	
	int getHoursInt(String time)
	{
		String hoursStr = this.getHoursString(time);
		int hourInt = Integer.valueOf(hoursStr);
		return hourInt;
	}
}
