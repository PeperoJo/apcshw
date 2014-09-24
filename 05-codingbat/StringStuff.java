public class StringStuff {

//Nonstart
public String nonStart(String a, String b) {
    return a.substring(1)+b.substring(1);
}

//makeABBA
public String makeABBA(String a, String b) {
    return a+b+b+a;
}

//diff21
public int diff21(int n) {
    if (n>21) 
	{return 2*n-42;}
    else
	{return 21-n;}
}

//nearHundred
public boolean nearHundred(int n) {
  if (Math.abs(200 -n)<=  10)
  return true;
  else if (Math.abs(100 -n) <= 10)
  return true;
  else return false;
}

    //mixStart
 public boolean mixStart(String str) {

  if (str.length() < 3) return false;  

  String two = str.substring(1, 3);
  
  if (two.equals("ix")) {
    return true;
  } else {
    return false;
  }
 }

    //TeaParty
public int teaParty(int tea, int candy) {
  if (tea <5 || candy <5)
  return 0;
  else if ((tea <= 0.5*candy) || (candy <= 0.5*tea))
  return 2;
  else return 1;
 
  }

    // lastDigit
public boolean lastDigit(int a, int b, int c) {
  int lasta = a%10;
  int lastb = b%10;
  int lastc = c%10;
  if (lasta == lastb && lastb == lastc)
  return true;
  else if (lasta == lastb)
  return true;
  else if (lasta == lastc)
  return true;
  else if (lastb == lastc)
  return true;
  else return false;
}

}
