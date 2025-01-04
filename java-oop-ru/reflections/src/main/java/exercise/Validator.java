package exercise;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class Validator {
    public static List<String> validate(Object obj) {
        List<String> nullFields = new ArrayList<>();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (Field field : fields) {
            if (field.isAnnotationPresent(NotNull.class)) {
                field.setAccessible(true);

                try {
                    if (field.get(obj) == null) {
                        nullFields.add(field.getName());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return nullFields;
    }
}

// END
