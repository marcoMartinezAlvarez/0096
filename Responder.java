import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    ArrayList <String> responses;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        responses = new ArrayList<>();
        responses.add("Que le esta ocurriendo");
        responses.add("Que problema tiene en su equipo");
        responses.add("Espere se esta arreglando");
        responses.add("El equipo se ha arreglado perfectamente");
        responses.add("Muchas gracias por confiar en nosotros¡¡¡");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int resultado = aleatorio.nextInt(5);
        return responses.get(resultado);

    }
}
