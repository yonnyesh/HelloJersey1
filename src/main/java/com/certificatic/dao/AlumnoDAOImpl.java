package com.certificatic.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.certificatic.model.Alumno;

public class AlumnoDAOImpl implements AlumnoDAO{
	
	private static Map<Integer, Alumno> alumnos = new HashMap<>();
	static {
		 Alumno yonny =
				 new Alumno(123456, "Yonny", "Sanchez", "Informatica");
		 alumnos.put(1, yonny);
	}

	@Override
	public List<Alumno> getAlumnos() {
		// TODO Auto-generated method stub
		return new ArrayList<Alumno>(alumnos.values());
	}

	@Override
	public void addAlumno(Alumno alumno) {
		alumnos.put(alumnos.size() + 1, alumno);
		
	}

	@Override
	public void deleteAlumno(int id) {
		alumnos.remove(id);
		
	}

}
