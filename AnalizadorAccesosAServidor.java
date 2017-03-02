import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * Write a description of class AnalizadorAccesosAServidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnalizadorAccesosAServidor
{
    private ArrayList<Acceso> accesosAServidor;

    /**
     * Constructor for objects of class AnalizadorAccesosAServidor
     */
    public AnalizadorAccesosAServidor()
    {
        accesosAServidor = new ArrayList<Acceso>();
    }

    /**
     * 
     */
    public void analizarArchivoDeLog(String nombreArchivoALeer)
    {
        try{
            File archivo = new File(nombreArchivoALeer);
            Scanner sc = new Scanner(archivo);
            while (sc.hasNextLine()){
                String consulta = sc.nextLine();
                System.out.println(consulta);
                String[] lineaActual = consulta.split(" ");
                Acceso acceso = new Acceso(Integer.parseInt(lineaActual[0]), Integer.parseInt(lineaActual[1]), 
                                           Integer.parseInt(lineaActual[2]), Integer.parseInt(lineaActual[3]), Integer.parseInt(lineaActual[4]));
                accesosAServidor.add(acceso);
            }
        }
        catch(FileNotFoundException e){

        }
    }

    /**
     *  
     */
    public int obtenerHoraMasAccesos()
    {
        int index = -1;
        if(accesosAServidor.size() != 0){
            int[] numeroDeHoras = new int[24];
            
        }
       else{
            System.out.println("No hay datos de acceso aun.");
       }
        return index;
    }

}