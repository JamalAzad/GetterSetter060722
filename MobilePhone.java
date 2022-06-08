public class MobilePhone {
    private String brandName;
    private String color;
    private int modelNo;
    public  void setBrandName(String brandName){
        this.brandName=brandName;
    }
    public String getBrandName(){
        return brandName;
    }
    private  void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }
    public void setModelNo(int modelNo){
        this.modelNo=modelNo;
        if(modelNo>25 && modelNo<50){
          this.modelNo=0;
        }
        else {
            this.modelNo=modelNo;
        }
    }
    public int getModelNo() {
        return modelNo;
    }
public static void main(String[] args){
        MobilePhone mobilePhone= new MobilePhone();
        mobilePhone.setBrandName("iPhone");
        mobilePhone.setColor("Grey");
        mobilePhone.setModelNo(49);
    System.out.println(mobilePhone.getBrandName());
    System.out.println(mobilePhone.getColor());
    System.out.println(mobilePhone.getModelNo());
}
}
