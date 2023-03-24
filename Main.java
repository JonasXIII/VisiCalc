class Main{
    public static final int WIDTH = 7;
    public static final int HEIGHT = 10;
    public static final int CELLWIDTH = 7;
    public static final String INSTRUCT_PROMPT = "-->";
    public static final String HELP = "This is VisiCalc, enter a command.";
    
    public static void main(String[] args) {
        Grid grid = new Grid();
        UserIO io = new UserIO(grid);
        while (io.handleInstruct()) {}
    }

    public static String spaces(int count){
        String ret = "";
        for(int i = 0; i < count; i++){
            ret = ret + " ";
        }
        return ret;
    }
    public static String dashes(int count){
        String ret = "";
        for(int i = 0; i < count; i++){
            ret = ret + "-";
        }
        return ret;
    }

    public static String center(String input, int totalLeng){
        String ret = String.valueOf(input);
        int givenLeng = ret.length();
        int lengDif = totalLeng-givenLeng;
        if(lengDif <= 0){
            return ret.substring(0,totalLeng);
        }
        ret = spaces((lengDif/2)+(lengDif%2)) + ret + spaces(lengDif/2);
        return ret; 
    }

    public static String rightAlign(String input, int totalLeng){
        String ret = String.valueOf(input);
        int givenLeng = ret.length();
        int lengDif = totalLeng-givenLeng;
        if(lengDif <= 0){
            return ret.substring(0,totalLeng);
        }
        ret = spaces(lengDif) + ret;
        return ret;
    }
}