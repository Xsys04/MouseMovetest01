import java.awt.*;
import java.awt.event.InputEvent;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) throws AWTException, InterruptedException {

        Map<String, Integer> mapColor = new HashMap<>();
        mapColor.put("Rmin", 213);
        mapColor.put("Rmax", 233);
        mapColor.put("Gmin", 216);
        mapColor.put("Gmax", 236);
        mapColor.put("Bmin", 221);
        mapColor.put("Bmax", 241);

        List<Coords> coordsList = new ArrayList<>();
        coordsList.add(new Coords(780,548));
        coordsList.add(new Coords(870,588));
        coordsList.add(new Coords(870,508));
        coordsList.add(new Coords(690,588));
        coordsList.add(new Coords(690,508));

        //Color trueColor = new Color(223,226,231);
        Robot robot = new Robot();

        Thread.sleep(3000);

        while (true){
            for (int i = 0; i < coordsList.size(); i++) {
                Comparator comparator = new Comparator();
               Color color = robot.getPixelColor(coordsList.get(i).getX(), coordsList.get(i).getY());
               boolean result = comparator.compare(mapColor, color);

               if (result){
                   robot.mouseMove(coordsList.get(i).getX(),coordsList.get(i).getY());
                   robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                   robot.mouseMove(coordsList.get(i).getX() + 400,coordsList.get(i).getY());
                   break;
               }
            }
        }
    }
}
