public class Grid {
    
    public static Cell[][] grid;

    public Grid(){
        grid = new Cell[Main.HEIGHT][Main.WIDTH];
        for(int c = 0; c < Main.HEIGHT; c++){
            for(int r = 0; r < Main.WIDTH; r++){
                grid[c][r] = new Cell();
            }
        }
    }

    public String toString(){
        String ret = "";
        ret = ret + topRow();
        ret = ret + seperator();
        for(int c = 0; c < Main.HEIGHT; c++){
            ret = ret + Main.rightAlign("" + (c+1), Main.CELLWIDTH) + "|";
            for(int r = 0; r < Main.WIDTH; r++){
                ret = ret + grid[c][r].toString() + "|";
            }
            ret = ret + "\n";
            ret = ret + seperator();
        }
        return ret;
    }

    private static String topRow(){
        String ret = "";
        ret = ret + Main.spaces(Main.CELLWIDTH) + "|"; 
        for(int i = 0; i < Main.WIDTH; i++){
            ret = ret + Main.center("" + (char)('A' + i), Main.CELLWIDTH) + "|";
        }
        ret = ret + "\n";
        return ret;
    }

    private static String seperator(){
        String ret = "";
        for(int i = 0; i < Main.WIDTH+1; i++){
            ret = ret + Main.dashes(Main.CELLWIDTH) + "+";
        }
        ret = ret + "\n";
        return ret;
    }

    

}
