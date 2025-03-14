import java.util.HashMap;
import java.util.Set;
import java.util.Map;

public class Hashing{
    public static void main(String args[]){
        //Creation Operation
        HashMap<String, Integer>marks = new HashMap<>();
        
        //Insertion Operation
        marks.put("Chandler",95);
        marks.put("Ross",79);
        marks.put("Rachel",90);
        marks.put("Monica",95);
        marks.put("Joey",100);
        marks.put("Phoebe",45);
        
        System.out.println(marks);
        
        marks.put("Joey", 97);
        System.out.println(marks);
        
        //Lookup Operation
        if(marks.containsKey("Rachel")){
            System.out.println("Key is present");
        }
        else{
            System.out.println("Key isn't present");
        }
        System.out.println(marks.get("Ross")); //Key is present
        System.out.println(marks.get("Liza")); //Key isn't present
        
        //Iteration--> Entry Set
        for(Map.Entry<String,Integer> i: marks.entrySet()){
            System.out.println(i.getKey()+" "+i.getValue());
        }
        
        //Iteration--> Set
        Set<String>keys = marks.keySet();
        for(String key:keys){
            System.out.println(key+" "+marks.get(key));
        }
        
        //Remove a key-value pair
        marks.remove("Ross");
        System.out.println(marks);
    }
}
