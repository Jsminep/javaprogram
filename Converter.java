public class Converter
{
    String ss;
    public Converter()
    {

    }

    public Converter(int num) {
        this.ss = buildString(num);
    }

    public static String convertToString(int num)
    {
        if (num == 0){
            return " zero ";
        }
        if (num == 1){
            return " one ";
        }
        if (num == 2){
            return " two ";
        }
        if (num == 3){
            return " three ";
        }
        if (num == 4){
            return " four ";
        }
        if (num == 5){
            return " five ";
        }
        if (num == 6){
            return " six ";
        }
        if (num == 7){
            return " seven ";
        }
        if (num == 8){
            return " eight ";
        }
        if (num == 9){
            return " nine ";
        }
        return "me";

    }

    public static String buildString(int input)     //change int back to String
   {
    int dividend = input;
    int quotient = dividend / 10;   //returns 51
    int remainder = dividend % 10;  //returns 2
    String buildString = convertToString(remainder);


    while (quotient > 0)
    {
        remainder = quotient % 10;
        buildString = convertToString(remainder) + buildString;
        quotient /= 10;
    }
    return buildString;
    
   }

   public static void main(String[] args)
   {
    Converter j = new Converter(512);
       //System.out.print("Hi ");
       //System.out.println("there");
       //System.out.println(j.convertToString(4));
       System.out.println(j.ss);
       //j.buildString(512);
   }

}