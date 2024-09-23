package Second;

 class Student extends Person {
     Student(int i){
         super(6);
         System.out.println("child");
     }
     static int number=10;
    public static void m2(){
        System.out.println("child");
    }
    public static void main(String[] args){
        Student st = new Student(5);
     System.out.println("static number"+st.number);
     st.ex();

    }
}
