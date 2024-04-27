package dev.regeorged.concurrent;

import dev.regeorged.exceptions.NoUniqueObjectException;

import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

public class ObjectRegistry {
    private ObjectRegistry() {
    }

    private static final ConcurrentHashMap<Object, Boolean> registry =
            new ConcurrentHashMap<>();

    public static ObjectRegistry getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final ObjectRegistry INSTANCE = new ObjectRegistry();
    }

    public static <T> T pullRandomOrThrow(Supplier<T> supplier) {
        final int MAX_TRIES = 5;
        int attempts = 0;
        T obj;

        do {
            obj = supplier.get();
            attempts++;
            if (attempts > MAX_TRIES) {
                throw new NoUniqueObjectException(""" 
                            Exceeded maximum attempts to find an unregistered object
                            . This object is already registered: %s
                        """.formatted(supplier.get()));
            }
        } while (ObjectRegistry.getInstance().isRegistered(obj));
        return (T) ObjectRegistry.getInstance().register(obj);
    }

    public Object register(Object obj) {
        registry.put(obj, true);
        return obj;
    }

    public void remove(Object obj) {
        registry.remove(obj);
    }

    public boolean isRegistered(Object obj) {
        return registry.containsKey(obj);
    }
}
