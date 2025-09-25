package com.java17._25_concorrencia._4_ReentrantReadWriteLock;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class MapReadWrite {

    private final Map<String, String> map = new LinkedHashMap<>();
    private final ReentrantReadWriteLock rwl;

    public MapReadWrite(ReentrantReadWriteLock rwl) {
        this.rwl = rwl;
    }

    public void put(String key, String value) {
        rwl.writeLock().lock();

        try {
            if (rwl.isWriteLocked()) {
                System.out.printf("%s obteve ESCRITA do lock%n", Thread.currentThread().getName());
            }

            map.put(key, value);
            Thread.sleep(500);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            rwl.writeLock().unlock();
        }
    }

    public Set<String> getAllKeys() {
        rwl.readLock().lock();


        try {
            return map.keySet();
        } finally {
            rwl.readLock().unlock();
        }
    }
}
