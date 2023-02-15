public class Employee extends Person{

    private int ID;

    public Employee(String name, char gender,int ID) {
        super(name, gender);
        this.ID=ID;
    }



    @Override
    public void work() {
        if(0==ID){
            System.out.println("Jumushchu ishtebeit");
        }else{
            System.out.println("jumushchu ishteit");
        }

    }
}

