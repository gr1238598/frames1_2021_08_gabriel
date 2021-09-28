/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frame1.controller;

import com.frames1.model.CarroModel;
import com.frames1.repository.CarroRepository;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Gabriel
 */
@ManagedBean
public class CarroController {
    
    
    private CarroModel carroModel = new CarroModel();
    private CarroRepository carroRepository = new CarroRepository();

    
     public void salvar(){
    
        this.getCarroRepository().salvar(carroModel);
        
    }
    
    public CarroRepository getCarroRepository() {
        return carroRepository;
    }

    public void setCarroRepository(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public CarroModel getCarroModel() {
        return carroModel;
    }

    public void setCarroModel(CarroModel carroModel) {
        this.carroModel = carroModel;
    }

    
    
    
}
