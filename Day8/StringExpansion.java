public class StringExpansion {
    public static String printResult(char ch, int times) {
        String partialString = "";
        for(int i=0;i<times;i++) {
            partialString += ch+"";       
         }
         return partialString;
    }
    public static void main(String[] args) {
        String str = "a5b4c2";
        char alphabets[] = new char[6];
        int digits[] = new int[6];
        int counter = 0;
        int x = 0,y = 0;
        for(int i=0;i<str.length();i++) {
            if(Character.isLetter(str.charAt(i))) {
                alphabets[x] = str.charAt(i);
                counter++;
                x++;
            } else if(Character.isDigit(str.charAt(i))) {
                digits[y] = str.charAt(i)-'0';
                y++;
            }
        }
        String finalResult = "";
        for(int i=0;i<counter;i++) {
            finalResult += printResult(alphabets[i], digits[i] );
        }
        System.out.println("Total Output: " +finalResult);
    }    
}
