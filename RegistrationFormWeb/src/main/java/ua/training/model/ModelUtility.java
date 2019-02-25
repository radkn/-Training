package ua.training.model;

import ua.training.model.entities.Subscriber;

import java.util.List;

public class ModelUtility {

    public void saveAbonent(Subscriber subscriber) throws WriteToDBException {
        if(isNikNameAlreadyAvailable(subscriber.getNikName())){
            throw new WriteToDBException(subscriber, "NikName \""+subscriber.getNikName()
                    +"\" is already exists! Please try to enter other nikName.");
        }
    }

    public boolean isNikNameAlreadyAvailable(String nikName) {

        List<String> abonentsNik = FakeDBData.getListOfSubscribersNik();

        for (String nik: abonentsNik){
            if(nik.equals(nikName)){
                return true;
            }
        }

        return false;
    }
}
