/*
 * Copyright 2018 Sulay2016.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package VO;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Sulay2016
 */
public class VOInventario {
    
    private int idInventario;// idInventario INT NOT NULL auto_increment PRIMARY KEY, 
    private int idProducto;//idProducto INT NOT NULL ,
    private int cantidad;//cantidad int,
    private static ArrayList<VOProducto> product;

    public VOInventario(int idInventario, int idProducto, int cantidad) {
        this.idInventario = idInventario;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public static ArrayList<VOProducto> getProduct() {
        return product;
    }

    public static void setProduct(ArrayList<VOProducto> product) {
        VOInventario.product = product;
    }
   
    
    

    public  VOInventario cast(Object t) {
        VOInventario mobj = VOInventario.class.cast(t);
        return mobj;
     }
    
}
