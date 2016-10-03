package doublesimplexalgorythm;
import javax.swing.JOptionPane;
import java.util.Scanner;
public class DoubleSimplex {
    
    private String[] args;
    private int numEquations;
    private int slackVars;
    private double[][] coE;
    private double[] formula;
    private double[][]tableaux;
    private double[][] solution;
    private Scanner S;
    
    public DoubleSimplex(){
        
    }//end doublesimplex
    
    public String Calculate(String coes,String formulaIn,int x, int y,int z){
        coE = new double[x][y];
        formula = new double[z];
        solution = coE;
        tokenizeCoEs(coes);
        tokenizeFormula(formulaIn);
        createTableux();
        return "";
    }//end calculate
    
    /** Creates the tableux table that calculations will be performed on.
     *  
     */
    private void createTableux(){
        int x = coE.length+1;//+1 for z column
        int y = coE[0].length;
        tableaux = new double[x+coE.length][y];
        tableaux[0][0] = 1.0;
        for(int xx = 1; xx < tableaux.length; xx++){
            tableaux[xx+x-1][xx-1] = 1.0;
            for(int yy = 0; yy < tableaux.length; yy++){
                if(xx < coE.length)
                    tableaux[xx][yy] = coE[xx-1][yy];
                //else
                    //tableaux[xx][yy] = 0.0;
            }//end inner for
        }//end outer for
    }//end createTableux
    
    //takes a string and splits it up into coE for future operations
    private void tokenizeCoEs(String s){
        //initializations...
        S = new Scanner(s);
        //setting delimiter to break only on " ".  need '\n' for formatting
        S.useDelimiter(" ");
        String temps;
        int temp,count1 = 0,count2 = 0;
        //looping through string
        while(S.hasNext()){
            temps = S.next();
            //if charat(0) == \n...
            temp = temps.indexOf('\n');
            if(temp != -1){
                if(count2 != coE[0].length-1){
                    JOptionPane.showMessageDialog(null, "Jagged array detected!\nCheck input at row "+(count1+1), "Error1", JOptionPane.ERROR_MESSAGE);
                    return;
                }//end if
                try{//grabbing number in newline case(e.g. "3.24\n55"), splitting string for storage
                    coE[count1][count2] = Double.parseDouble(temps.substring(0, temp));
                    count2 = 0;
                    count1++;
                    coE[count1][count2] = Double.parseDouble(temps.substring(temp+1, temps.length()));
                    count2++;
                }catch(Exception e){//if it's not a number entered
                    JOptionPane.showMessageDialog(null, "Input is not a number! \nCheck row "+(count1+1), "NaN Error!", JOptionPane.ERROR_MESSAGE);
                    System.out.print(e.toString());
                    return;
                }//end try/catch
            }//end if
            else{
                //normal case for number input: temps !(contains '\n')
                coE[count1][count2] = Double.parseDouble(temps);
                count2++;
            }//end else
        }//end while s.hasnext
        if(count1 != coE.length-1 || count2 != coE[0].length){
            JOptionPane.showMessageDialog(null, "Jagged array detected!\nCheck input at row "+(count1+1), "Error2", JOptionPane.ERROR_MESSAGE);
            solution = coE;
        }//end if
    }//end tokenize
    
    
    //ROW OPERATIONS!
    //-------------------------------------------------
    
    private void rowReducer(int rowToOverwrite, int rowMatch, int toOne){
        
    }//end rowReducer
    
    @Override
    public String toString(){
        String s = "";
        for(int x = 0; x < solution.length;x++){
            s += "[ ";
            for(int y = 0; y < solution[0].length;y++){
                s += solution[x][y]+" ";
            }//end inner for
            s += "]\n";
        }//end outer for
        return s;
    }
    
    //finds and stores the CoEs of each equation in args and stores it into the double arrays
    private void findCoE(){
        int count = 0;
        
    }//end find COe

    private void tokenizeFormula(String formula) {
        Scanner S = new Scanner(formula);
        int count = 0;
        while(S.hasNext()){
            try{
                this.formula[count] = Double.parseDouble(S.next());
            }catch(NumberFormatException e){
                e.printStackTrace();
            }//end catch
        }//end while 
    }//end tokenize formula
}//end double simplex