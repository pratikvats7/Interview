package Java.interview;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashMap;
import java.util.Objects;

@Data
@AllArgsConstructor
public class CustomObject {

    private int id;
    private String name;

    public static void main(String[] args) {
        CustomObject customObject = new CustomObject(1,"pv");
        System.out.println(customObject.hashCode());
        System.out.println(customObject.hashCode());
        CustomObject customObject1 = new CustomObject(2,"ro");
        System.out.println(customObject1.hashCode());
        CustomObject customObject3 = new CustomObject(3,"ro1");

        HashMap<CustomObject,String> map = new HashMap<>();
        map.put(customObject,"hi");
        map.put(customObject1,"hello");
        map.put(customObject3,"hello2");

        String val = map.get(customObject1);

        customObject1.setId(3);
        customObject1.setId(4);

        System.out.println(map);
        System.out.println(map.get(customObject1));

        map.remove(customObject1);
        System.out.println(map);
        map.put(customObject1,val);

        System.out.println(map.get(customObject1));
        System.out.println(map);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomObject that)) return false;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
