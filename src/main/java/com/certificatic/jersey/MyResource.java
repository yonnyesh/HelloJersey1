package com.certificatic.jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.certificatic.dao.AlumnoDAO;
import com.certificatic.dao.AlumnoDAOImpl;
import com.certificatic.model.Alumno;

/**
 * Root resource (exposed at "myresource" path)
 */
//@Path("myresource")
@Path("alumnos")
public class MyResource {
	
	private AlumnoDAO alumnoDAO = new AlumnoDAOImpl();

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
/*	
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it Yonny!";
    }
 */   
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Alumno> getAlumnos(){
    	return alumnoDAO.getAlumnos();
    	
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)//MediaType.APPLICATION_XML
    public void addAlumno(Alumno alumno) {
    	System.out.println("Entro a guardar alumno:::::");
    	alumnoDAO.addAlumno(alumno);
    	/*
    	Respuesta resp = null;
    	if(alumno.getNumeroCuenta() == 0) {
    		resp = new Respuesta();
    		resp.setCode(403);
    		resp.setMensaje("No tiene numero de cuenta");
    	}else {
    		alumnoDAO.addAlumno(alumno);
    		resp = new Respuesta();
    		resp.setCode(200);
    		resp.setMensaje("Se aguarda de forma exitosa");
    		
    	}
    	return resp;
    */	
    }
    
    @DELETE
    @Path("/{alumnoId}")
    public void deleteAlumno(@PathParam("alumnoId") int id) {
    	alumnoDAO.deleteAlumno(id);
    }
}
