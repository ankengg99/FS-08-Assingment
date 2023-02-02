import java.util.HashMap;
import java.util.Scanner;

class Car {
    String code;
    int charge;
    Car() {
      code="code";
      charge=0;
    }
    Car(String code,int charge) {
        this.code=code;
        this.charge=charge;
        if(this.code.equals("BS01")){
            System.out.println("Charge of basic servicing - "+this.charge+" Rs.");
        }
        if(this.code.equals("EF01")){
            System.out.println("Charge of engine fixing - "+this.charge+" Rs.");
        }
        if(this.code.equals("BF01")){
            System.out.println("Charge of Brake fixing - "+this.charge+" Rs.");
        }
        if(this.code.equals("GF01")){
            System.out.println("Charge of gear fixing - "+this.charge+" Rs.");
        }
        if(this.code.equals("CF01")){
            System.out.println("Charge of clutch fixing - "+this.charge+" Rs.");
        }
    }
}

class CarType{
    HashMap<String,Integer> map=new HashMap<>();
    int total = 0;

    CarType(int BS01, int EF01, int GF01, int CF01, int BF01){
        this.map.put("BS01",BS01);
        this.map.put("EF01",EF01);
        this.map.put("BF01",BF01);
        this.map.put("CF01",CF01);
        this.map.put("GF01",GF01);
    }

    String[] servicecode;
    int n = 0;
      Car obj=new Car();
    public void user() {
        System.out.println("Enter no of servide you want....");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your service code...");
        servicecode = new String[n];
        for (int i = 0; i < n; i++) {
            servicecode[i] = sc.nextLine();
        }
        for(int j = 0;j<n;j++) {
            String code = servicecode[j];
            if (code.equals("BS01")) {
                obj=new Car(code,map.get(code));
                total +=map.get(code);
            } else if (code.equals("EF01")) {
                obj=new Car(code,map.get(code));
                total +=map.get(code);
            } else if (code.equals("GF01")) {
                obj=new Car(code,map.get(code));
                total +=map.get(code);
            } else if (code.equals("CF01")) {
                obj=new Car(code, map.get(code));
                total += map.get(code);
            } else if (code.equals("BF01")) {
                obj=new Car(code,map.get(code));
                total +=map.get(code);

            }
        }

        System.out.println("total bill - " + total+" Rs.");
        if (total > 10000) {
            System.out.println("Complementry cleaning service provided to you");
        }
    }




}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter type of your car....");
        String name=sc.next();
        System.out.println("Type of your car - "+name);
        if(name.equals("Hatchback")){
            CarType  hatchback=new CarType(2000,5000,3000,2000,1000);
            hatchback.user();
        }
        else if(name.equals("Suv")) {
            CarType suv = new CarType(5000, 10000, 8000, 6000, 2500);
            suv.user();
        }
        else{
            CarType  sedan=new CarType(4000,8000,6000,4000,1500);
            sedan.user();
        }


    }

}