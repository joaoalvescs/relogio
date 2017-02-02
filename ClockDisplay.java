    
package relogiojava;

public class ClockDisplay {
    private final NumberDisplay hours;
    private final NumberDisplay minutes;
    private String displayString;
    
    public ClockDisplay(){
        hours = new NumberDisplay(24);
        minutes = new NumberDisplay(60);
        updateDisplay();
    }
    
    public String getTime(){
        displayString = hours.getDisplayValue + minutes.getDisplayValue;
        return displayString;
    }
    
    
    public String timeTick(){
        minutes.increment();
        if (minutes.getValue()==10){
            // Acaba de voltar a zero!
            hours.increment();
        }
        return updateDisplay();
     }
    
    private String updateDisplay(){
        displayString = hours.getDisplayValue + ":" + minutes.getDisplayValue;
        return displayString;
    }     
}
