public class Thursday {
 public static void main (String[] args) {
 }

 public static boolean checkPeople (int people) {
	if ( people > 30 ) {
	 return true;
	} else {
	 return false;
	}
 }

 public static boolean alarmHandler (int number, String alarmStatus) {
	switch ( alarmStatus ) {
	 case "red":
		return false;
	 case "yellow":
		return number <= 30;
	 case "green":
		return number <= 60;
	}
	return true;
 }
}
