package creatingclasses;

public class Employee {
    String name;//buradakiEmployee kısmna kadar olan hersey özellklerdir,attrıutesdir.
    int id;
    String department;
    double salary;
    String contractType;
    Employee(){//bu cONSTRACTOR dır.Ozellgı yukarıdakı class ıle aynı ısme saggpıtır ve bu da bır metotdurç
        this.name="Temp";
        this.id = 123;
        this.department="new";
        this.salary=11456.56;
        this.contractType="later";
    }
    Employee(String name,int id,String department,double salary, String contractType){//constractor overloadng olmuş
        this.name=name;//burdan ıtıbaren initilazaton başlıyor,paranteze kadar..
        this.id=id;//this.name de ki 'name' en ustte tanımlanan name dir. bu name e işaret temesiiçin this kullanılır.
        this.department=department;
        this.salary=salary;
        this.contractType=contractType;
    }
    public double calculateWeeklyPayment(int weeks){
        double weeklyPayment;
        weeklyPayment = (this.salary/52)*weeks;
        return weeklyPayment;
    }
    public double calculateBiWeeklyPayment(int weeks){
        double biWeeklyPayment;
        biWeeklyPayment = (this.salary/52)*weeks;
        return biWeeklyPayment;
    }
    public void displayEmployeeInfo(){
        System.out.println("Employee Name : " +this.name);
        System.out.println("Employee Department : "+this.department);
        System.out.println("Employee id : " +this.id);
        System.out.println("Employee Salary : "+this.salary);
        System.out.println("Employee Contract Type : "+this.contractType);

    }


}
