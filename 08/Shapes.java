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
}
