public class Board {
    char[][] array;

    public Board(){
        array = new char[14][14];
        array[4][4] = '*';
        array[9][9] = '*';
    }

    public void addToBoard(int x, int y, char c){
        if(x < 0 || y < 0 || x > 13 || y > 13) throw new IllegalArgumentException("X or Y is too large or too small");
        if(array[y][x] != 0 && array[y][x] != '*') throw new IllegalArgumentException("Space is already used");

        array[y][x] = c;
    }

    public void printBoard() {
        for(int i=0; i<14;i++){
            //If number is above 10 print one less space to keep everything inline
            if(i < 10) System.out.print(i + "  ");
            else System.out.print(i + " ");

            for(int j=0;j<14;j++){
                if(array[i][j] != 0) System.out.print(array[i][j] + "  ");
                else System.out.print(".  ");
            }
            System.out.print("\n");
        }
        System.out.print("   ");
        for(int k=0; k<14; k++) {
            //If number is above 10 print one less space to keep everything inline
            if(k < 10) System.out.print(k + "  ");
            else System.out.print(k + " ");
        }
        System.out.print("\n");
    }
}
