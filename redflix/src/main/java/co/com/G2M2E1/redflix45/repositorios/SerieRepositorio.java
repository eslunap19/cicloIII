/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.G2M2E1.redflix45.repositorios;

import co.com.G2M2E1.redflix45.modelos.Serie;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author ESLUNAP
 */
public interface SerieRepositorio extends JpaRepository<Serie, Long>{
    
    List<Serie> findByTituloSerie(String tituloSerie);
}
