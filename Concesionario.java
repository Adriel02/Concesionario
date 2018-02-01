/**
 * Created by Adriel on 04/07/2017.
 */
public class Concesionario {
        public static void main(String[] args){
            //org.junit.runner.JUnitCore.main("pr1.ConcesionarioTest");

            Extra pinturaMetalizada = new Extra ("pm", "Pintura metalizada", 450);
            Extra aABizona = new Extra ("acb", "Aire acondicionadao bizona", 650);
            Extra cincoPuertas = new Extra ("5p", "Cinco puertas", 350);
            Extra llantasAleacion = new Extra ("lal", "Llantas aleacion ligera", 750);
            Vehiculo base = new Vehiculo("vb","Vehiculo base",8000);
            Vehiculo ls = new Vehiculo("vls","Vehiculo normal",12000);
            Vehiculo lx = new Vehiculo("vlx","Vehiculo lujo",28000);
            ls.añadeExtra(cincoPuertas);
            ls.añadeExtra(pinturaMetalizada);
            lx.añadeExtra(cincoPuertas);
            lx.añadeExtra(aABizona);
            lx.añadeExtra(llantasAleacion);
            lx.añadeExtra(pinturaMetalizada);

            Ventas v = new Ventas();
            v.añadeVenta(base);
            v.añadeVenta(ls);
            v.añadeVenta(llantasAleacion);
            v.añadeVenta(base);
            v.añadeVenta(aABizona);
            v.añadeVenta(lx);

            System.out.print(v);
            System.out.println("------------------------------------------------");
            System.out.println(v.masVendido());


            /**
            System.out.println(base.toString());
            System.out.println(lx.toString());
            System.out.println(ls.toString());

*/

// Resultado mostrado en consola:
// 1) vb VehÃ­culo base 8000
// 2) vls VehÃ­culo normal 12000 (pm Pintura metalizada 450, 5p Cinco puertas 350)
// 3) lal Llantas aleaciÃ³n ligera 750
// 4) vb VehÃ­culo base 8000
// 5) acb Aire acondicionadao bizona 650
// 6) vlx VehÃ­culo lujo 28000 (lal Llantas aleaciÃ³n ligera 750, pm Pintura metalizada 450, 5p Cinco puertas 350, acb Aire acondicionadao bizona 650)

            //DESCOMENTAR para ejecutar la clase de pruebas con JUnit
            //org.junit.runner.JUnitCore.main("pr1.ConcesionarioTest");
        }
    }