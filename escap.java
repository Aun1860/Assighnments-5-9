public class escap {

    public static void main(String[] args) {
        String var = "I wish I was the \"MONSTER\" that you think i am.";
        System.out.println(var);
        String var2 = "It\'s alright.";
        System.out.println(var2);
        String var3 = "The character \\ is called backslash.";
        System.out.println(var3);

        // \n New Line
        // \r Carriage Return
        // \t Tab
        // \b Backspace
        // \f Form Feed

        String var4 = "Rehman\nBhatti";
        String var5 = "Rehman\rBhatti";
        String var6 = "Hello\tBhatti";
        String var7 = "Rehm\ban Bhatti";
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
    }

}
