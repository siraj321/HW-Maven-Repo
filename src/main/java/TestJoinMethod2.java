class TestJoinMethod2 extends Thread{
  private String name;
  private TestJoinMethod2 t1 ;
  private TestJoinMethod2 t2;
  public void run(){
    for(int i=1;i<=5;i++){
      try{
        //Thread.sleep(500);
        Thread.yield();
        t1.join();
      }catch(Exception e){System.out.println(e+":"+name+"-");}
      System.out.println(i+":"+name+"-");
    }
  }
  TestJoinMethod2(String name){
    this.name = name;
  }
  public static void main(String args[]){
    TestJoinMethod2 t1=new TestJoinMethod2("One");
    TestJoinMethod2 t2=new TestJoinMethod2("Two");
    try{
      t1.join();

    }catch(Exception e){System.out.println(e);}

    //t1.start();

    t1.start();
    t2.start();
  }
}  