public class FlyingButterfly{
    public static void main (String[] args) throws InterruptedException{
        while(true){
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("*      *");
            System.out.println("***      ***");
             System.out.println("****        ****");
             System.out.println("      ||");
             System.out.println("      ||");
             Thread.sleep(300);
             System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("    **   **");
            System.out.println("      ***");
            System.out.println("      *");
            System.out.println("       ||");
             System.out.println("      ||");
             Thread.sleep(300);
        }
    }
}