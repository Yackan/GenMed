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
public class VO_Enfermedad {
    private int idEnfermedad;
    private String nombre;
    private String  descripcion;    

    public VO_Enfermedad(int idEnfermedad, String nombre, String descripcion) {
        this.idEnfermedad = idEnfermedad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

     public VO_Enfermedad() {
        this.idEnfermedad = idEnfermedad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

       public  VO_Enfermedad cast(Object t) {
        VO_Enfermedad mobj = VO_Enfermedad.class.cast(t);
        return mobj;
     }
    
    
    }
