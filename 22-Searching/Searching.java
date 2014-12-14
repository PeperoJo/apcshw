import java.util.*;
import java.io.*;

public class Searching {

    static Random r = new Random();
    private Comparable[] a1;

    public Searching(int x) {
	a1 = new Comparable [x];
	
    }

    public String toString() {
	String finale = "[";
	for (int i=0; i < a1.length; i++){
	    finale = finale + a1[i] + ",";
	}
	finale = finale.substring(0, finale.length()-1) + "]";
	return finale;
    }

    public void additem(int index, Comparable item) {
	Comparable[] a2 = new Comparable [a1.length + 1];
	for (int i=0; i<index; i++) {
	    a2[i] = a1[i];
	}
	a2[index] =  item; 
	for (int i=index+1; i<a1.length+1; i++) {
	    a2[i] = a1[i-1];
	}
	a1 = a2;
    }
    
    
    public void additem(Comparable item) {
       	int nullspot = -1;
	for (int i=a1.length-1; i>=0; i--) {
	    if (a1[i]==null){
		nullspot = i;
	    }
	}
	if (nullspot != -1) {
	    a1[nullspot] = item;
	}
	else additem((a1.length), item);
    }

    public void sort() {
	Arrays.sort(a1);
    }

    public Comparable lsearch(Comparable x) {
	for int (int i = 0; i < a1.length; i++) {
		if (a1[i]==x) {
		    return x;
		}
	    }
	return null;
    }

    public Comparable bsearch(Comparable x) {
	int low = 0;
	int high = ca.length - 1;
	int mid = (low + high) / 2;
	while (low <= high) {
	    if (a1[mid]==x) {
		return x;
	    } else {
		if (x.compareTo(a1[mid]) > 0) {
		    low = mid + 1;
		} else {
		    high = mid - 1;
		}
	    }
	    mid = (low + high) / 2;
	}
	return null;
    }

    public Comparable rbsearch(Comparable x, int low, int high) {
	int mid = (low + high) / 2;
	if (low <= high) {
	    if (a1[mid]==c) {
		return c;
	    } else {
		if (x.compareTo(a1[mid]) > 0) {
		    return rbsearch(x, mid + 1, high);
		} else {
		    return rbsearch(x, low, mid - 1);
		}
	    }
	} else {
	    return null;
	}
    }

    public Comparable rbsearch(Comparable x) {
	return rbsearch(x, 0, ca.length - 1);
    }




    public static void main(String[] args) {
	Searching s = new Searching(10);
	int[] randomthings = {1,2,3};
    	System.out.println("Before:\n"+ s.toString());
	//System.out.println(s.a1.length);
	for (int i=0; i<s.a1.length; i++) {
	    s.additem(r.nextInt(100));
	}
	//s.additem(1, "hello");
	System.out.println("Adding:\n" + s.toString());
	s.sort();
	System.out.println("Sorting:\n" + s.toString());
	System.out.println(s.toString());
    }
}
