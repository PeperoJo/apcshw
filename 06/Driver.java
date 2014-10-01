public class Driver{
	// Coding time: 7 minutes

	public String frontTimes(String str, int n) {
		
		if (str.length() >= 3) {
			str = str.subString(0,3);
		}
		while (n > 0) {

			str =+ str;
			n--;	
		}
		return str;
	}

	// Coding time: 9 minutes
	public String stringBits(String str) {
		
		int n = 0;

		String everyother  = new String();

		while (n <= str.length()) {

			if (n % 2 == 0) {				
				everyother =+ str.subString(n,n+1);
			}
			n++;
		}
		return result;
	}

	// Coding time: 8 minutes
	public String stringYak(String str) {
		int n = 0;
		while (n < str.length()) {			
			if (str.subString(n,n+1) == "y" && str.subString(n+2,n+3) == "k") {	
				str = str.subString(0,n) + str.subString(n+3);
			}
			else n++;
		}
		return str;
	}

	// Coding time: 27 minutes
	public int stringMatch(String a, String b) {
		int counter = 0;
		int position = 0;
		if (b.length() > a.length()) {
		    String temp = a;}
		else {
			a = b;
			b = temp;
		}
		while (position < (a.length() - 1)) {
			if (a.subString(position, position + 2) == b.subString(position, position + 2)) {
				counter++;			
			}
			position++;		
		}
		return counter;
	}
}
