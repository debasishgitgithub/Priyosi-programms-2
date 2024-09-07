class Mahatma {
    public static void main (String args[]){
        String inputStr="acceptance will calm our soul";
        String arrStr[]=inputStr.split(" ");
        String shortStr="";
        for(String elem : arrStr){
            shortStr+= elem.charAt(0)+".";
            shortStr=shortStr.toUpperCase();

        }
        System.out.println(shortStr);
        


    }
}