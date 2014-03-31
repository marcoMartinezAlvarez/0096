import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
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
    HashMap <String, String> responsesOfImput;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        responses = new ArrayList<>();
        responsesOfImput = new HashMap<>();
        responses.add("Que le esta ocurriendo");
        responses.add("Que problema tiene en su equipo");
        responses.add("Espere se esta arreglando");
        responses.add("El equipo se ha arreglado perfectamente");
        responses.add("Muchas gracias por confiar en nosotros¡¡¡");
        
        responsesOfImput.put("android","funciona perfectamente reinicie el sistema");
        responsesOfImput.put("simbian" ,"el sistema operativo se ha caido... reparando");
        responsesOfImput.put("windowsPhone" ,"el sistema se esta actualizando");
        responsesOfImput.put("Ios" ,"el sistema se ha arreglado listo para usarse");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse( HashSet <String> userInput)
    {
       String response = null;
       String userInputString= "";
       for(String elemento: userInput){
        userInputString = elemento;
        }
       response = responsesOfImput.get(userInputString);
       
       if(response == null){
        
           response = responses.get(aleatorio.nextInt(responses.size()));
        }
        return response;
    }
}
