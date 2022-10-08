public class Test
{
                    static int number1=1234;   //static variable
                                        String name="Hello";      //instance variable
                    
static void question(){                  //static method
                                    String name="Ramya";
                  int age=21;
                                    System.out.println(name+"\n"+age);
                                    System.out.println(number1);                  
                }
                
void answer(){             //non static method
             int marks=100;
             int rank=50;
                        System.out.println(+marks+" \n"+rank);
                       System.out.println(number1);                     
                        
                        }
                         
static int average(int firstmark,int lastmark){          //static method
                                    int c=firstmark+lastmark;
                                                                      System.out.println(c);
                                    return c;

}
}

