
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    private NumberDisplay minuto;
    private NumberDisplay hora;
    
    public ClockDisplay()
    {
        minuto = new NumberDisplay(60);
        hora = new NumberDisplay(24);
    }
    
    public void fijarTiempo(int nuevaHora, int nuevoMinuto)
    {
        hora.setValue(nuevaHora);
        minuto.setValue(nuevoMinuto);
    }
    
    public void avanzarMinuto()
    {
        minuto.increment();
        if (minuto.getValue() == 0)
        {
            hora.increment();
        }
    }
    
    public String darHora()
    {
        return hora.getDisplayValue() + ":" + minuto.getDisplayValue();
    }
}
