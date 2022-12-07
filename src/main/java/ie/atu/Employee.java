package ie.atu;

public class Employee {

    String name;
    String PPS;
    String gender;
    String employment;
    int age;

    public Employee(String name, String PPS, String gender, String employment, int age){
        if(name.length()>3 && name.length()<25){
            System.out.println("Valid name");
            this.name = name;
        }
        else{
            throw new IllegalArgumentException("Invalid name");
        }

        if(PPS.length()==11){
            System.out.println("Valid ID");
            this.PPS = PPS;
        }
        else{
            throw new IllegalArgumentException("Invalid PPS ID");
        }

        if(employment.equals("Full-Time") || employment.equals("Part-Time") || employment.equals("Contract")){
            System.out.println("Valid Employment");
            this.employment = employment;
        }
        else{
            throw new IllegalArgumentException("Invalid Employment");
        }

        if(gender.equals("Female") || gender.equals("Male") || gender.equals("Non-Binary")) {
            System.out.println("Valid Gender");
            this.gender=gender;
        }
        else{
            throw new IllegalArgumentException("Invalid Gender");
        }

        if(age >= 16){
            System.out.println("Valid age");
            this.age = age;
        }
        else{
            throw new IllegalArgumentException("Invalid Age, must be over 16");
        }
    }

    public String getPPS() {
        return PPS;
    }
    public String getGender() {
        return gender;
    }
    public String getEmployment() {
        return employment;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
