package XianChen;

class x6_8 implements Runnable {
    private static int chepiao = 100;
    public static String aa = new String("1");
    @Override
    public void run()
    {
        while(true)
        {
            synchronized (aa) {//Don't use : synchronized(this) or synchronized(aa) here; need set aa to public static!!!

                if(chepiao > 0)
                {
                    //                    try{
                    //                        Thread.sleep(100);
                    //
                    //                    }
                    //                    catch(Exception e)
                    //                    {
                    //                        e.printStackTrace();
                    //                    }
                    System.out.println("The "+Thread.currentThread().getName()+"is for "+(101-chepiao));
                    --chepiao;
                }
                else
                {
                    break;
                }
            }
        }
    }

}

public class L6_8
{
    public static void main(String[] args)
    {
        x6_8 xc81 = new x6_8();
        Thread ee = new Thread(xc81);

        x6_8 xc82 = new x6_8();
        Thread ff = new Thread(xc82);
        ee.start();
        ff.start();
    }

}
