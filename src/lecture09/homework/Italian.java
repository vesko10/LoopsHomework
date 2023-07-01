package lecture09.homework;

public class Italian extends Person{
    public Italian(String name, String sex, String religion, boolean hasJob, String egn, String country) {
        super(name,sex,religion,"Italian",hasJob,"Italian" ,egn,country);
    }

    @Override
    public void sayHello() {
        System.out.println("Ciao!");
    }

    public void danceTarantella(){
        System.out.println("We are dancing Tarantella!");
    }
}
