/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package First;
import javax.swing.JOptionPane;

/**
 *
 * @author crist
 */
public class conversor {
    
    
    public static void moneda(Object x, double toConvert, String badge){
        JOptionPane.showMessageDialog(null, "Tienes $" + Double.parseDouble(x.toString()) * toConvert + " " + badge, "Total de conversión", JOptionPane.QUESTION_MESSAGE, null);
    }
    
    
    public static void temp(Object x, Object toConvert){
        if (toConvert.toString() == "Fahrenheit a Celsius"){
                JOptionPane.showMessageDialog(null, (x.toString() + "°F equivalen a " + ((Double.parseDouble(x.toString()) - 32) * 5 / 9) ) + "°C");
        } else {
                JOptionPane.showMessageDialog(null, (x.toString() + "°C equivalen a " +((Double.parseDouble(x.toString()) * 9/5) + 32)) + "°F");     
        }       
    }
    public static void returnBadgeResult(){
        Object[] possibleBadges = {"Peso a Dolar", 
                "Peso a Euro", 
                "Peso a Libra", 
                "Peso a Yen", 
                "Peso a Won Coreano", 
                "Dolar a Peso",
                "Euro a Peso",
                "Libra a Peso",
                "Yen a Peso",
                "Won Coreano a Peso"
            };
            
            Object valueToConvert = JOptionPane.showInputDialog(null, 
                    "Ingresa la cantidad que quieres convertir", "Ingreso de datos",
                    JOptionPane.DEFAULT_OPTION);
            if(valueToConvert == null) System.exit(0);
            
            
            Object badge = JOptionPane.showInputDialog(null, 
                    "Selecciona el tipo de divisa", "Menu de selección",
                    JOptionPane.DEFAULT_OPTION, null,
                    possibleBadges, possibleBadges[0]);
            if(badge == null) System.exit(0);
            
            
        switch (badge.toString()){
                case "Peso a Dolar":
                    moneda(valueToConvert, 0.00025, "Dolares");
                    break;
                case "Peso a Euro":
                    moneda(valueToConvert, 0.00023, "Euros");
                    break;
                case "Peso a Libra": 
                    moneda(valueToConvert, 0.00020, "Libras");
                    break;
                case "Peso a Yen": 
                    moneda(valueToConvert, 0.037, "Yenes");
                    break;
                case "Peso a Won Coreano": 
                    moneda(valueToConvert, 0.34, "Won");
                    break;
                case "Dolar a Peso":
                    moneda(valueToConvert, 3964.86, "Pesos");
                    break;
                case "Euro a Peso":
                    moneda(valueToConvert, 4334.11, "Pesos");
                    break;
                case "Libra a Peso":
                    moneda(valueToConvert, 5026.95, "Pesos");
                    break;
                case "Yen a Peso":
                    moneda(valueToConvert, 27.37, "Pesos");
                    break;
                case "Won Coreano a Peso":
                    moneda(valueToConvert, 2.98, "Pesos");
                    break;
            }
    }
    
    public static void returnTemperature(){
        Object[] possibleConversion = {"Celsius a Fahrenheit", "Fahrenheit a Celsius"};
        
        Object valueToConvert = JOptionPane.showInputDialog("Ingresa el valor que quieres convertir");
        
        if(valueToConvert == null) System.exit(0);
        
        Object unitToConvert = JOptionPane.showInputDialog(null,
                "Selecciona la unidad a la que quieres convertir", "Selector de unidades",
                JOptionPane.DEFAULT_OPTION, null,
                possibleConversion, possibleConversion[0]);
        
        if(unitToConvert == null) System.exit(0);
        
        temp(valueToConvert, unitToConvert);
    }
    
    public static void throwError(){
        JOptionPane.showMessageDialog(null, "Error a la hora de ejecución", "Error", JOptionPane.ERROR_MESSAGE, null);
    }
    
    
    public static void main(String[] args){
        int continueValidation = 0;
        while (continueValidation == 0){
            Object[] possibleValues = { "Conversor de moneda", "Conversor de temperatura" };

        Object selectedValue = JOptionPane.showInputDialog(null,
             "Seleccione la opción de conversión", "Menu",
             JOptionPane.DEFAULT_OPTION, null,
             possibleValues, possibleValues[0]);
        try{
            
            if(selectedValue == "Conversor de moneda"){
            
                returnBadgeResult();
            
            
            }else if(selectedValue == "Conversor de temperatura"){
            
                returnTemperature();
            
            }
        }catch (Exception er){
            throwError();
        }
        
        continueValidation = JOptionPane.showConfirmDialog(null, "Deseas Continuar?");
        
        
        }
        
        JOptionPane.showMessageDialog(null, "Programa terminado", "Fin", JOptionPane.INFORMATION_MESSAGE, null);
        
    }
    
}
