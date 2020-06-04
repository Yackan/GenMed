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
public class VOFactura {

    private int idFacturaVO;//idfactura INT NOT NULL auto_increment PRIMARY KEY, 
    private String nombre;//fechaFactura varchar(30) NOT NULL,
    private double cambio;//infoMercado varchar(30) not null,
    private double impuesto;//impuesto varchar(30) not null,
    private Calendar fechaFactura;// cambio int 
    private VOCliente micliente;

    public VOFactura(int idFacturaVO, String nombre, double cambio, double impuesto, Calendar fechaFactura, VOCliente micliente) {
        this.idFacturaVO = idFacturaVO;
        this.nombre = nombre;
        this.cambio = cambio;
        this.impuesto = impuesto;
        this.fechaFactura = fechaFactura;
        this.micliente = micliente;
    }

    public int getIdFacturaVO() {
        return idFacturaVO;
    }

    public void setIdFacturaVO(int idFacturaVO) {
        this.idFacturaVO = idFacturaVO;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCambio() {
        return cambio;
    }

    public void setCambio(double cambio) {
        this.cambio = cambio;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public Calendar getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Calendar fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public VOCliente getMicliente() {
        return micliente;
    }

    public void setMicliente(VOCliente micliente) {
        this.micliente = micliente;
    }

   

    public VOFactura cast(Object t) {
        VOFactura mobj = VOFactura.class.cast(t);
        return mobj;
    }

}
