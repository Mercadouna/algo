package proyectoEmpleadosJefes;

import java.time.LocalDate;

public class Empleados {
	protected static int contador=0;
	protected static final String NombreEmpresa = "Electrica S.A";
	protected String Dni;
	protected String nomEmpl;
	protected int mesEntrada;
	protected int añoEntrada;
	protected double porcentajeIncrementoSueldo;
	protected static int sueldoBase=1000;
	
	public Empleados() {
		this.Dni="";
		this.nomEmpl="";
		this.mesEntrada=0;
		this.añoEntrada=0;
		this.porcentajeIncrementoSueldo=0;
		
	}
	
	
	public String getNombreEmpresa() {
		return NombreEmpresa;
	}
	public String getDni() {
		return Dni;
	}
	public void setDni(String dNI) {
		Dni = dNI;
	}
	public String getNomEmpl() {
		return nomEmpl;
	}
	public void setNomEmpl(String nomEmpl) {
		this.nomEmpl = nomEmpl;
	}
	public int getMesEntrada() {
		return mesEntrada;
	}
	public void setMesEntrada(int mesEntrada) {
		this.mesEntrada = mesEntrada;
	}
	public int getAñoEntrada() {
		return añoEntrada;
	}
	public void setAñoEntrada(int añoEntrada) {
		this.añoEntrada = añoEntrada;
	}
	public double getPorcentajeIncrementoSueldo() {
		return porcentajeIncrementoSueldo;
	}
	public void setPorcentajeIncrementoSueldo(int porcentajeIncrementoSueldo) {
		this.porcentajeIncrementoSueldo = porcentajeIncrementoSueldo;
	}
	public static int getSueldoBase() {
		return sueldoBase;
	}
	public static void setSueldoBase(int sueldoBase) {
		Empleados.sueldoBase = sueldoBase;
	}
	@Override
	public String toString() {
		return "Empleados [NombreEmpresa=" + NombreEmpresa + ", DNI=" + Dni + ", nomEmpl=" + nomEmpl + ", mesEntrada="
				+ mesEntrada + ", añoEntrada=" + añoEntrada +  ", porcentajeIncrementoSueldo="
				+ porcentajeIncrementoSueldo + "]";
	}
	
	public double incrementar() {
		double sueldoFinal=0;
		sueldoFinal=Empleados.sueldoBase*(this.getPorcentajeIncrementoSueldo());
		if (LocalDate.now().getYear()-this.añoEntrada>6){
			sueldoFinal=sueldoFinal+100;
		}
		return sueldoFinal;
		}
		
	
}
