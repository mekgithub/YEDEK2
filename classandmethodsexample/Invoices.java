package classandmethodsexample;

public class Invoices {
    public String evaluateElectric(int consumption){
        String result = "";
        if(consumption >500 && consumption < 1000){
            result = "Good Job";
        }
        else if (consumption >= 1000 && consumption<1500){
            result =" Not Bad";
        }
        else if(consumption>=1500){
            result = " Start to save Energy";
        }
        else {
            System.out.println("consumption is out of scope");

        }
        return result;
    }
    //method for ınternete bill
    public String evaluateIntener(int speed){
        String result="";
        if(speed>300){
            result="Good Speed";
        }
        else if(speed>100){
            result="super speed";
        }
        else {
            result="Spped out of scope";
        }
        return result;
    }

}
