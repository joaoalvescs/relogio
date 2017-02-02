
package relogiojava;

public class MainNumberDisplay {
        public static void main(String[] args){
            
            NumberDisplay objeto = new NumberDisplay();
            ClockDisplay objeto2 = new ClockDisplay();
            
            objeto.setLimit(11);
            objeto.setValue(2);
            objeto.getValue();
            
            objeto.setDisplayValue("11");
            objeto.setDisplayValue("9");
            
        System.out.println(objeto.getDisplayValue + ":" + objeto.getDisplayValue());
            
        System.out.println(objeto2.timeTick());   
        }
        
}
