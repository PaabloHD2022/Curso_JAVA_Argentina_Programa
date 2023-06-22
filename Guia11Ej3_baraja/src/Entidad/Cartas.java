package Entidad;

public class Cartas {

    private String palo;
    private int num;    

    public Cartas() {
    }

    public Cartas(int num,String palo) {
        this.palo = palo;
        this.num = num;
    }
  

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return num + " de " + palo;
    }
    
}
