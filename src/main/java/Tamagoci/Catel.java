package Tamagoci;

public class Catel {

    private String name;
    private int greutate;
    private int varsta;


    public void setName (String wantedName) {
        name = wantedName;
    }


    public int getVarsta() {
        return varsta;

    }



    public void latra () {
        System.out.println("HamHamburger");
    }

    public void mananca() {
        greutate++;

        if (greutate >= 10) {
            varsta++;
        }
    }


    public Object getName() {
        return name;
    }
}
