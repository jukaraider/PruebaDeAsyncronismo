import java.util.*;
import org.apache.xmlrpc.*;

public class JavaClient 
{
    @SuppressWarnings("unchecked")
   public static void main (String [] args) 
   {
      try {

         XmlRpcClient client = new XmlRpcClient("http://localhost:8866/"); 
         Vector params = new Vector();
         params.addElement(new Integer(17));
         params.addElement(new Integer(14));

         Object result = client.execute("calcular.suma", params);

         int sum = ((Integer) result).intValue();
         System.out.println("The sum is: "+ sum);

      } catch (Exception exception) {
         System.err.println("JavaClient: " + exception);
      }
   }
}