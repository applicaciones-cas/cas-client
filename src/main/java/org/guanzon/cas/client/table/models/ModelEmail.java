/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.guanzon.cas.client.table.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 *
 * @author User
 */
public class ModelEmail {
    public SimpleStringProperty index01;
    public SimpleStringProperty index02;
    public SimpleStringProperty index03;
    
    public static ObservableList<String> emailOwn = FXCollections.observableArrayList("Personal", "Office", "Others");
    public ModelEmail(String index01,
               String index02,
               String index03
          ){
        
        this.index01 = new SimpleStringProperty(index01);
        this.index02 = new SimpleStringProperty(index02);
        this.index03 = new SimpleStringProperty(index03);
    }

   

    
    
    public String getIndex01(){return index01.get();}
    public void setIndex01(String index01){this.index01.set(index01);}
    
    public String getIndex02(){
        return emailOwn.get(Integer.parseInt(index02.get()));
    }
    public void setIndex02(String index02){this.index02.set(index02);}
       
    public String getIndex03(){return index03.get();}
    public void setIndex03(String index03){this.index03.set(index03);}
    

    
}
