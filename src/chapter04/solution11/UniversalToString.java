package chapter04.solution11;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.IdentityHashMap;
import java.util.StringJoiner;

public class UniversalToString {
    public static String toString(Object obj) {
        return toString(obj, new IdentityHashMap<>());
    }

    private static String toString(Object obj, IdentityHashMap<Object, Boolean> inProgress) {
        if (obj == null) return "null";

        Class<?> clazz = obj.getClass();

        if (clazz.isPrimitive()
                || obj instanceof String
                || obj instanceof Number
                || obj instanceof Boolean
                || obj instanceof Character
                || obj instanceof Enum<?>) {
            return String.valueOf(obj);
        }

        if (clazz.isArray()) {
            return arrayToString(obj, inProgress);
        }

        if (inProgress.containsKey(obj)) {
            return "...";
        }
        inProgress.put(obj, Boolean.TRUE);

        try {
            StringJoiner sj = new StringJoiner(", ", clazz.getSimpleName() + "[", "]");
            for (Class<?> c = clazz; c != null && c != Object.class; c = c.getSuperclass()) {
                for (Field f : c.getDeclaredFields()) {
                    if (Modifier.isStatic(f.getModifiers())) continue;
                    if (f.isSynthetic()) continue;
                    f.setAccessible(true);
                    try {
                        Object value = f.get(obj);
                        sj.add(f.getName() + "=" + toString(value, inProgress));
                    } catch (IllegalAccessException e) {
                        sj.add(f.getName() + "=<inaccessible>");
                    }
                }
            }
            return sj.toString();
        } finally {
            inProgress.remove(obj);
        }
    }

    private static String arrayToString(Object array, IdentityHashMap<Object, Boolean> inProgress) {
        if (inProgress.containsKey(array)) return "...";
        inProgress.put(array, Boolean.TRUE);
        try {
            int len = Array.getLength(array);
            StringJoiner sj = new StringJoiner(", ", "[", "]");
            for (int i = 0; i < len; i++) {
                sj.add(toString(Array.get(array, i), inProgress));
            }
            return sj.toString();
        } finally {
            inProgress.remove(array);
        }
    }
}
