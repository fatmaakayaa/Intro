package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //camelCase
		//Don't repeat yourself kendini tekrar etme...
		
		String internetSubeButonu = "Ýnternet Þubesi";
		double dolarDun = 8.20;
		double dolarBugun = 8.20;
		int vade = 36;
		boolean dustuMu = false;
		
		System.out.println(internetSubeButonu);
		
		if(dolarBugun<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}else if (dolarBugun>dolarDun) {	
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}

		String kredi1 = "Hýzlý Kredi";
		String kredi2 = "Mutlu Emekli Kredisi";
		String kredi3 = "Konut Kredisi";
		String kredi4 = "Çiftçi Kredisi";
		String kredi5 = "MSB Kredisi";
		String kredi6 = "MEB Kredisi";
		String kredi7 = "Kültür Bakanlýðý Kredisi";
		
		System.out.println(kredi1);
		System.out.println(kredi2);
		System.out.println(kredi3);
		System.out.println(kredi4);
		System.out.println(kredi5);
		System.out.println(kredi6);
		System.out.println(kredi7);
		
		
		String[] krediler = 
			{
				"Hýzlý Kredi",
				"Mutlu Emekli Kredisi",
				"Konut Kredisi",
				"Çiftçi Kredisi",
				"MSB Kredisi",
				"MEB Kredisi",
				"Kültür Bakanlýðý Kredisi"
				};
		
		//foreach
		for(String kredi : krediler) {
			System.out.println(kredi);
		}
		
		for(int i = 0; i<krediler.length;i++) {
			//sayaç güdümlü döngü i=0 start, i<Krediler þart 
			//i kredilerin sayýsýndan küçük olduðu sürece çalýþsýn, i++ demek 1 arttýr
			System.out.println(krediler[i]); // [0]sürekli çalýþacaðý için 7 defa yazar
		}
		
		int sayi1 = 10;
		int sayi2 = 20;
		sayi1 = sayi2; //deðer atamasý yapýlýr ve baðlantý kopar
		sayi2 = 100;
		System.out.println(sayi1);
		
		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1 = sayilar2;
		sayilar2[0] = 100;
		System.out.println(sayilar1[0]);
		
		String sehir1 =	"Ankara";
		String sehir2 =	"Ýstanbul"; //temel tip
		sehir1 = sehir2; //istisnai bir durum deðer tipi gibi 
		sehir2 = "Ýzmir"; //referans tip char olarak tutukur ['A','N'] gibi
				System.out.println(sehir1);
	}

}
