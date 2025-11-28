package kyu8.TrafficLights;

public class TrafficLights {

    public static String updateLight(String current) {
        if(current.equals("green")){
            return "yellow";
        }else if (current.equals("yellow")){
            return "red";
        }
        else if (current.equals("red")){
            return "green";
        }



        return "";
    }

}
