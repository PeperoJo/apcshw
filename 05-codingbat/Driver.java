public class Driver {
    public static void main(String[] args){
	StringStuff s = new StringStuff();
	
	// nonStart()
	System.out.println("Testing nonStart()");
	System.out.println("nonStart('Hello','World') == " + s.nonStart("Hello","World"));
	System.out.println("nonStart('Bye','World') == " + s.nonStart("Bye","World"));
	System.out.println("nonStart('testing','123') == " + s.nonStart("testing","123"));
	System.out.println();

	//makeABBA()
	System.out.println("Testing makeABBA()");
	System.out.println("makeABBA('A','B') == " + s.makeABBA("A","B"));
	System.out.println("makeABBA('Hi','Bye') == " + s.makeABBA("Hi","Bye"));
	System.out.println("makeABBA('Alpha','Beta') == " + s.makeABBA("Alpha","Beta"));
	System.out.println();

	//diff21()
	System.out.println("Testing diff21()");
	System.out.println("diff21(17) == " + s.diff21(17));
	System.out.println("diff21(21) == " + s.diff21(21));
	System.out.println("diff21(42) == " + s.diff21(42));
	System.out.println();

	//nearHundred
	System.out.println(s.nearHundred(80));
	System.out.println(s.nearHundred(96));
	System.out.println(s.nearHundred(121));
	System.out.println(s.nearHundred(156));
	System.out.println(s.nearHundred(207));

	//TeaParty
	System.out.println(s.teaParty(3,7));
	System.out.println(s.teaParty(3,2));
	System.out.println(s.teaParty(11,5));
	System.out.println(s.teaParty(6,8));
	System.out.println(s.teaParty(11,5));

	//lastDigit
	System.out.println(s.lastDigit(11,5,21));
	System.out.println(s.lastDigit(11,5,21));
	System.out.println(s.lastDigit(23,33,43));
	System.out.println(s.lastDigit(11,5,55));
	System.out.println(s.lastDigit(11,5,20));


    }
}
