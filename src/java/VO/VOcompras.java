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
public class VOcompras extends VOFactura{
    
    private int idCompras;//idCompras INT NOT NULL auto_increment PRIMARY KEY, 
    private int idProducto;//idProducto INT NOT NULL,  
    private int idfactura;//idfactura INT NOT NULL,
    private int cedula;//cedula INT NOT NULL,
    private int idVendedor;// idVendedor INT NOT NULL

    public VOcompras(int idCompras, int idProducto, int idfactura, int cedula, int idFacturaVO, 
                     String nombre, double cambio, double impuesto, Calendar fechaFactura, VOCliente micliente) {
        super(idFacturaVO, nombre, cambio, impuesto, fechaFactura, micliente);
        this.idCompras = idCompras;
        this.idProducto = idProducto;
        this.idfactura = idfactura;
        this.cedula = cedula;
    }


      public VOcompras(int idCompras, int idProducto, int idfactura, int cedula,int idVendedor, VOFactura fac,VOCliente cliente) {
        super(fac.getIdFacturaVO(),fac.getNombre(), fac.getCambio(), fac.getImpuesto(), fac.getFechaFactura(), cliente);
        this.idCompras = idCompras;
        this.idProducto = idProducto;
        this.idfactura = idfactura;
        this.cedula = cedula;
    }

    public int getIdCompras() {
        return idCompras;
    }

    public void setIdCompras(int idCompras) {
        this.idCompras = idCompras;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdfactura() {
        return idfactura;
    }

    public void setIdfactura(int idfactura) {
        this.idfactura = idfactura;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }
    

    
    

    public VOcompras cast(Object t) {
        VOcompras mobj = VOcompras.class.cast(t);
        return mobj;
    }

}
