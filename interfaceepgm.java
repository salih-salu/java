import java.util.Scanner;

interface Student {
    void set_value1(String sname, int s, String regno);
}

interface Sports {
    void set_value2(float p);
}

class Result implements Student, Sports {
    public String name, reg_no;
    public int total;
    public float score_point;

    public void set_value1(String sname, int s, String regno) {
        name = sname;
        total = s;
        reg_no = regno;
    }

    public void set_value2(float pt) {
        score_point = pt;
    }

    public void display() {
        System.out.println("Register number: " + reg_no);
        System.out.println("Name: " + name);
        System.out.println("Academic score: " + total);
        System.out.println("Score obtained in sports: " + score_point);
    }
}

public class interfaceepgm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the reg number: ");
        String reg_no = sc.nextLine();

        System.out.println("Name of the student: ");
        String name = sc.nextLine();

        System.out.println("Enter the academic and sports details of a student:");
        System.out.println("Enter the total marks obtained (max mark 1200):");
        int total = sc.nextInt();

        System.out.println("Enter the overall score point obtained in sports (max point):");
        float pt = sc.nextFloat();

        Result obj = new Result();
        obj.set_value1(name, total, reg_no);
        obj.set_value2(pt);
        obj.display();

        sc.close(); 
    }
}
