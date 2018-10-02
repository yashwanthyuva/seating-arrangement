import java.io.*;
import java.lang.String;
import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {   
        int i,sum = 0,j,count=0,l=0;
        int[] std;
        std=new int[80];
        String[] dept;
        dept=new String[3];
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF BENCHES IN THE CLASS");
        int bench=sc.nextInt();
        System.out.println("(NOT MORE THAN THREE DEPARTMENTS IN A CLASS)");
        System.out.println("ENTER THE NUMBER OF DEPARTMENTS");
        int department=sc.nextInt();
        for( i=0;i<department;i++)
        {
            System.out.println("not more than four letters"); 
            System.out.println("ENTER THE NAME OF THE"+(i+1)+" DEPARTMENT:");
            dept[i]=sc.next();
            sc.nextLine();
            System.out.println("Enter the number of students in "+dept[i]+" department");
            std[i]=sc.nextInt();
            if(i==0)
            {
                sum=std[i];
            }
            else 
            {
                sum=std[i-1]+std[i];
            }
        }
       
       

        for(i=0;i<3;i++)
        {
            if(dept[i]!=null)
            {
                count++;
            }
        }
        if(count==1)
        {
             if(sum>2*bench)
        {
            System.out.println("ALL THE STUDENTS CANNOT BE SEATED IN THE CLASS");
        }
             else
             {
            if(std[0]<=bench)
            {
                int tot=std[0];
                String dtot=dept[0];
                for(j=0;j<tot;j++)
                {   
                j++;
                System.out.println("**************************************************");
                System.out.println(" "+(dtot)+" " +j);
                System.out.println("**************************************************");
                j--;
                }
            }
        
            else
            {
                int tot=std[0];
                String dtot=dept[0];
                int temp=bench; 
                for(j=1;j<=tot;j++)
                {    
                     if(j<=temp)
                     {
                     bench++;
                     if(bench<=tot)
                     {
                     System.out.println("**************************************************");
                     System.out.println(" "+(dtot)+" " +j+"                                  "+dtot+" "+bench);
                     System.out.println("**************************************************");
                     }
                     else
                     {
                         System.out.println("**************************************************");
                         System.out.println(" "+(dtot)+" " +j);
                         System.out.println("**************************************************");
                     }
                     }
                }
                     
            }
    
        }}
        else if (count==2)
        {
            if(sum>2*bench)
            {
                System.out.println("ALL THE STUDENTS CANNOT BE SEATED IN THE CLASS");
            }
            else
            {
                int tot=std[0],tota=std[1];
                String dtot=dept[0];
                String dota=dept[1];
                int k=1;
                int temp=bench;
                if(tot>tota)
                {
                for(j=0;j<tot;j++)
                {
                j++;
                System.out.println("**************************************************");
                if(j<=tota)
                {
                System.out.println(" "+dtot+" " +j+"                                    "+dota+" "+k);
                }
                else if(bench<=tot&&temp!=tot)
                {
                    temp++;
                System.out.println(" "+dtot+" "+j+"                                   "+dtot+" "+temp);
                }
                else if(j<=bench)
                {
                System.out.println(" "+dtot+" "+j);
                }
                System.out.println("**************************************************");
                j--;
                k++;
                }}
                else
                {
                int tempor=bench;
                for(j=0;j<tota;j++)
                {
                j++;
                System.out.println("**************************************************");
                if(j<=tot)
                {
                System.out.println(" "+dtot+" " +j+ "                                    "+dota+" "+k);
                }
                else if (bench<=tota&&tempor!=tota)
                {
                    tempor++;
                    System.out.println(" "+dota+" "+tempor+"                                      "+dota+" "+k);
                }
                else if(j<=bench)
                        {
                    System.out.println( "                                             "+dota+" "+k);
                        }
                System.out.println("**************************************************");
                j--;
                k++;
                }} 
                }}
        else
        {
            
            if(std[2]>bench||std[0]>bench||std[1]>bench)
            {
                System.out.println("ALL THE STUDENTS CANNOT BE SEATED IN THE CLASS");
            }
            else
            {
        
            int tot=std[0],tota=std[1],total=std[2];
            String dtot=dept[0],dota=dept[1],dtota=dept[2];
            int m=1;
            int k=1;
            if((tot>tota)&&(tot>total))
            {
                for(j=0;j<tot;j++)
                {   
                    if(tota>total)
                    {
                    System.out.println("**************************************************");
                    if((j<tota)&&(j<total))
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m+"                 "+dtota+" "+k);
                    else if(j<tota)
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m);
                    else
                            System.out.println(" "+dtot+" "+(j+1));
                    System.out.println("**************************************************"); 
                    }
                    else
                    {
                    System.out.println("**************************************************");
                    if((j<tota)&&(j<total))
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m+"              "+dtota+" "+k);
                    else if(j<total)
                            System.out.println(" "+dtot+" "+(j+1)+"                                  "+dtota+" "+m);
                    else
                            System.out.println(" "+dtot+" "+(j+1));
                    System.out.println("**************************************************");
                    }
                    m++;
                    k++;
                    }
            }
            else if((tota>tot)&&(tota>total))
            {
                for(j=0;j<tota;j++)
                {   
                    if(tot>total)
                    {
                    System.out.println("**************************************************");
                    if((j<tot)&&(j<total))
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m+"              "+dtota+" "+k);
                    else if(j<tot)
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m);
                    else
                            System.out.println("                       "+dota+" "+k);
                    System.out.println("**************************************************"); 
                    }
                    else
                    {
                    System.out.println("**************************************************");
                    if((j<tot)&&(j<total))
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m+"                "+dtota+" "+k);
                    else if(j<total)
                            System.out.println("                       "+dota+" "+m+"              "+dtota+" "+k);           
                    else
                            System.out.println("                       "+dota+" "+m);
                    System.out.println("**************************************************");
                    }
                    m++;
                    k++;
                }
            }
            else
            {
                for(j=0;j<total;j++)
                {   
                    if(tot>tota)
                    {
                    System.out.println("**************************************************");
                    if((j<tot)&&(j<tota))
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m+"              "+dtota+" "+k);
                    else if(j<tot)
                            System.out.println(" "+dtot+" "+(j+1)+"                                    "+dtota+" "+k);
                    else
                            System.out.println("                                            "+dtota+" "+k);
                    System.out.println("**************************************************"); 
                    }
                    else
                    {
                    System.out.println("**************************************************");
                    if((j<tot)&&(j<tota))
                            System.out.println(" "+dtot+" "+(j+1)+"               "+dota+" "+m+"              "+dtota+" "+k);
                    else if(j<tota)
                            System.out.println("                       "+dota+" "+m+"              "+dtota+" "+k);           
                    else
                            System.out.println("                                           "+dtota+" "+k);
                    System.out.println("**************************************************");
                    }
                    m++;
                    k++;
                }}
                
            }
        }
    }
            
}

    