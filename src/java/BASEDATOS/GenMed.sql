drop schema if exists GenMed;
create database GenMed;
use GenMe;
CREATE TABLE Medico (
IdMedico INT NOT NULL PRIMARY KEY auto_increment,
Nombre     VARCHAR(30) NOT NULL
);
CREATE TABLE Especialista (
IdEspecialista INT NOT NULL PRIMARY KEY auto_increment,
Nombre     VARCHAR(30) NOT NULL,
descripcion VARCHAR(30) NOT NULl
);




CREATE TABLE Medicamento (
IdMedicamento INT NOT NULL PRIMARY KEY auto_increment,
Nombre     VARCHAR(30) NOT NULL,
posologia VARCHAR(30) NOT NULl,
Dosis int not null,
ViaAdministra VARCHAR(30) NOT NULL   
);

CREATE TABLE EPS (
IdEPS INT NOT NULL PRIMARY KEY auto_increment,   
nitEps  INT NOT NULL,
nombre   VARCHAR(30) NOT NULL
);
CREATE TABLE Enfermedad (
IdEnfermedad INT NOT NULL PRIMARY KEY auto_increment,   
nombre   VARCHAR(30) NOT NULL,
descripcion  VARCHAR(30) NOT NULL
);




CREATE TABLE Usuario (
    idUsuario INT NOT NULL PRIMARY KEY auto_increment,    
    cedula int not null,
    nombre VARCHAR(30) NOT NULL,
    apellido VARCHAR(30) NOT NULL,
    fechaNacimiento DATE NOT NULL,
    sangre VARCHAR(30) NOT NULL,
    condicion boolean
);
CREATE TABLE Paciente (
IdPaciente INT NOT NULL PRIMARY KEY auto_increment,
apodo     VARCHAR(30) NOT NULL,
alergias VARCHAR(30) NOT NULL,
contrasenia VARCHAR(30) NOT NULL,
idUsuario INT NOT NULL,
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
);

CREATE TABLE Tutor (
IdTutor INT NOT NULL PRIMARY KEY auto_increment,
apodo     VARCHAR(30) NOT NULL,
alergias VARCHAR(30) NOT NULL,
contrasenia VARCHAR(30) NOT NULL,
idUsuario INT NOT NULL,
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario)
);

CREATE TABLE PacienteL (
IdPacientel INT NOT NULL PRIMARY KEY auto_increment,
apodo     VARCHAR(30) NOT NULL,
contrasenia VARCHAR(30) NOT NULL,
alergias VARCHAR(30) NOT NULL
);

CREATE TABLE Administrador (
IdAdministrador INT NOT NULL PRIMARY KEY auto_increment,
contrasenia VARCHAR(30) NOT NULL,
IdUsuario INT NOT NULL,
FOREIGN KEY (IdUsuario) REFERENCES Usuario (IdUsuario)
);




CREATE TABLE Usuario_X_Paciente(
Id_User_Pa INT NOT NULL  PRIMARY KEY auto_increment, 
idUsuario INT NOT NULL,
IdPaciente INT NOT NULL,
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario),
FOREIGN KEY (IdPaciente) REFERENCES Paciente (IdPaciente)
);



CREATE TABLE Usuario_X_PacienteL(
Id_user_Dill INT NOT NULL  PRIMARY KEY auto_increment, 
idUsuario INT NOT NULL, 
IdPacientel INT NOT NULL,
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario),
FOREIGN KEY (IdPacientel) REFERENCES PacienteL (IdPacientel)
);

CREATE TABLE Usuario_X_Tutor(
Id_user_tu INT NOT NULL  PRIMARY KEY auto_increment, 
idUsuario INT NOT NULL, 
IdTutor INT NOT NULL,
FOREIGN KEY (idUsuario) REFERENCES Usuario (idUsuario),
FOREIGN KEY (IdTutor) REFERENCES Tutor (IdTutor)
);

CREATE TABLE Cliente(
id_Cliente INT NOT NULL  PRIMARY KEY auto_increment, 
id_User_Pa INT NOT NULL, 
id_user_Dill INT NOT NULL,
id_user_tu INT NOT NULL, 

FOREIGN KEY (Id_User_Pa) REFERENCES Usuario_X_Paciente (idUsuario),
FOREIGN KEY (Id_user_Dill) REFERENCES Usuario_X_PacienteL (Id_user_Dill),
FOREIGN KEY (Id_user_tu) REFERENCES Usuario_X_Tutor (IdTutor)
);


CREATE TABLE PacienteL_X_Tutor(
id_Far_ill INT NOT NULL  PRIMARY KEY auto_increment, 
IdPacientel INT NOT NULL, 
IdTutor INT NOT NULL,
FOREIGN KEY (IdPacientel) REFERENCES PacienteL (IdPacientel),
FOREIGN KEY (IdTutor) REFERENCES Tutor (IdTutor)
);



CREATE TABLE Medico_X_Especialista(
id_Med_Es INT NOT NULL  PRIMARY KEY auto_increment, 
IdMedico INT NOT NULL,
IdEspecialista INT NOT NULL,
FOREIGN KEY (IdMedico) REFERENCES Medico (IdMedico),
FOREIGN KEY (IdEspecialista) REFERENCES Especialista (IdEspecialista)
);

CREATE TABLE EspecialistaX_Enfermedad(
id_Med_Es INT NOT NULL  PRIMARY KEY auto_increment, 
IdEspecialista INT NOT NULL,
idEnfermedad INT NOT NULL,
FOREIGN KEY (IdEnfermedad) REFERENCES Enfermedad (IdEnfermedad),
FOREIGN KEY (IdEspecialista) REFERENCES Especialista (IdEspecialista)
);

CREATE TABLE Medicamento_X_Enfermedad(
id_Far_ill INT NOT NULL  PRIMARY KEY auto_increment, 
IdMedicamento INT NOT NULL, 
idEnfermedad INT NOT NULL,
FOREIGN KEY (IdMedicamento) REFERENCES Medicamento (IdMedicamento),
FOREIGN KEY (idEnfermedad) REFERENCES Enfermedad (idEnfermedad)
);


CREATE TABLE formulaMedica (
IdformulaMedica INT NOT NULL PRIMARY KEY auto_increment,
IdPaciente INT NOT NULL ,
idEnfermedad INT NOT NULL ,
IdMedicamento INT NOT NULL,
FOREIGN KEY (IdPaciente) REFERENCES Paciente (IdPaciente),
FOREIGN KEY (idEnfermedad) REFERENCES Enfermedad (idEnfermedad),
FOREIGN KEY (IdMedicamento) REFERENCES Medicamento (IdMedicamento)
);