package LAB6;
import LAB6.CIE.*;
import LAB6
.SEE.*;
import java.util.Scanner;
public class Inform{
    public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      System.out.println("no of Students");
      int n=sc.nextInt();
      Internals[] internals=new Internals[n];
      Externals[] externals =new Externals[n];
      for(int i=0;i<n;i++){
        System.out.println("USN");
        String usn = sc.nextLine();
	sc.next();
        
        System.out.println("NAME");
        String name=sc.nextLine();
	sc.next();
        System.out.println("SEM");

        String sem =sc.nextLine();
        sc.next();
        System.out.println("Eneter CIE marks");
        int[] Cmarks=new int[5];
        int[] Smarks=new int[5];
        for(int j=0;j<5;j ++){
          Cmarks[j]=sc.nextInt();
        }
        System.out.println(" Enter SEE marks");
        for(int j=0;j<5;j++){
            Smarks[j]=sc.nextInt();
        }

        internals[i]=new Internals(usn,name,sem,Cmarks);
        externals[i]=new Externals(usn,name,sem,Smarks);
        System.out.println("Final Marks");
        for(int j=0;j<5;j++){
            int final1=internals[i].marks[j]+externals[i].marks[j];
            System.out.println("Sub"+(i+1)+"marks "+final1);
        }
      }
    }
  }
        
