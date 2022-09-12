import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
public class Pedido{
	
	//ATRIBUTOS
	
	private String descripcion;
	private String formato;
	private int unidades;
	
	//CONSTRUCTOR:
	
	public Pedido(String d,String f,int u){
		this.descripcion = d;
		this.formato = f;
		this.unidades = u;
	}
	
	//OBTENER DESCRIPCIÓN
	
	public String getDescripcion(){
		int n = this.descripcion.length();
		
		for(int l=n;l<45;l++){
			this.descripcion+=" ";
		}
		return this.descripcion;
	}
	
	//OBTENER FORMATO
	
	public String getFormato(){
		int n = this.formato.length();
		for(int l=n;l<10;l++){
			this.formato+=" ";
		}
		return this.formato;
	}
	
	//OBTENER UNIDADES
	
	public int getUnidades(){
		return this.unidades;
	}
	
	//MODIFICAR UNIDADES
	
	public void setUnidades(int u){
		this.unidades = u;
	}

}
