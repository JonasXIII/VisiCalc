import java.util.Scanner;

public class UserIO {
    Grid grid;
    Scanner scan;
    public UserIO(Grid grid){
        this.grid = grid;
    }
    public String getInstruct(){
        scan = new Scanner(System.in);
        System.out.print(Main.INSTRUCT_PROMPT);
        String ret = scan.nextLine();
        
        return ret;
    }

    public boolean handleInstruct(){
        String inst = getInstruct();
        if(inst.equalsIgnoreCase("help") || inst.equalsIgnoreCase("h")){
            System.out.println(Main.HELP);
            return true;
        }
        if(inst.equalsIgnoreCase("draw")) {
            System.out.println(grid);
            return true;         
        }
        if(inst.equalsIgnoreCase("quit")||inst.equalsIgnoreCase("q")){
            scan.close();
            return false;
        }
        scan.close();
        return false;
    }
}
