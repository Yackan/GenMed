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
package New_VO;

/**
 *
 * @author Sulay2016
 */
public class VO_Medicamento {
    private int idMedicamento;
    private String nombre;
    private String nombreComercial;
    private String FormaFarmaceutica;    
    private int dosis; 
    
         
      private int CantidadNumerica ;/*String.valueOf(CantidadNumerica)*//*Integer.toString(CantidadNumerica)*/
      private  String prefijo ;
      private  String unidades ;     // private String concentracion=String.valueOf(CantidadNumerica)+CantidadNumerica+prefijo+unidades;
      
      
    private String  viaAdministrativa; 
    private int frecuencia;private int Tiempo;  
    private int cantidad;
    private String CantidadLetras;
        
    private String  posologia;  
    private String  recomendaciones; 

    public VO_Medicamento() {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.nombreComercial = nombreComercial;
        this.FormaFarmaceutica = FormaFarmaceutica;
        this.dosis = dosis;
        this.CantidadNumerica = CantidadNumerica;
        this.prefijo = prefijo;
        this.unidades = unidades;
        this.viaAdministrativa = viaAdministrativa;
        this.frecuencia = frecuencia;
        this.Tiempo = Tiempo;
        this.cantidad = cantidad;
        this.CantidadLetras = CantidadLetras;
        this.posologia = posologia;
    }
    
    
    
    
    
    
    
    public VO_Medicamento(int idMedicamento, String nombre, String nombreComercial, String FormaFarmaceutica, int dosis,
                       int CantidadNumerica, String prefijo, String unidades, String viaAdministrativa, int frecuencia, int Tiempo,
                       int cantidad, String CantidadLetras, String posologia, String recomendaciones) {
        this.idMedicamento = idMedicamento;
        this.nombre = nombre;
        this.nombreComercial = nombreComercial;
        this.FormaFarmaceutica = FormaFarmaceutica;
        this.dosis = dosis;
        this.CantidadNumerica = CantidadNumerica;
        this.prefijo = prefijo;
        this.unidades = unidades;
        this.viaAdministrativa = viaAdministrativa;
        this.frecuencia = frecuencia;
        this.Tiempo = Tiempo;
        this.cantidad = cantidad;
        this.CantidadLetras = CantidadLetras;
        this.posologia = posologia;
    }

    public int getIdMedicamento() {
        return idMedicamento;
    }

    public void setIdMedicamento(int idMedicamento) {
        this.idMedicamento = idMedicamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getFormaFarmaceutica() {
        return FormaFarmaceutica;
    }

    public void setFormaFarmaceutica(String FormaFarmaceutica) {
        this.FormaFarmaceutica = FormaFarmaceutica;
    }

    public int getDosis() {
        return dosis;
    }

    public void setDosis(int dosis) {
        this.dosis = dosis;
    }

    public int getCantidadNumerica() {
        return CantidadNumerica;
    }

    public void setCantidadNumerica(int CantidadNumerica) {
        this.CantidadNumerica = CantidadNumerica;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public void setPrefijo(String prefijo) {
        this.prefijo = prefijo;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    

    public String getViaAdministrativa() {
        return viaAdministrativa;
    }

    public void setViaAdministrativa(String viaAdministrativa) {
        this.viaAdministrativa = viaAdministrativa;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getTiempo() {
        return Tiempo;
    }

    public void setTiempo(int Tiempo) {
        this.Tiempo = Tiempo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCantidadLetras() {
        return CantidadLetras;
    }

    public void setCantidadLetras(String CantidadLetras) {
        this.CantidadLetras = CantidadLetras;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }

    public String getRecomendaciones() {
        return recomendaciones;
    }

    public void setRecomendaciones(String recomendaciones) {
        this.recomendaciones = recomendaciones;
    }

    
    
      
      
    
    
    
      
public  VO_Medicamento cast(Object t) {
        VO_Medicamento mobj = VO_Medicamento.class.cast(t);
        return mobj;
     }
    
}