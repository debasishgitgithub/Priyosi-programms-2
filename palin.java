class palin {
    public static void main(String[] args) {
        String b = "MADOM";
        palin obj = new palin();
        if(obj.isPalin(b)){
            System.out.println("ok");
        } else{
            System.out.println("Not ok");
        }

    }


    public boolean isPalin(String ss) {

        StringBuffer s = new StringBuffer(ss);

        String a = s.reverse().toString();
        if (a.equals(ss)) {
            return true;

        } else {
            return false;
        }

    }

}