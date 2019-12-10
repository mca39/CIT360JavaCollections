import java.util.*;

    public class CarHashMap {
        public static void main(String[] args){
            HashMap carsMap = new HashMap<String, String>();
            buildMap(carsMap);
            System.out.println("This is a Hash Map of popular brands with one of their cars. Only 1 car for each brand is listed");
            outputMap(carsMap);

            System.out.println();
            System.out.println();

            HashMap carsMapTwo = new HashMap< String, String>();
            System.out.println("This is a map for popular cars and their brands. Since model names are unique, I used them for the key so that unlike the previous map I can have more than one car for each brand");
            buildMapTwo(carsMapTwo);
            outputMap(carsMapTwo);

            System.out.println();
            System.out.println("Now I'll remove an item from the hashMap");
            carsMapTwo.remove("Ram");
            outputMap(carsMapTwo);
        }//close main method

        public static void buildMap(Map<String, String> carsMap){
            carsMap.put("Jeep", "Wrangler");
            carsMap.put("Hyundai", "Elantra");
            carsMap.put("Honda", "CRV");
            carsMap.put("Nissan", "Rogue");
            carsMap.put("Toyota", "Rav4");
            carsMap.put("Chevrolet", "Silverado");
            carsMap.put("Dodge", "Ram");
    }//close buildMap method

        public static void buildMapTwo(Map<String, String> carsMapTwo){
            carsMapTwo.put("F-150", "Ford");
            carsMapTwo.put("Escape", "Ford");
            carsMapTwo.put("Corolla", "Toyota");
            carsMapTwo.put("Rogue", "Nissan");
            carsMapTwo.put("Rav4", "Toyota");
            carsMapTwo.put("Silverado", "Cheverolet");
            carsMapTwo.put("Ram", "Dodge");
        }//close buildMap method

        public static void outputMap(HashMap<String, String>carsMap){
            for(String key: carsMap.keySet()){
                String value = carsMap.get(key);
                System.out.println(key + ',' + ' ' + value);
            }//close for loop
        }//close outputMap method
    }//close CarHashMap class




