class NewThread implements Runnable
{
 private String name;
 private int interval;
 private Thread t;
 NewThread(String threadname,int interval)
{
 this.name=threadname;
 this.interval=interval;
 t=new Thread(this,name);
 t.start();
}
public void run()
{
 try
 {
      for(int i=5;i>0;i--)
      {
       System.out.println(+i+"-Thread:"+this.name);
       Thread.sleep(this.interval);
      }
 }
catch(InterruptedException e)
{
  System.out.println(name+"Interrupted");
}
}
}
class college
{
 public static void main(String args[]){
 new NewThread("BMS COLLEGE OF ENGINEERING",10000);
 new NewThread("--CSE--",2000);
}
}