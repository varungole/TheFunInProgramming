import java.util.*;

public class ConversionMap {
    HashMap<Pair, Float> conversionMap= new HashMap<>(); 

    public ConversionMap()
    {
        conversionMap.put(new Pair(1, 2), 0.012f);
        conversionMap.put(new Pair(2, 1), 83.38f);
        conversionMap.put(new Pair(1, 3), 0.0011f);
        conversionMap.put(new Pair(3, 1), 89.82f);
        conversionMap.put(new Pair(2, 3), 0.93f);
        conversionMap.put(new Pair(3, 2), 1.08f);

    }

    public HashMap<Pair, Float> map()
    {
        return conversionMap;
    }




}
