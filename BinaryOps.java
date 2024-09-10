public class BinaryOps {
  public static void oddOrEven(int n){
    
    int m=n&1;
    if(m==1){
      System.out.println("Number is odd");
    }
    else {
      System.out.println("Number is even");
    }
  }

  public static void getIthbit(){
    int n=10;
    int k=1<<1;
    int ans=n&k;
    System.out.println();
  }

  public static int setIthbit(int n,int i){
    // int n=10;
    int k=1<<i;
    return n|k;
  }

  public static int clearIthBit(int n,int i){
    // int n=10;
    int k=~(1<<i);
    // System.out.println();
    return n&k;
  }

  public static int updateIthbit(int n,int i,int newBit){
    int a=0;
     if(newBit==0){
      a=clearIthBit(n,i);
    }
    else if(newBit==1){
      a=setIthbit(n,i);
    }
    return a;
  }

  public static void clearLastIbits(){
    int n=15,i=3;
    System.out.println(((~0)<<i)&n);
    
  }
  public static void clearBitsInARange(){
    int i=2,j=4,n=63;

    int start=~(0)<<(j+1);
    int end=(1<<i)-1;
    int bitmask=start|end;
    
    System.out.println(n&bitmask);
  }

  public static void powerOfTwo(){
  int n=16;

  //16=10000, 15=1111 if 14,14=1110,13=1101
  // 8=1000,7=111
  boolean f=(n&(n-1))==0;
  System.out.println(f);
  }

  public static void countSetBits(){
    int n=32,count=0;
    while(n!=0){
      if((n&1)==1){
        count++;
      }
      n=n>>1;
      
    }
   System.out.println(count);
  }

  public static void fastExpo(){

    int a=9,n=3,ans=1;

    while(n>0){
      if((n&1)==1){
        ans*=a;
      }
      a=a*a;
      n=n>>1;
    }
    System.out.println(ans);
  }
  public static void main(String[] args) {
    // oddOrEven(0);
    // getIthbit();
  
    // System.out.println(setIthbit());
    // System.out.println(updateIthbit(10,3,0));
    // clearLastIbits();
    // clearBitsInARange();
    // powerOfTwo();
  //  System.out.println(setIthbit(10, 1));
    // countSetBits();
    //  fastExpo();
    System.out.println(5^6);
    
  }
}
