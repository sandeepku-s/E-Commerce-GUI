package mypack;

public class MyUtility
{
    public static void pos_msg(String msg)
    {
        System.out.println("=======================================");
        System.out.println(msg);
        System.out.println("=======================================");
    }
    
    public static void neg_msg(String msg)
    {
        System.out.println("***************************************");
        System.out.println(msg);
        System.out.println("***************************************");
    }
    
    public static void thankYou()
    {
        System.out.println("+-------------------------------------+");
        System.out.println("|             Thank You               |");
        System.out.println("+-------------------------------------+");

    }
    
    public static void invalid()
    {
        System.out.println("+-------------------------------------+");
        System.out.println("|           Invalid Option            |");
        System.out.println("+-------------------------------------+");

    }
}