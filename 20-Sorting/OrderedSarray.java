public class OrderedSarray {
    private String[] data;
    private int nextspace;
    private Random rnd;

    //Constructor
    public Sarray(int i) {
	data = new String[i];
	nextspace = 0;
    }

    //Helper Methods
    public String printArray(String[] StringArray) {
	String s = "{";
	for (int i = 0; i < StringArray.length; i++){
	    s = s + StringArray[i] + ", ";
	}
	return s.substring(0,s.length() - 2) + "}";
    }

    public void add1index() {
	String[] data2 = new String[data.length + 1];
	for (int index = 0; index < data.length; index++) {
	    data2[index] = data[index];
	}
	data = data2;
    }

    //Main Methods
    public boolean add(String s) {
	if (data[data.length - 1] != null){
	    add1index();
	}
	while (data[nextBlank] != null) {
	    nextspace++;
	}
	data[nextspace] = s;
	nextspace++;
	return true;
    }

    public String get(int index) {
	if (index > data.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	}
        return data[index];
    }

    public String set(int index, String s) {
	if (index > data.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	} 
	String oldVal = get(index);
	data[index] = s;
	return oldVal;
    }
    
    public int size() {
        return data.length;
    }
     public static void main(String[] args){
	Sarray s = new Sarray(10);
	System.out.println(s.printArray(s.data));
	s.add("one");
	s.add("two");
	s.add("three");
	s.add("four");
	s.add("five");
	s.add("six");
	s.add("seven");
	s.add("eight");
	s.add("nine");
	s.add("ten");
	System.out.println(s.printArray(s.data));
     }
}
