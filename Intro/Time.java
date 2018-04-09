public class Time {
	public static void main (String[] args) {

		while (true) {

			// long time = System.currentTimeMillis();

			long timeInSeconds = System.currentTimeMillis()/1000;

			// int timeInMinutes = (int) timeInSeconds/60;

			// int timeInHours = ((int) timeInSeconds/60)/60;

			int currentHour = (((int) timeInSeconds/60)/60)%24;

			int currentMinute = ((int) timeInSeconds/60)%60;

			int currentSecond = (int) timeInSeconds%60;

			System.out.println(currentHour + ":"+ currentMinute + ":" + currentSecond + " GMT");
		}
	}
}