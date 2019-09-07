import java.util.Scanner;
class Tic3
{
   
static 
{
  System.out.println(" Welcome to Tic-toe Game");
  System.out.println(" This is a two player Game");  
}

public static void main(String arg[])
{  
   Scanner y=new Scanner(System.in);
   new A1();
   int j=0;
   int c[]=new int[9];  
   char b[]=new char[9];
   new A2(b);
        
   int k=0;
   for(k=0;k<9;++k)
   {     
     c[k]=y.nextInt();
     System.out.println(" ");
   
   
   if(k%2==0)
   b[c[k]-1]='#';

   else  
   b[c[k]-1]='@';
 
  new A2(b);
  
   if(k>=4)
   for(j=0;j<3;++j) 
   {
   if(b[3*j]=='#' || b[3*j]=='@')
   
   if(b[3*j]==b[3*j+1] && b[3*j]==b[3*j+2])
   {
    new A3(b[3*j]);
   return;
  } 
   if(b[j]=='#' || b[j]=='@')
   if(b[j]==b[3+j]&&b[j]==b[6+j])
    {
     new A3(b[j]);
     return;
}   
     if(b[0]=='#' || b[0]=='@')
     if(b[0]==b[4]&&b[0]==b[8])
{
     new A3(b[0]);
     return;
}
      if(b[2]=='#' || b[2]=='@')
       if(b[2]==b[4]&&b[2]==b[6])
{
   new A3(b[2]);
     return;
}
    
  

}
 }   
 
   if(k==9)
   System.out.println(" The match went to draw");   
}
}



 class A1
{ 
  static String s1;
  static String s2;
  public A1()
{
   Scanner x=new Scanner(System.in);
     System.out.println(" Please Enter your names");
    s1=x.nextLine();
    s2=x.nextLine();
  
   System.out.println(" Hello "+s1+" you are welcome to Tic toe Game");   
   System.out.println(" Hello "+s2+" you are welcome to Tic toe Game");
    System.out.println(" Now start playing");
  }
     
  
}
 
  
  class A2
{
  
  
  static int i=0;
  public A2(char b[])
{   
    
   for(int i=0;i<9;++i)
   {     
   if(b[i]=='#' )
   System.out.print("   #");
   else if(b[i]=='@')
   System.out.print("   @");
   new A2(i,b[i]);
  
 }   


  System.out.println(" ");
  System.out.println(" ");
  
}

 public  A2(int i,int x)
{   
  
 
   if((i+1)%3!=0 && (x=='#'||x=='@'))
   System.out.print("  |");
   else if((i+1)%3!=0)
    System.out.print("      |");
   
   if(i==2||i==5)
  {
   System.out.println(" ");
   System.out.println(" ___________________");  
}

 }

  
}
 
  class A3
{
  public A3(char n)
  
{
  
 if(n=='#')
 
 System.out.println(A1.s1+" won the Game");
 else if(n=='@')
  System.out.println(A1.s2+" won the Game");
  
}
} 
 


  




 