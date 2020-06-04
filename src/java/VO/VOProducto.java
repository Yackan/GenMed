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

import java.util.Calendar;

/**
 *
 * @author Sulay2016
 */
public class VOProducto {

    /*
     */
    private int idProducto;//idProducto INT NOT NULL auto_increment PRIMARY KEY, 
    private String nombre;//nombre  varchar(30)  not null,
    private String codigoBarra;//codeBarras varchar(30)  not null,
    private int cantidadd;//cantidad INT NOT null,

    private double precio;//precio INT NOT    null,
    private String fabricacion, vencimiento;// fecha varchar( 30)  not null,
    private String proveedor;//  proveedor varchar(    30) not null   

    public VOProducto(int idProducto, String nombre, String codigoBarra, int cantidadd, double precio, String fabricacion, String vencimiento,String proveedor) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.codigoBarra = codigoBarra;
        this.cantidadd = cantidadd;
        this.precio = precio;
        this.fabricacion = fabricacion;
        this.vencimiento = vencimiento;
        this.proveedor=proveedor;
    }
      public VOProducto() {
       
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(String codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public int getCantidadd() {
        return cantidadd;
    }

    public void setCantidadd(int cantidadd) {
        this.cantidadd = cantidadd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(String fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(String vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
        
    public  VOProducto cast(Object t) {
        VOProducto mobj = VOProducto.class.cast(t);
        return mobj;
     }

}
