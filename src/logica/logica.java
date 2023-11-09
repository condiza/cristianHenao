package logica;

import java.util.ArrayList;

public class logica {

	
	double imc;
	
	ArrayList<persona> listaPersonas;
	
	
	public  logica() {
		listaPersonas = new ArrayList<persona>();
	}
	
	public String registraPersona(persona persona) {
		
	    // Verificar si el documento ya existe en la lista
	    for (persona p : listaPersonas) {
	        if (p.getDocumento()==(persona.getDocumento())) {
	            return "Error: Documento ya registrado.";
	        }
	    }
		
		String resultado = "REGISTRO EXITOSO \n";
		resultado+="Documento: "+persona.getDocumento()+"\n";
		resultado+="Nombre: "+persona.getNombre()+"\n";
		resultado+="Edad: "+persona.getEdad()+"\n";
		resultado+="Peso: "+persona.getPeso()+" Kg"+"\n";
		resultado+="Talla: "+persona.getTalla()+" cm"+"\n";
		
		String imcmsj = calculaIMC(persona.getPeso(),persona.getTalla());
		persona.setImcMnsj("IMC: "+Math.round(imc * 10) / 10+" Kg / "+imcmsj);
		
		resultado +="IMC: "+imcmsj;
		persona.setImc(Math.round(imc * 10) /10);

		
		listaPersonas.add(persona);
		
		return resultado;
	}

	private String calculaIMC(double peso, double talla) {
		 imc = peso/(talla*talla);
		String mnsj="";
		if (Math.round(imc * 10) / 10 <18) {
			mnsj+=" Anorexia";
		}else if (Math.round(imc * 10) / 10>=18&&imc<20) {
			mnsj=" Delgadez";
		}else if (Math.round(imc * 10) / 10>=20&&imc<27) {
			mnsj=" Normalidad";
		}else if (Math.round(imc * 10) / 10>=27&&imc<30) {
			mnsj=" Obesidad (grado 1)";
		}else if (Math.round(imc * 10) / 10>=30&&imc<35) {
			mnsj=" Obesidad (grado 2)";
		}else if (Math.round(imc * 10) / 10>=35&&imc<40) {
			mnsj=" Obesidad (grado 3)";
		}else if (Math.round(imc * 10) / 10>=40) {
			mnsj=" Obesidad morvida";
		}
		
		return "Su imc indica que tiene: "+mnsj;
	}

	public String consultListaPersonas() {
		String listP = "";
		persona p=null;
		
		for (int i = 0; i <listaPersonas.size(); i++) {
			p=listaPersonas.get(i);
			listP +="Documento:"+p.getDocumento()+"\n";
			listP +="Nombre:"+p.getNombre()+"\n";
			listP +="Edad:"+p.getEdad()+"\n";
			listP +="Peso:"+p.getPeso()+" Kg"+"\n";
			listP +="Talla:"+p.getTalla()+" cm"+"\n";
			listP +=p.getImcMnsj()+"\n";
			listP +="--------------------------------------"+"\n";
		}
		
		return listP;
	}

	public String calcularPromedio() {
		String listaPromedio="";
		listaPromedio+="TODOS LOS EXAMENES \n\n";
		for (int i = 0; i < listaPersonas.size(); i++) {
			listaPromedio+="Nombre: "+listaPersonas.get(i).getNombre()+"\n";
			listaPromedio+="IMC: "+listaPersonas.get(i).getImc()+" Kg"+"\n";
			listaPromedio+="Resultado examen: "+listaPersonas.get(i).getImcMnsj()+"\n";
			listaPromedio+="----------------------------------"+"\n\n";
		}
		
		
		return listaPromedio;
	}

	public String calcularImc(persona persona) {
		String resultado = "PRECIONE REGISTRAR PARA GUARDAR EL USUARIO \n";
		resultado+="Documento: "+persona.getDocumento()+"\n";
		resultado+="Nombre: "+persona.getNombre()+"\n";
		resultado+="Edad: "+persona.getEdad()+"\n";
		resultado+="Peso: "+persona.getPeso()+"Kg"+"\n";
		resultado+="Talla: "+persona.getTalla()+"cm"+"\n";
		
		String imcmsj = calculaIMC(persona.getPeso(),persona.getTalla());
		persona.setImcMnsj("IMC: "+Math.round(imc * 10) / 10+" "+imcmsj);
		
		resultado +=persona.getImcMnsj();
		persona.setImc(Math.round(imc * 10) /10);
		
		return resultado;

	}

	

}







