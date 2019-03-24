import java.awt.*;
import java.util.Map;

class Comparator {
    boolean compare(Map<String, Integer> mapColor, Color color){

        if (color.getRed() >= mapColor.get("Rmin") && color.getRed() <= mapColor.get("Rmax") &&
                color.getGreen() >= mapColor.get("Gmin") && color.getGreen() <= mapColor.get("Gmax") &&
                color.getBlue() >= mapColor.get("Bmin") && color.getBlue() <= mapColor.get("Bmax")){
            return true;
        }
        return false;
}}
