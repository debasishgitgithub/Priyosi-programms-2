public class Mahatma2 {
    public static void main(String[] args) {
        String inputStr = "Mahatma Karamchand Gandhi";
        String arStr[] = inputStr.split(" ");
        String shortStr = "";
        shortStr +=arStr[0].charAt(0)+".";
        shortStr +=arStr[1].charAt(0)+".";
        shortStr +=" "+arStr[2];
        System.out.println(shortStr);

    }

}
