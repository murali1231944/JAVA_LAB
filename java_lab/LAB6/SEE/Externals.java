package LAB6.SEE;
import LAB6.CIE.Student1;
public class Externals extends Student1{
  public int[] marks=new int[5];
    public Externals(String usn,String name,String sem,int[] marks){
        super(usn,name,sem);
        this.marks =marks;
        System.out.println("SEE MARKS ------"+
        "\nS1 : "+this.marks[0]+
        "\nS2 : "+this.marks[1]+
        "\nS3 : "+this.marks[2]+
        "\nS4 : "+this.marks[3]+
        "\nS5 : "+this.marks[4]);
    }
}

