import java.util.ArrayList;

/**
 * Created by Adriel on 04/07/2017.
 */
public class Vehiculo implements Vendible {
    public Vehiculo(String nombre,String ID,int pvp){
        this.nombre=nombre;
        this.ID=ID;
        this.pvp=pvp;
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
        int contador=0;
        for (Extra e:extras) {
            contador+=e.damePVP();
        }
        return pvp+contador;
    }
    public int dimePrecioInicial(){
        return pvp;
    }
    public boolean añadeExtra(Extra extra){
        if(estaContenido(extra)==true) {
            return false;
        }
        extras.add(extra);
        return true;
    }
    public boolean quitaExtra(Extra extra){
        if(!estaContenido(extra)){
            return false;
        }
        extras.remove(extra);
        return true;
    }
    public boolean estaContenido(Extra extra){
       return extras.contains(extra);
    }

    public ArrayList<Extra>dameExtras(){
        return extras;
    }

    public String toString(){

        String devolver="";
        if(extras.isEmpty()){
            devolver= dameId()+" "+dameNombre()+" "+damePVP();
        }else{
            devolver= dameId()+" "+dameNombre()+" "+dimePrecioInicial()+" (";
            for (Extra e: extras) {
               devolver+=e.dameNombre()+" "+e.dameId()+" "+e.damePVP()+",";
            }
            devolver=devolver.substring(0,devolver.length()-1);
            devolver+=")";
        }
        return devolver;
    }

    ArrayList<Extra>extras = new ArrayList<>();
    private String nombre;
    private String ID;
    private int pvp;
}
