

package modelo;
import java.io.*;
import java.util.*;
/**
 *
 * @author Personal
 */
public class Viaje {
                private String cedulaConductor,nombreConductor, apellidoConductor,totalAsientos,tipoAuto,placaVehiculo,id,cuidadOrigen,
                cuidadDestino, fechaSalida, horaSalida, horaLlegada, precio, Asientos;
  //creamos el archivo, una lista para manejar los datos y un objeto para poder manipular los datos en la lista
     File viajeTxt = new File ("ViajeTemporal.txt");
     File Base = new File ("BaseDatos.txt");
     Random Id = new Random();
    //comprobamos la creación del archivo       
         
//insertamos datos en el archivo      
    public void mostrarViaje(){
         Scanner sc;
        try {
            sc = new Scanner(viajeTxt);
            while (sc.hasNextLine()) {
                
                String linea = sc.nextLine();
                StringTokenizer tk = new StringTokenizer(linea, "++");
                 cedulaConductor = tk.nextToken();
                 nombreConductor = tk.nextToken();
                 apellidoConductor = tk.nextToken();
                 totalAsientos = tk.nextToken();
                 tipoAuto = tk.nextToken();
                 placaVehiculo = tk.nextToken();
                 id = tk.nextToken();
                 cuidadOrigen = tk.nextToken();
                 cuidadDestino = tk.nextToken();
                 fechaSalida = tk.nextToken();
                 horaSalida = tk.nextToken();
                 horaLlegada = tk.nextToken();
                 precio = tk.nextToken();
                 Asientos = tk.nextToken();
                
                System.err.println(sc);
            }
                  sc.close();

            
       
      
        }catch (IOException e){
        System.out.println(e.getMessage());
    }   
    }
            public void crearViaje(){
        try{
                BufferedWriter Escribir = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Base, true), "utf-8"));          
                Escribir.write(id+"++");
                Escribir.write(cuidadOrigen+"++");
                Escribir.write(cuidadDestino+"++");
                Escribir.write(fechaSalida+"++");
                Escribir.write(totalAsientos+"++");
                Escribir.write(Asientos+"++");
                Escribir.write(precio+"++");
                Escribir.write(nombreConductor+apellidoConductor+"++");
                Escribir.write(cedulaConductor+"++");
                Escribir.write(tipoAuto+"++");
                Escribir.write(placaVehiculo+"++");
                Escribir.write(horaSalida+"++");
                Escribir.write(horaLlegada+"{}\r\n");
                                System.err.println("Escribir");
        }
            catch (IOException e){
        System.out.println(e.getMessage());
    }   
            }
    }
        
    
// 
            
