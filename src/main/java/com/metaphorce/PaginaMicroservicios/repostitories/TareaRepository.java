package com.metaphorce.PaginaMicroservicios.repostitories;

import com.metaphorce.PaginaMicroservicios.entidades.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Integer> {
}
