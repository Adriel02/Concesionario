import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Adriel on 04/07/2017.
 */
public class Ventas {

         private ArrayList<Vendible> listavendible = new ArrayList<Vendible>();


    public void añadeVenta(Vendible vendible){
        listavendible.add(vendible);
    }
    public int totalVentas(){
        return listavendible.size();
    }
    public ArrayList<Vendible> listaVentas(){
        return listavendible;
    }

    public String masVendido(){
        Map<String,Integer> mapa = new HashMap<>();
        String vendido="";
        for (Vendible e: listavendible) {
            if(!mapa.containsKey(e.dameId())){
                mapa.put(e.dameId(),1);
            }
            if(mapa.containsKey(e.dameId())){
                mapa.put(e.dameId(),mapa.get(e.dameId())+1);
            }
            if(e instanceof Vehiculo){
                ArrayList<Extra> extrasVehiculo= ((Vehiculo) e).dameExtras();
                for(Extra extra: extrasVehiculo){
                    if(!mapa.containsKey(extra.dameId())){
                        mapa.put(extra.dameId(),1);
                    }
                    if(mapa.containsKey(e.dameId())){
                        mapa.put(extra.dameId(),mapa.get(extra.dameId())+1);
                    }
                }
            }
        }
        //Aqui ya esta el mapa totalmente formado.
        int mayor=0;
        for (Integer i:mapa.values()) {
            if(i>=mayor){
                mayor=i;
            }
        }
        for (String key: mapa.keySet()) {
            if(mapa.get(key)==mayor){
                vendido=key;
            }
        }
        return vendido;
    }

    public String toString(){
        int contador=1;
        String devolver="";
        for (Vendible e:listavendible) {
            devolver+=contador+") "+e.toString()+"\n";
            contador++;
        }
        return devolver;
    }

}
