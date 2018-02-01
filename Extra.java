/**
 * Created by Adriel on 04/07/2017.
 */
public class Extra implements Vendible {
    public Extra(String nombre, String ID, int pvp) {
        this.nombre = nombre;
        this.ID = ID;
        this.pvp = pvp;
    }

    @Override
    public String dameId() {
        return ID;
    }

    @Override
    public String dameNombre() {
        return nombre;
    }

    @Override
    public int damePVP() {
        return pvp;
    }

    public String toString(){
        return dameId()+" "+dameNombre()+" "+damePVP();
    }

    private String nombre;
    private String ID;
    private int pvp;
}
