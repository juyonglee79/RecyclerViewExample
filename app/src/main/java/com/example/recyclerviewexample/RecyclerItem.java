package com.example.recyclerviewexample;

public class RecyclerItem {
    private String name;
    private String old;
    private String what;

    public RecyclerItem(String name, String old, String what) {
        this.name = name;
        this.old = old;
        this.what = what;
    }

    public String getName() {
        return name;
    }

    public String getOld(){
        return old;
    }

    public String getWhat() {
        return what;
    }
}