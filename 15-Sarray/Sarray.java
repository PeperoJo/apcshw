public class Sarray {
    int[] data;
    int   last;

    public Sarray(int[] d) {
	data = d;
    }

    public boolean add(int i){
        int[] data2 = int[data.length + 1];
	for(int a= 0; a<length.data; a++){
	    data2[a] = data[a];
	}
	data2[length.data+1] = i;
	int[] data = new int[] data2;
	return true;
    }

    public void  add(int index, int i){
	int[] data2 = int[data.length + 1];
	for(int a=0; a < index; a++){
	    data2[a] = data[a];
	}
	data2[index] = i;
	for(int a=index; a < data.length; a++){
	    data2[a+1] = data[a];
	}
	int[] data = new int[] data2;
    }

    public int size() {
        return data.length;
    }

    public int get(int index) {
	return data[index];
    }

    public int set(int index, int i){
        return data[index];
	data[index]=i;
    }

    public int remove(int index){
	int[] data2 = int[data.length - 1];
        for(int a=0; a < index; a++){
            data2[a] = data[a];
	}
        for(int a=index; a < data.length-1; a++){
            data2[a-1] = data[a];
        }
        int[] data = new int[] data2;
    }
}
