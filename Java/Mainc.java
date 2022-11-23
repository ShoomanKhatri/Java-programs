public class Mainc  {
    public static void main(String args[]){
 Car myCar = new Car();
    myCar.setPrice(99999.0f);
    myCar.setmodelno(4);
    myCar.setPowerSupply(334.67f);
    myCar.setBrand("Lamborgini");
    myCar.setChargeable(true);
   
   
    System.out.println(myCar.getPrice());
    System.out.println(myCar.getmodelno());
    System.out.println(myCar.getPowerSupply());
    System.out.println(myCar.getBrand());
    System.out.println(myCar.isChargeable());
}}

