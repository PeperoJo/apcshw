public class Shapes {
    public String frame(int a, int b) {
	String s = "";
	int rowcounter = 1;
	while (rowcounter <= a){
	    int columncounter = 1;

	    if (rowcounter==1 || rowcounter==a){
		s += "*";
		while (columncounter+2<=b){
		    s+= " ";
		    columncounter++;
		}
		s += "*"+"\n";
	    }


	    else {
		s += "*";
		while (columncounter+2<=b){
		    s+= " ";
		    columncounter++;
		}
		s += "*"+"\n";
	    }
	    rowcounter++;
	}
	return s;
    
    }
    public String stringSplosion(String str) {
	String result = "";
	for (int i=0; i<str.length(); i++) {
	    result = result + str.substring(0, i+1);
	}
	return result;
    }

    public String stringX(String str) {
	String result = "";
	for (int i=0; i<str.length(); i++) {

	    if (!(i > 0 && i < (str.length()-1) && str.substring(i, i+1).equals("x"))) {
		result = result + str.substring(i, i+1);
	    }
	}
	return result;
    }
}

