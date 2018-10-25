package com.example.afif.appmodul2kel35.ui.home;

import com.example.afif.appmodul2kel35.data.model.DataCar;

import java.util.List;

public interface HomeView {
    void successShowCar(List<DataCar> dataCars);
    void failedShowCar(String message);

}
