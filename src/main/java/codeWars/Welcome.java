package codeWars;

import java.util.*;

public class Welcome {

    public static String greet(String language){
        // your code
        String result = "Welcome";
        Map<String, String> myMap = new HashMap<String, String>();
        String data = "english: \"Welcome\",\n" +
                "czech: \"Vitejte\",\n" +
                "danish: \"Velkomst\",\n" +
                "dutch: \"Welkom\",\n" +
                "estonian: \"Tere tulemast\",\n" +
                "finnish: \"Tervetuloa\",\n" +
                "flemish: \"Welgekomen\",\n" +
                "french: \"Bienvenue\",\n" +
                "german: \"Willkommen\",\n" +
                "irish: \"Failte\",\n" +
                "italian: \"Benvenuto\",\n" +
                "latvian: \"Gaidits\",\n" +
                "lithuanian: \"Laukiamas\",\n" +
                "polish: \"Witamy\",\n" +
                "spanish: \"Bienvenido\",\n" +
                "swedish: \"Valkommen\",\n" +
                "welsh: \"Croeso\"";
        data = data.replace(",", "");
        data = data.replace("\"", "");
        data = data.replace(" ", "");
        List<String> pre = Arrays.asList(data.split("\n"));

        pre.forEach(string -> {
            List<String> tmp = Arrays.asList(string.split(":"));
            myMap.put(tmp.get(0), tmp.get(1));
        });
        return myMap.getOrDefault(language, myMap.get("english"));

//        if (myMap.containsKey(language)) {
//            result = myMap.get(language);
//        }

//        return result;







//        public static Map<String, String> map = new HashMap<>();
//
//        static {
//            map.put("english", "Welcome");
//            map.put("czech", "Vitejte");
//            map.put("danish", "Velkomst");
//            map.put("dutch", "Welkom");
//            map.put("estonian", "Tere tulemast");
//            map.put("finnish", "Tervetuloa");
//            map.put("flemish", "Welgekomen");
//            map.put("french", "Bienvenue");
//            map.put("german", "Willkommen");
//            map.put("irish", "Failte");
//            map.put("italian", "Benvenuto");
//            map.put("latvian", "Gaidits");
//            map.put("lithuanian", "Laukiamas");
//            map.put("polish", "Witamy");
//            map.put("spanish", "Bienvenido");
//            map.put("swedish", "Valkommen");
//            map.put("welsh", "Croeso");
//        }
//
//        public static String greet(String language){
//            return map.getOrDefault(language, map.get("english"));
//        }
    }
}
