import static org.junit.Assert.*;

import org.junit.Test;

public class CcuentaTestRSS {

	@Test
	public void testCcuentaRSS() {
		Ccuenta miCuenta=new Ccuenta("Raúl","Serrano",3200,1);
		assertNotNull(miCuenta);
	}

	@Test
	public void testGetSaldoRSS() {
		Ccuenta miCuenta=new Ccuenta("Raúl","Serrano",3200,1);
		double res = miCuenta.getSaldo();
		assertEquals(3200,res,0);
	}

	@Test
	public void testIngresarRSS() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Raúl","Serrano",3200,1);
		miCuenta.ingresar(800);
		assertEquals(4000,miCuenta.getSaldo(),0);
	}
	
	@Test(expected=Exception.class)
	public void testIngresarNegativoRSS() throws Exception{
	Ccuenta miCuenta=new Ccuenta("Raúl","Serrano",3200,1);
	miCuenta.ingresar(-600);
	}

	@Test
	public void testRetirarRSS() throws Exception {
		Ccuenta miCuenta=new Ccuenta("Raúl","Serrano",3200,1);
		miCuenta.retirar(800);
		assertEquals(2400,miCuenta.getSaldo(),0);
	}

	@Test(expected=Exception.class)
	public void testGetCuentaRSS() throws Exception{
		Ccuenta miCuenta=new Ccuenta("Raúl","Serrano",3200,1);
		miCuenta.retirar(8000);
	}

}
