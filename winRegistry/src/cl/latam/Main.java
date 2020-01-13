package cl.latam;

import java.lang.reflect.InvocationTargetException;

public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String value="clave No encontrada";
		byte[] avlues=null;
		String claveRegedit="SYSTEM\\CurrentControlSet\\Control\\COM Name Arbiter";
		//"SYSTEM\\CurrentControlSet\\Control\\COM Name Arbiter";
		//"Equipo\HKEY_LOCAL_MACHINE\HARDWARE\DEVICEMAP\SERIALCOMM"
		try {
			avlues = WinRegistry.readword (
				    WinRegistry.HKEY_LOCAL_MACHINE,                             //HKEY
				    claveRegedit,           //Key
				   "ComDB");

			
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}                                              //ValueName
			    System.out.println("CLAVE REGEDIT de la PINPAD = " + avlues);        
	}

}
