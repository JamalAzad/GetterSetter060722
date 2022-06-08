public class TheEmployee {
    private String name;
    private String email;
    private int id;
    private float salary;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getEmail(){
        return email;
    }
    public void setId(int id){
        if(id>50){
            this.id=0;
        }
        else {
            this.id=id;
        }
    }
    public int getId(){
        return id;
    }
    public void setSalary(float salary){
        this.salary=salary;
    }
    public float getSalary(){
        if(salary>10000 || salary<5000){
            System.out.println("It is not a good manner to ask someone's salary");
        }
        else {
            this.salary=salary;
        }
        return salary;
    }
    public static void main(String[] args){
        TheEmployee theEmployee=new TheEmployee();
        theEmployee.setName("Jamal");
        theEmployee.setEmail("jamal@mail.com");
        theEmployee.setId(49);
        theEmployee.setSalary(9000);
        System.out.println("Name: " +theEmployee.getName());
        System.out.println("Email: " +theEmployee.getEmail());
        System.out.println("ID No: " +theEmployee.getId());
        System.out.println("Salary: " +theEmployee.getSalary());
        }
    }

