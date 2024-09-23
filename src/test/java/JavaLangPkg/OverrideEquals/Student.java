package JavaLangPkg.OverrideEquals;

public class Student {
    int roll;
    String name;
    Student (int roll,String name){
        this.roll=roll;
        this.name=name;
    }
public boolean equals(Student obj){
        String name1=this.name;
        int roll1=this.roll;
        if(obj==this)
            return true;

try{
  //  Student s = (Student) obj;
    String name2=  obj.name;
    int roll2= obj.roll;
    if(name1.equals(name2) && roll1==roll2){
        return true;
    }
    else {
        return false;
    }
}catch (ClassCastException | NullPointerException e){
    return false;
}


}
    public static void main(String[] args){
        Student s1=new Student(101,"Durga");
        Student s2=new Student(101,"Sachin");
        Student s3=new Student(101,"Durga");
        System.out.println("to string is executed"+s1);
        Student s4=s1;
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals("Ashish"));
        System.out.println(s1.equals(null));
        String str="acv";
        int a=4;
        int b=5;
        int c=a;
        if(a==c){
            System.out.println("hi");
        }

    }
}
