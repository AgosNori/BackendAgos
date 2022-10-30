package com.MyPortfolio.AgosN.Interface;

import com.MyPortfolio.AgosN.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    // PARA TRAER UNA LISTA DE PERSONAS
    public List<Persona> getPersona();
    
    
    //GUARDAR UN OBJETO DE TIPO PERSONA
    public void savePersona(Persona persona);
    
    
    //ELIMINAR UN OBJETO
    public void deletePersona(Long id);
    
    
    //Buscar una persona por id
    public Persona findPersona(Long id);
}
