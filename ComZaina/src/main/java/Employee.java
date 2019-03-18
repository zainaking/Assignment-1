public class Employee {

    public String firstName;
    public int id;
    public double earnings;

    public Employee(String firstName, int id) { // constructor
        this.firstName = firstName;
        this.id = id;

    }

    public Employee(double earnings) { // constructor
        this.earnings = earnings;



        }
        public String calculateEarnings ( double x){

            return "I will be making" + x + "dollars";
        }



    }






