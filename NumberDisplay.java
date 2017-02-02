
package relogiojava;

public class NumberDisplay {
    private int limit;
    private int value;
    String getDisplayValue;
    
    public NumberDisplay(){
        
    }
   
    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        value = 10;
    }
    
    public void increment(){
        value = (value+1)%limit;
    }
    
    public int getLimit(){
        return limit;
    }
    
    public void setLimit(int limit2){
        limit = limit2;
    }
    
    public int getValue(){
        return value;
    }
   
    public void setValue(int limit2){
        limit = limit2;
    }
    
    public void setDisplayValue(String string2){
        getDisplayValue = string2;
    }
   
    
    public String getDisplayValue(){
        if (value<10){
            return "0" + value;
        }else{
            return "" + value;
        }
    }
    
}
