package New_VO;

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
/**
 *
 * @author Sulay2016
 */
public class VO_FormulaMedica {
    private int idFormulaMedica;
    private int IdPaciente;
    private int idEnfermedad;
    private int IdMedicamento;
    private int IdEps;
    private String fechaInicio;
     private String Fechafinal;
     private String Fecharegistro;
     public VO_FormulaMedica() {
        this.idFormulaMedica = idFormulaMedica;
        this.IdPaciente = IdPaciente;
        this.idEnfermedad = idEnfermedad;
        this.IdMedicamento = IdMedicamento;
        this.IdEps = IdEps;
        this.fechaInicio = fechaInicio;
        this.Fechafinal = Fechafinal;
        this.Fecharegistro = Fecharegistro;
    }


    public VO_FormulaMedica(int idFormulaMedica, int IdPaciente, int idEnfermedad, int IdMedicamento, int IdEps, String fechaInicio, String Fechafinal, String Fecharegistro) {
        this.idFormulaMedica = idFormulaMedica;
        this.IdPaciente = IdPaciente;
        this.idEnfermedad = idEnfermedad;
        this.IdMedicamento = IdMedicamento;
        this.IdEps = IdEps;
        this.fechaInicio = fechaInicio;
        this.Fechafinal = Fechafinal;
        this.Fecharegistro = Fecharegistro;
    }

    public String getFecharegistro() {
        return Fecharegistro;
    }

    public void setFecharegistro(String Fecharegistro) {
        this.Fecharegistro = Fecharegistro;
    }


    public int getIdFormulaMedica() {
        return idFormulaMedica;
    }

    public void setIdFormulaMedica(int idFormulaMedica) {
        this.idFormulaMedica = idFormulaMedica;
    }

    public int getIdPaciente() {
        return IdPaciente;
    }

    public void setIdPaciente(int IdPaciente) {
        this.IdPaciente = IdPaciente;
    }

    public int getIdEnfermedad() {
        return idEnfermedad;
    }

    public void setIdEnfermedad(int idEnfermedad) {
        this.idEnfermedad = idEnfermedad;
    }

    public int getIdMedicamento() {
        return IdMedicamento;
    }

    public void setIdMedicamento(int IdMedicamento) {
        this.IdMedicamento = IdMedicamento;
    }

    public int getIdEps() {
        return IdEps;
    }

    public void setIdEps(int IdEps) {
        this.IdEps = IdEps;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechafinal() {
        return Fechafinal;
    }

    public void setFechafinal(String Fechafinal) {
        this.Fechafinal = Fechafinal;
    }

    
    


public  VO_FormulaMedica cast(Object t) {
        VO_FormulaMedica mobj = VO_FormulaMedica.class.cast(t);
        return mobj;
     }

}
 