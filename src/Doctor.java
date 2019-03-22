import javax.naming.Name;

public class Doctor {
    private String position;
    private Name name;
    private int patients;

    public Doctor(String position){
        this.position = position;
    }

    public Doctor(Name name){
        this.name= name;
    }

    public Doctor(int patients){
        this.patients = patients;
    }

    public People(int patients,String position){
        this.patients=patients;
        this.position=position;
    }
    public int getPatients(){
        return patients;
    }

    public String getPosition(){
        return position;
    }
    public void setPosition(){
        this.position = position;
    }
    public void setPatients(int patients){
        if (patients<0){
            System.out.println("Ошибка в количестве пациаентов ");
            return;
        }
    }
    public Name getName(){
        return name;
    }
    public void setName(Name name){
        this.name=name;
    }
    @Override
    public String toString(){
        return "Персонал :" + "пациенты =" + patients +
                ", должность = "+ position;
    }


    }

