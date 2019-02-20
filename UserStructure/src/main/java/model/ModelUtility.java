package model;

import model.entities.Abonent;

import java.util.List;

public class ModelUtility {

    public void saveAbonent(Abonent abonent) throws WriteToDBException {
        if(isNikNameAlreadyAvailable(abonent.getNikName())){
            throw new WriteToDBException(abonent, "NikName \""+abonent.getNikName()
                    +"\" is already exists! Please try to enter other nikName.");
        }
    }

    public boolean isNikNameAlreadyAvailable(String nikName) {

        List<String> abonentsNik = FakeDBData.getListOfAbonentsNik();

        for (String nik: abonentsNik){
            if(nik.equals(nikName)){
                return true;
            }
        }

        return false;
    }
}
