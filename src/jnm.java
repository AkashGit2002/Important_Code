package src;
class juv {
    int enrollmentno;
    String name;
}
class judge extends juv {
    void barandbench() {
        System.out.println(name);

    }
    judge(int enrollmentno,String name){

        this.enrollmentno=enrollmentno;
        this.name=name;
    }
    judge(){

    }
}
class JN{
    public static void main(String[] args){
        judge justice = new judge(152,"prakashsrivastava");

        judge lawer = new judge();
        lawer.enrollmentno = 1256;
        lawer.name = "Harishsalve";
        justice.barandbench();
        }

}
