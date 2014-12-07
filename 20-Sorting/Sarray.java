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
     public void isort() {
	for (int n = 1; n < data.length; n++) {
	    int i;
	    String s = data[n];
	    for (i = n; i > 0 && s.compareTo(data[i-1]) < 0; i--) {
		data[i] = data[i-1];
	    }
	    data[i] = s;
	}
    }
    public void selectionSort(int[] arr) {
      int i, j, minIndex, tmp;
      int n = arr.length;
      for (i = 0; i < n - 1; i++) {
            minIndex = i;
            for (j = i + 1; j < n; j++)
                  if (arr[j] < arr[minIndex])
                        minIndex = j;
            if (minIndex != i) {
                  tmp = arr[i];
                  arr[i] = arr[minIndex];
                  arr[minIndex] = tmp;
            }
      }
}
public void bubbleSort(int[] a) {
      boolean swapped = true;
      int j = 0;
      int tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < a.length - j; i++) {                                       
                  if (a[i] > a[i + 1]) {                          
                        tmp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
}

}
