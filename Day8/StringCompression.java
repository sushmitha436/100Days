public class StringCompression {
    public static void main(String[] args) {
        String str = "aaaabccc";
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for(int i=0;i<str.length();i++) {
            if(i==str.length()-1) {
                sb.append(str.charAt(i)+""+count);
                break;
            }
            if(str.charAt(i) == str.charAt(i+1)) {
                count++;
            } else {
                sb.append(str.charAt(i)+""+count);
                count=1;
            }
            }
            System.out.println(sb.toString());
        }

    }
