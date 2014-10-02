public class Shapes {
    public String tri1(int h) {
	String s = "";
	int rowcounter = 1;
	while (rowcounter <= h){
	    int columncounter = 1;
	    while (columncounter<=rowcounter){
		s += "*";
		columncounter += 1;
	    }
	    s = s + "\n";
	    rowcounter += 1;
	}
	return s;
    }
    public String tri2(int h) {
	String s = "";
	int rowcounter = 1;
	while (rowcounter<=h) {
	    int spacecounter = rowcounter;
	    int columncounter = 1;
	    while (spacecounter+1 <= h){
		s += " ";
		spacecounter += 1;
	    }
	    while (columncounter<=rowcounter){
		s += "*";
		columncounter += 1;
	    }
	    s=s+"\n";
	    rowcounter += 1;
	}
        return s;
    }
}
