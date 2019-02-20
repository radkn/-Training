package model;

import java.util.ArrayList;
import java.util.List;

public enum FakeDBData {
    A1("gennaNa"),
    A2("cheburashka");

    private String nik;

    FakeDBData(String s){
        this.nik = s;
    }

    public String getNik(){
        return nik;
    }

    public static List<String> getListOfAbonentsNik(){
        List<String> nikNameList = new ArrayList<String>();
        nikNameList.add(A1.getNik());
        nikNameList.add(A2.getNik());
        return nikNameList;
    }
}
