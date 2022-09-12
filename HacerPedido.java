import javax.swing.JOptionPane;
public class HacerPedido{
	
		public static void main(String[]args){
		//CANTIDAD DE PRODUCTOS DE LIMPIEZA = n
		int n = 7;
		Pedido [] productos = new Pedido[n];
		
		Pedido pL0 = new Pedido(/*DESCRIPCION*/"LAVAVAJILLAS MANUAL ULTRACONCENTRADO",/*FORMATO*/"G.5L",/*UDS*/0);
		productos[0]=pL0;
		Pedido pL1 = new Pedido(/*DESCRIPCION*/"FREGASUELOS NEUTRO JABÓN VERDE",/*FORMATO*/"G.5L",/*UDS*/0);
		productos[1]=pL1;
		Pedido pL2 = new Pedido(/*DESCRIPCION*/"BOBINA MECÁNICO 100x100 MAXIPLUS",/*FORMATO*/"Pack/2 U",/*UDS*/0);
		productos[2]=pL2;
		Pedido pL3 = new Pedido(/*DESCRIPCION*/"TOALLAS SECAMANOS ZIG-ZAG 100x100",/*FORMATO*/"C/20paq",/*UDS*/0);
		productos[3]=pL3;
		Pedido pL4 = new Pedido(/*DESCRIPCION*/"GEL DE MANOS DERMO",/*FORMATO*/"G.5L",/*UDS*/0);
		productos[4]=pL4;
		Pedido pL5 = new Pedido(/*DESCRIPCION*/"HIGIÉNICO DOMÉSTICO ALBOR DE COLHOGAR 9P*12P",/*FORMATO*/"Pack/108R",/*UDS*/0);
		productos[5]=pL5;
		Pedido pL6 = new Pedido(/*DESCRIPCION*/"DESENGRASANTE SUPERGRASS PLUS",/*FORMATO*/"G.5L",/*UDS*/0);
		productos[6]=pL6;
		
		
		int uds = 0;
		try{
				for (int x=0;x<productos.length;x++){
				uds = Integer.parseInt(JOptionPane.showInputDialog(null,productos[x].getDescripcion()+"\n"+"FORMATO: "+productos[x].getFormato(),"PEDIDOS LIMPIEZA",3));
				
				productos[x].setUnidades(uds);
				}
			}
	catch(Exception e) {
			
			JOptionPane.showMessageDialog(null, "LOS VALORES INTRODUCIDOS NO SON VÁLIDOS", "PEDIDOS LIMPIEZA", 0);
			}


		for(int l=0; l<productos.length;l++){
			if(l==0){
				System.out.println("Buenos días:\nNecesitaríamos los siguientes productos:");
			}
			if(productos[l].getUnidades()>0){
				if(productos[l].getUnidades()==1){
					System.out.println(" -"+productos[l].getDescripcion()+" "+productos[l].getFormato()+" "+productos[l].getUnidades()+" unidad");
					}
				else{
					System.out.println(" -"+productos[l].getDescripcion()+" "+productos[l].getFormato()+" "+productos[l].getUnidades()+" unidades");
				}	
				
				}
				if(l==productos.length-1){
					System.out.println("Gracias, un saludo");
				}
		}
	
	
	}

}
