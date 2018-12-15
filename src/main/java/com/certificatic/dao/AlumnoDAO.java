package com.certificatic.dao;

import java.util.List;

import com.certificatic.model.Alumno;

public interface AlumnoDAO {
	
	public List<Alumno> getAlumnos();
	public void addAlumno(Alumno alumno);
	public void deleteAlumno(int id);

}
