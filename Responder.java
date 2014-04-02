import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.HashSet;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    Random aleatorio;
    ArrayList <String> responses;
    HashMap <HashSet <String>, String> responsesOfImput;
    HashSet <String> coincident1;
    HashSet <String> coincident2;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        aleatorio = new Random();
        coincident1 = new HashSet();
        coincident2 = new HashSet();
        responsesOfImput = new HashMap<>();
        responses = new ArrayList<>();
        
        coincident1.add("crash");
        coincident1.add("problem");
        coincident1.add("linux");
        coincident2.add("free");
        coincident2.add("app");
        
        responses.add("Que le esta ocurriendo");
        responses.add("Que problema tiene en su equipo");
        responses.add("Espere se esta arreglando");
        responses.add("El equipo se ha arreglado perfectamente");
        responses.add("Muchas gracias por confiar en nosotros");
         
        responsesOfImput.put(coincident1,"el problema esta en linux");
        responsesOfImput.put(coincident2,"la aplicacion es gratis");
        
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(HashSet <String> userInput)
    {
        String response = null;
        response = responsesOfImput.get(userInput);
        
       
        
        if(responses.size() > 0){
            int numeroAleatorio = aleatorio.nextInt(responses.size());
            response = responses.remove(numeroAleatorio); 
        }else{
            response = "No se ha entendido la frase del usuario";
        }  
    
        return response;
    }
}
