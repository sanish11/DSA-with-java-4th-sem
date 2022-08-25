public class TowerOfHanoi 
{
    public static void main(String[] args) 
    {
        TOH(3, "Source", "Destination", "Helper");
    }
    
    static void TOH(int n, String s, String d, String h)
    {
        if(n<=0)
        {
            return;
        }
        else
        {
            TOH(n-1, s, h, d);

            System.out.println("Disc "+n+" moved from "+s+" to "+d);

            TOH(n-1, h, d, s);
        }
    }
}
