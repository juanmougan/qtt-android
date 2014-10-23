package ar.com.ceiucaweb.qtt.web_services;

import java.util.List;

import ar.com.ceiucaweb.qtt.model.Materia;
import retrofit.http.GET;

/**
 * Interfaz que provee servicios relacionados con una Materia
 * Created by jmougan on 23/10/2014.
 */
public interface MateriaWebService {

    @GET("/path/{param}/")
    List<Materia> getMaterias();

}
