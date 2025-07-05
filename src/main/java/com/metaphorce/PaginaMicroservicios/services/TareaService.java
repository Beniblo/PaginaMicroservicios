package com.metaphorce.PaginaMicroservicios.services;

import com.metaphorce.PaginaMicroservicios.entidades.Tarea;

import java.util.List;

public interface TareaService {
    List<Tarea> getTareas();
    Tarea getTareaById(Integer Id); //Usa Integer
    Tarea guardarTarea(Tarea tarea);
    Tarea actualizarTarea(Integer id, Tarea actualizarTarea);
    void eliminarTarea(Integer Id);
}
