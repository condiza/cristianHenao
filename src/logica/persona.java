package logica;

public class persona {
	
	private int documento;
	private String nombre;
	private int edad;
	private double talla;
	private double peso;
	private double imc;
	private String imcMnsj;
	
	public  persona() {
		
	}

	public persona(int documento, String nombre, int edad, double talla, double peso, double imc,String imcMnsj) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.edad = edad;
		this.talla = talla;
		this.peso = peso;
		this.imc = imc;
		this.imcMnsj = imcMnsj;
	}
	
	public String getImcMnsj() {
		return imcMnsj;
	}

	public void setImcMnsj(String imcMnsj) {
		this.imcMnsj = imcMnsj;
	}

	public double getImc() {
		return imc;
	}

	public void setImc(double imc) {
		this.imc = imc;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	
	

}
