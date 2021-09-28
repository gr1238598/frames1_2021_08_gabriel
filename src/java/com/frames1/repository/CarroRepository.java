/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.frames1.repository;

import com.frames1.model.CarroModel;
import com.frames1.util.ConectorHibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Gabriel
 */
public class CarroRepository {
    //metodo excluir editar buscarpornome, buscarporid
    
    public void salvar(CarroModel carroModel){
        
        //acao de conectar ao banco e salvar os dados de carro na tabela
        Session ses = ConectorHibernateUtil.getSessionFactory().openSession();
        Transaction tr = ses.beginTransaction();
        
        ses.save(carroModel);
        
        tr.commit();
        ses.close();
        
    }
}
