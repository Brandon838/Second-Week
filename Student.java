//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Student {
     String Fn ;
    String ln;
    double GPA;
    int sid;
    Student () {
        Fn = "Jack";
    ln = "Sparrow";
    GPA = 1.4;
    sid = 100;
    }
    Student  (String Fn, String ln, double GPA, int sid) {
        this.Fn = Fn;
        this.ln = ln;
        this.GPA = GPA;
        this.sid = sid;
    }
    public static void main(String[] argsy) {
  Student S2 = new Student("brandy" , "lane" , 1.5 , 532 );

   Student S1 = new Student();
   System.out.println(S1);

   System.out.println("First name is: " + S2.Fn);
   System.out.println("Last name is: " + S2.ln);
   System.out.println("GPA is: " + S2.GPA);
   System.out.println("SID is: " + S2.sid);
   System.out.println("Hello Constructions");

        }
    }
