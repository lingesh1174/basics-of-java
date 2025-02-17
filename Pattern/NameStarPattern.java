import java.util.*;
public class NameStarPattern{
    Map<Character, String[]> letterPatterns = new HashMap<>();
    {
        letterPatterns.put('A', new String[]{"  *  ", " * * ", "*****", "*   *", "*   *"});
        letterPatterns.put('B', new String[]{"**** ", "*   *", "**** ", "*   *", "**** "});
        letterPatterns.put('C', new String[]{" ****", "*    ", "*    ", "*    ", " ****"});
        letterPatterns.put('D', new String[]{"**** ", "*   *", "*   *", "*   *", "**** "});
        letterPatterns.put('E', new String[]{"*****", "*    ", "**** ", "*    ", "*****"});
        letterPatterns.put('F', new String[]{"*****", "*    ", "**** ", "*    ", "*    "});
        letterPatterns.put('G', new String[]{" ****", "*    ", "*  **", "*   *", " ****"});
        letterPatterns.put('H', new String[]{"*   *", "*   *", "*****", "*   *", "*   *"});
        letterPatterns.put('I', new String[]{"*****", "  *  ", "  *  ", "  *  ", "*****"});
        letterPatterns.put('J', new String[]{"  ***", "   * ", "   * ", "*  * ", " **  "});
        letterPatterns.put('K', new String[]{"*   *", "*  * ", "**   ", "*  * ", "*   *"});
        letterPatterns.put('L', new String[]{"*    ", "*    ", "*    ", "*    ", "*****"});
        letterPatterns.put('M', new String[]{"*   *", "** **", "* * *", "*   *", "*   *"});
        letterPatterns.put('N', new String[]{"*   *", "**  *", "* * *", "*  **", "*   *"});
        letterPatterns.put('O', new String[]{" *** ", "*   *", "*   *", "*   *", " *** "});
        letterPatterns.put('P', new String[]{"**** ", "*   *", "**** ", "*    ", "*    "});
        letterPatterns.put('Q', new String[]{" *** ", "*   *", "* * *", "*  **", " *** "});
        letterPatterns.put('R', new String[]{"**** ", "*   *", "**** ", "*  * ", "*   *"});
        letterPatterns.put('S', new String[]{" ****", "*    ", " *** ", "    *", "**** "});
        letterPatterns.put('T', new String[]{"*****", "  *  ", "  *  ", "  *  ", "  *  "});
        letterPatterns.put('U', new String[]{"*   *", "*   *", "*   *", "*   *", " *** "});
        letterPatterns.put('V', new String[]{"*   *", "*   *", " * * ", " * * ", "  *  "});
        letterPatterns.put('W', new String[]{"*   *", "*   *", "* * *", "** **", "*   *"});
        letterPatterns.put('X', new String[]{"*   *", " * * ", "  *  ", " * * ", "*   *"});
        letterPatterns.put('Y', new String[]{"*   *", " * * ", "  *  ", "  *  ", "  *  "});
        letterPatterns.put('Z', new String[]{"*****", "   * ", "  *  ", " *   ", "*****"});
    }
    public void pattern(String name){
        name=name.toUpperCase();
        for (int i = 0; i < 5; i++){
            for (char ch : name.toCharArray()){
                if (ch == ' ') 
                    System.out.print("     ");
                else 
                    System.out.print(letterPatterns.getOrDefault(ch, new String[]{})[i] + "  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        NameStarPattern o = new NameStarPattern();
        o.pattern(name);
    }
}
