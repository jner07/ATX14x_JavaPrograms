package ex_20_Enum;

public class Lab002_enumWithKeys {
    static void main() {
        System.out.println(HexColors.Red.getHexCode());
    }
}
    //getHexCode is method we created with help of constructor which will return value we declared of hex colours in enum
    enum HexColors {
     Red("0000"),
     Green("FFFF"),
     Yellow("3377FF");

     private String hexCode;

     HexColors (String hexCode) { //this is parameterized constructor
         this.hexCode = hexCode;
     }
     String getHexCode(){
         return this.hexCode;
     }
 }
