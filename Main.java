package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //camelCase
		//Don't repeat yourself kendini tekrar etme...
		
		String internetSubeButonu = "�nternet �ubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar d��t� resmi");
		}else if (dolarBugun>dolarDun) {	
			System.out.println("Dolar y�kseldi resmi");
		}
		else {
			System.out.println("Dolar e�ittir resmi");
		}

		String kredi1 = "H�zl� Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "�ift�i Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";
		String kredi7 = "K�lt�r Bakanl��� Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		
		String[] krediler = 
			{
				"H�zl� Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"�ift�i Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"K�lt�r Bakanl��� Kredisi"
				};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++) {
			//saya� g�d�ml� d�ng� i=0 start, i<Krediler �art 
			//i kredilerin say�s�ndan k���k oldu�u s�rece �al��s�n, i++ demek 1 artt�r
			System.out.println(krediler[i]); // [0]s�rekli �al��aca�� i�in 7 defa yazar
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2; //de�er atamas� yap�l�r ve ba�lant� kopar
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 =	"Ankara";
		String sehir2 =	"�stanbul"; //temel tip
		sehir1 = sehir2; //istisnai bir durum de�er tipi gibi 
		sehir2 = "�zmir"; //referans tip char olarak tutukur ['A','N'] gibi
				System.out.println(sehir1);
	}

}
