package kyu8.Welcome;

import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static String greet(String language){
        Map<String,String> welcomeMap = new HashMap<>();
        welcomeMap.put("english", "Welcome");
        welcomeMap.put("czech", "Vitejte");
        welcomeMap.put("danish", "Velkomst");
        welcomeMap.put("dutch", "Welkom");
        welcomeMap.put("estonian", "Tere tulemast");
        welcomeMap.put("finnish", "Tervetuloa");
        welcomeMap.put("flemish", "Welgekomen");
        welcomeMap.put("french", "Bienvenue");
        welcomeMap.put("german", "Willkommen");
        welcomeMap.put("irish", "Failte");
        welcomeMap.put("italian", "Benvenuto");
        welcomeMap.put("latvian", "Gaidits");
        welcomeMap.put("lithuanian", "Laukiamas");
        welcomeMap.put("polish", "Witamy");
        welcomeMap.put("spanish", "Bienvenido");
        welcomeMap.put("swedish", "Valkommen");
        welcomeMap.put("welsh", "Croeso");

        return welcomeMap.get(language);
    }
}