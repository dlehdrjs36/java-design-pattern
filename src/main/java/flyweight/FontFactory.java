package flyweight;

import java.util.HashMap;
import java.util.Map;

//FlyweightFactory
public class FontFactory {

    //Flyweight Pool
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if(cache.containsKey(font)) {
            return cache.get(font);
        } else {
            String[] split = font.split(":");
            //0 : 폰트 이름, 1 : 폰트 사이즈
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
