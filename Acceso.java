/**
 * Write a description of class AnalizadorAccesosAServidor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Acceso
{
    // instance variables - replace the example below with your own
    private int anno;
    private int mes;
    private int dia;
    private int hora;
    private int minutos;

    /**
     * Constructor for objects of class AnalizadorAccesosAServidor
     */
    public Acceso(int anno, int mes, int dia, int hora, int minutos)
    {
        this.anno = anno;
        this.mes = mes;
        this.dia = dia;
        this.hora = hora;
        this.minutos = minutos;
    }

    /**
     * metodo getter que coje el dia
     */
    public int getHora()
    {
        return hora;
    }
}