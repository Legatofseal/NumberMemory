package com.company;

/**
 * Created by Legat on 5/28/2016.
 */
public class MemoryService {
    static public long getMaxMemory() {
        long freeMemory;
        try {
            freeMemory = Runtime.getRuntime().freeMemory();
        } catch (Exception ex){
            System.out.println(ex.toString());
            freeMemory=-1;
        }
        return freeMemory;
    }
}
