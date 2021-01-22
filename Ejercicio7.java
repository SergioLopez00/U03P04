import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
public class Ejercicio7
{
	public static void main(String[] args)
	{	
		Calendar data= Calendar.getInstance();
		int d, m, y, pdn;
		Scanner teclado= new Scanner(System.in);
		System.out.print("Dia del mes (1-31): ");
		d= teclado.nextInt();
		System.out.print("Mes del año (1-12): ");
		m= teclado.nextInt();
		m=m - 1;
		System.out.print("Año: ");
		y=teclado.nextInt();
		System.out.print("Plazo (dias naturales): ");
		pdn= teclado.nextInt();
		data.set(Calendar.YEAR, y);
		data.set(Calendar.MONTH, m);
		data.set(Calendar.DAY_OF_MONTH, d);
		data.add(Calendar.DATE, pdn);
		
		String mm=  data.get(Calendar.MONTH)== 0 ? "Enero" :
			data.get(Calendar.MONTH)== 1 ? "Febrero" :
			data.get(Calendar.MONTH)== 2 ? "Marzo":
			data.get(Calendar.MONTH)== 3 ? "Abril":
			data.get(Calendar.MONTH)== 4 ? "Mayo":
			data.get(Calendar.MONTH)== 5 ? "Junio":
			data.get(Calendar.MONTH)== 6 ? "Julio":
			data.get(Calendar.MONTH)== 7 ? "Agosto":
			data.get(Calendar.MONTH)== 8 ? "Septiembre":
			data.get(Calendar.MONTH)== 9 ? "Octubre":
			data.get(Calendar.MONTH)== 10 ? "Noviembre":
			data.get(Calendar.MONTH)== 11 ? "Diciembre" : "" ;
			
		String ds= data.get(Calendar.DAY_OF_WEEK)== 1 ? "Domingo" :
			data.get(Calendar.DAY_OF_WEEK)== 2 ? "Lunes" :
			data.get(Calendar.DAY_OF_WEEK)== 3 ? "Martes" :
			data.get(Calendar.DAY_OF_WEEK)== 4 ? "Miercoles" :
			data.get(Calendar.DAY_OF_WEEK)== 5 ? "Jueves" :
			data.get(Calendar.DAY_OF_WEEK)== 6 ? "Viernes" :
			data.get(Calendar.DAY_OF_WEEK)== 7 ? "Sabado" : " ";
			
		System.out.println(" ");
		System.out.print("Debe entregarlo hasta el " + ds + " " + data.get(Calendar.DAY_OF_MONTH) + " de " + mm + " de " + data.get(Calendar.YEAR) );
		
		
	}
}