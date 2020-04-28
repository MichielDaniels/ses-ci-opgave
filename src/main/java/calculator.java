public class calculator {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        String bewerking = args[1];
        int y = Integer.parseInt(args[2]);

        int uitkomst = rekenmachine(x, y, bewerking);
        System.out.println(uitkomst);
    }

    public static int rekenmachine(int x, int y, String bewerking){
        int z; // uitkomst
        if (bewerking.equals("plus")) {
            z = x+y;
        } else if (bewerking.equals("min")){
            z = x-y;
        } else if (bewerking.equals("maal")){
            z = x*y;
        } else if (bewerking.equals("delen")){
            z = x/y;
        } else{
            throw new java.lang.Error("Operator not recognized");
        }
        return z;
    }
}
