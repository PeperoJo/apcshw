import java.util.Random;

/**
 * Creates a word search puzzle
 *
 */
public class WordSearch{

    private Random r = new Random();
    private char[][] board;

    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
				
    }
    public WordSearch(){
	this(20,30);
    }

    public String toString(){
	String s = "";

	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }

		
    public boolean addWordHelper(String w,int row, int col,int deltaRow, int deltaCol){
	int r = row, c = col;
				
	for (int i=0;i<w.length();i++){
	    try {
		if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
		    return false;
		}
	    } catch ( Exception e){
		return false;
	    }
	    r = r + deltaRow;
	    c = c + deltaCol;
	}
	r = row;
	c = col;

	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    r = r + deltaRow;
	    c = c + deltaCol;
	}
	return true;
    }

    public boolean addWord(String w) {
	int row = r.nextInt(board.length);
	int col = r.nextInt(board[0].length);
	int deltaRow = -1 + r.nextInt(3);
	int deltaCol = -1 + r.nextInt(3);

	if (deltaRow == 0 && deltaCol == 0)
	    return false;
	
	return addWordHelper(w,row,col,deltaRow,deltaCol);
	
	

    }

    public String fillIn(){
	String f  = "";

	for (int i = 0; i < board.length; i++) {
	    String alpha = "abcdefghijklmnopqrstuvwxyz";
	    for (int j = 0; j < board[i].length; j++) {
		if (!(board[i][j]=='.')){
		    f = f + board[i][j];
		}
		else f = f + alpha(r.nextInt(alpha.length));
	    }
	    f = f + "\n";
	}
	return f;
    }
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	
	w.addWord("hello0");
	w.addWord("hello1");
	w.addWord("hello2");
	w.addWord("hello3");
	w.addWord("hello4");
	w.addWord("hello5");
	w.addWord("hello6");
	w.addWord("hello7");
	w.addWord("hello8");
	w.addWord("hello9");
	System.out.println("[Answer key]\n"+w);
	System.out.println();
    }
}

//user decides how many inputs
//size of the board
//answer key
//reads txt file
