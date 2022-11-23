class Bike {
    private float price;
    private int modelno;
    private float powerSupply;
    private String brand;
    private boolean chargeable;
    private Engine engine;
   
    // getter  price
    public float getPrice() {
        return this.price;
    }
   
    // setter
    public void setPrice(float price) {
        this.price = price;
    }
    // getter modelno
    public int getmodelno() {
        return this.modelno;
    }
   
    // setter
    public void setmodelno(int modelno) {
        this.modelno = modelno;
    }
    // getter powersupply
    public float getPowerSupply() {
        return this.powerSupply;
    }
   
    // setter
    public void setPowerSupply(float powerSupply) {
        this.powerSupply = powerSupply;
    }
    // getter brand
    public String getBrand() {
        return this.brand;
    }
   
    // setter
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // getter chargeable
    public boolean isChargeable() {
        return this.chargeable;
    }
   
    // setter
    public void setChargeable(boolean chargeable) {
        this.chargeable = chargeable;

    public Engine getEngine(){
        return this.engine
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    }
   
}

