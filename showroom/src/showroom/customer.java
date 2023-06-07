package showroom;

import java.util.Scanner;

public class customer {

	String name;
	double price;
	String colore;
	String engincc;
	String Mileage;
	String Fuel;
	String Transmission;
	String Safety;
	String Seating;

	customer(String name, String colore, double price, String engincc, String Mileage, String Fuel, String Transmission,
			String Safety, String Seating) {
		this.name = name;
		this.colore = colore;
		this.price = price;
		this.engincc = engincc;
		this.Mileage = Mileage;
		this.Fuel = Fuel;
		this.Transmission = Transmission;
		this.Safety = Safety;
		this.Seating = Seating;

	}

	public static void main(String[] args) {
		cars();
		
	}

	static {
		System.out.println("===welcome to my shoroom====");
		System.out.println();
		System.out.println("-----CarDekho-----");

	}

	public static void cars() {
//	customer  h1=new customer("hondaCity", "red",11.5, "1498cc", "17.8 to 18.4 kmpl", "Petrol", "Manual & Automatic", "5 Star (ASEAN NCAP)"," 5 siter");

		Scanner sc = new Scanner(System.in);
		System.out.println("##enter num  which   Brand vehicle  u want  presss the button##");
		System.out.println("** entar 1 for  honda  **");
		System.out.println("** entar 2 for  maruti **");
		System.out.println("** entar 3 for  TATA   **");
		System.out.println("** entar 4 for  MG     **");
		int carss = sc.nextInt();
		switch (carss) {

		// Case
		case 1:
	hondaDtails(carss);
			break;

		// Case
		case 2:
			marutiDtails(carss);
		
			break;

		// Case
		case 3:
			System.out.println("hi 3");
		TATADtails(carss);
			
			break;

		// Case
		case 4:
			MGDtails(carss);
			break;
		// Default case
		default:
			System.out.println("******enter the vaild key*****");
			System.out.println("----- we are rtruning to main menu ----");
			for (int i = 1; i <= 5; i++) {
				System.out.println("  " + i + "  ");
				try {
					Thread.sleep(1000); // Sleep for 1 second
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				}
				cars();

				break;

		}
	}


	public static void hondaDtails(int n) {
		customer h1 = new customer("hondaCity", "red", 11.5, "1498cc", "17.8 to 18.4 kmpl", "Petrol",
				"Manual & Automatic", "5 Star (ASEAN NCAP)", " 5 siter");
		customer h2 = new customer("Honda Amaz", "black", 6.99, "1198cc", "18.8 to 18.3 kmpl", "Petrol",
				"Manual & Automatic", "5 Star (ASEAN NCAP)", " 5 siter");
		customer h3 = new customer("Honda Compact SUV ", "black", 14, "1198cc", "18.8 to 18.3 kmpl", "Diesel",
				"Manual & Automatic", "5 Star (ASEAN NCAP)", " 5 siter");
		customer h4 = new customer("Honda WR", "black", 9, "1198cc", "18.8 to 18.3 kmpl", "Diesel+cng",
				"Manual & Automatic", "5 Star (ASEAN NCAP)", " 5 siter");

	
		switch (n) {

		case 1:
			System.out.println("--------car specification-----------");

			System.out.println(" HONDA is  a great choise  ");
			System.out.println();
			System.out.println("press 1 for New Honda City-5th Gen  Rs - 11.59 Lakhs* onwards ");
			System.out.println();
			System.out.println("press 2 for Honda Amaze Rs- 6.99 Lakh* onwards");
			System.out.println();
			System.out.println("press 3 for Honda Compact SUV Rs- 11 Lakh* onwards");
			System.out.println();
			System.out.println("press 4 for Honda WR  Rs- 8 Lakh*onwards");
			Scanner c = new Scanner(System.in);
			int honda = c.nextInt();
			switch (honda) {

			case 1:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h1.name);
				System.out.println("COLORE       >>" + h1.colore);
				System.out.println("price        >>" + h1.price);
				System.out.println("engincc      >>" + h1.engincc);
				System.out.println("Mileage      >>" + h1.Mileage);
				System.out.println("Fuel         >>" + h1.Fuel);
				System.out.println("Transmission >>" + h1.Transmission);
				System.out.println("Safety       >>" + h1.Safety);
				System.out.println("Seating      >>" + h1.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int a = c.nextInt();
				switch (a) {
				case 1:
					payment();
					//payment();
					break;

				case 2:
					cars();
					break;

//match the value of week
				case 3:
					hondaDtails(n);
					break;

				}

				break;

			case 2:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h2.name);
				System.out.println("COLORE       >>" + h2.colore);
				System.out.println("price        >>" + h2.price);
				System.out.println("engincc      >>" + h2.engincc);
				System.out.println("Mileage      >>" + h2.Mileage);
				System.out.println("Fuel         >>" + h2.Fuel);
				System.out.println("Transmission >>" + h2.Transmission);
				System.out.println("Safety       >>" + h2.Safety);
				System.out.println("Seating      >>" + h2.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int b = c.nextInt();
				switch (b) {
				case 1:
					payment();
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					hondaDtails(n);
					break;

				}

				break;

			// match the value of week
			case 3:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h3.name);
				System.out.println("COLORE       >>" + h3.colore);
				System.out.println("price        >>" + h3.price);
				System.out.println("engincc      >>" + h3.engincc);
				System.out.println("Mileage      >>" + h3.Mileage);
				System.out.println("Fuel         >>" + h3.Fuel);
				System.out.println("Transmission >>" + h3.Transmission);
				System.out.println("Safety       >>" + h3.Safety);
				System.out.println("Seating      >>" + h3.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int d = c.nextInt();
				switch (d) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					hondaDtails(n);
					break;

				}

				break;

			case 4:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h4.name);
				System.out.println("COLORE       >>" + h4.colore);
				System.out.println("price        >>" + h4.price);
				System.out.println("engincc      >>" + h4.engincc);
				System.out.println("Mileage      >>" + h4.Mileage);
				System.out.println("Fuel         >>" + h4.Fuel);
				System.out.println("Transmission >>" + h4.Transmission);
				System.out.println("Safety       >>" + h4.Safety);
				System.out.println("Seating      >>" + h4.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int f = c.nextInt();
				switch (f) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					hondaDtails(n);
					break;

				}

			default:

				System.out.println("******enter the vaild key*****");
				System.out.println("----- we are rtruning to main menu ----");
				for (int i = 1; i <= 4; i++) {
					System.out.println("  " + i + "  ");
					try {
						Thread.sleep(1000); // Sleep for 1 second
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				cars();
			}
			break;
		}
	}


	public static void marutiDtails(int n) {
		customer h5 = new customer("Maruti Swift", "red", 5.99, "1197cc", "17.8 to 18.4 kmpl", "Petrol&CNG",
				"Manual & Automatic", "2 Star (ASEAN NCAP)", " 5 seater");
		customer h6 = new customer("Maruti Wagon R ", "mat red", 5.555, "998 to 1197 cc", "18.8 to 18.3 kmpl", "Petrol",
				"Manual & Automatic", "1 Star (ASEAN NCAP)", " 5 seater");
		customer h7 = new customer("Maruti Brezza", "red+black ", 14.14, "1462cc", "18.8 to 18.3 kmpl", "petrol+Cng",
				"Manual & Automatic", "3 Star (ASEAN NCAP)", " 5 seater");
		customer h8 = new customer("Maruti Jimny", "yellow", 9, "1162cc", "8.8 to 12.3 kmpl", "petrol+cng",
				"Manual & Automatic", "3 Star (ASEAN NCAP)", " 4 seater");
int k=1;
		
		switch (k) {

		case 1:
			System.out.println("--------car specification-----------");

			System.out.println(" MARUTI is  a great choise  ");
			System.out.println();
			System.out.println("press 1 for maruti swift   Rs - 5.9 Lakhs* onwards ");
			System.out.println();
			System.out.println("press 2 for  maruti Wagon R  Rs. 5.55 - 8.50 Lakh* onwards");
			System.out.println();
			System.out.println("press 3 for Maruti Brezza Rs- 8.29 Lakh* onwards");
			System.out.println();
			System.out.println("press 4 for Maruti Jimny  Rs- 9.00-11.00 Lakh*onwards");
			Scanner c1= new Scanner(System.in);
			int m = c1.nextInt();
			switch (m) {

			case 1:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h5.name);
				System.out.println("COLORE       >>" + h5.colore);
				System.out.println("price        >>" + h5.price);
				System.out.println("engincc      >>" + h5.engincc);
				System.out.println("Mileage      >>" + h5.Mileage);
				System.out.println("Fuel         >>" + h5.Fuel);
				System.out.println("Transmission >>" + h5.Transmission);
				System.out.println("Safety       >>" + h5.Safety);
				System.out.println("Seating      >>" + h5.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int a = c1.nextInt();
				switch (a) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

//match the value of week
				case 3:
					marutiDtails(n);
					break;
				}

				break;

			case 2:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h6.name);
				System.out.println("COLORE       >>" + h6.colore);
				System.out.println("price        >>" + h6.price);
				System.out.println("engincc      >>" + h6.engincc);
				System.out.println("Mileage      >>" + h6.Mileage);
				System.out.println("Fuel         >>" + h6.Fuel);
				System.out.println("Transmission >>" + h6.Transmission);
				System.out.println("Safety       >>" + h6.Safety);
				System.out.println("Seating      >>" + h6.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int b = c1.nextInt();
				switch (b) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					marutiDtails(n);
					break;

				}

				break;

			// match the value of week
			case 3:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h7.name);
				System.out.println("COLORE       >>" + h7.colore);
				System.out.println("price        >>" + h7.price);
				System.out.println("engincc      >>" + h7.engincc);
				System.out.println("Mileage      >>" + h7.Mileage);
				System.out.println("Fuel         >>" + h7.Fuel);
				System.out.println("Transmission >>" + h7.Transmission);
				System.out.println("Safety       >>" + h7.Safety);
				System.out.println("Seating      >>" + h7.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int d = c1.nextInt();
				switch (d) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					marutiDtails(n);
					break;

				}

				break;

			case 4:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h8.name);
				System.out.println("COLORE       >>" + h8.colore);
				System.out.println("price        >>" + h8.price);
				System.out.println("engincc      >>" + h8.engincc);
				System.out.println("Mileage      >>" + h8.Mileage);
				System.out.println("Fuel         >>" + h8.Fuel);
				System.out.println("Transmission >>" + h8.Transmission);
				System.out.println("Safety       >>" + h8.Safety);
				System.out.println("Seating      >>" + h8.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int f = c1.nextInt();
				switch (f) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					marutiDtails(n);
					break;

				}

			}
			break;
		}
	}

	public static void TATADtails(int n) {
		customer h1 = new customer("Tata Nexon", "red", 7.59, "1199 to 1498cc", "17.8 to 24.4 kmpl", "Petrol, Diesel & CNG",
				"Manual & Automatic", "5 Star (Global NCAP)", " 5 siter");
		customer h2 = new customer("Tata Altroz", "black", 6.44, "1198cc to 1497 cc", "19.8 to 23.3 kmpl", "Petrol, Diesel & CNG",
				"Manual & Automatic", "5 Star (Global NCAP)", " 5 siter");
		customer h3 = new customer("Tata Harrier ", "blue ", 15, "1956cc", "14.8 to 16.3 kmpl", "Diesel",
				"Manual & Automatic", "5 Star (Global NCAP)", " 5 siter");
		customer h4 = new customer("Tata Punch", "blue", 9.47, "1199cc", "18.8 to 20.9 kmpl", "pertol+cng",
				"Manual & Automatic", "5 Star (Global NCAP)", " 5 siter");

	int g=1;
		switch (g) {

		case 1:
			System.out.println("--------car specification-----------");

			System.out.println(" TATA is  a great choise  ");
			System.out.println();
			System.out.println("press 1 for Tata Nexon Rs. 7.79 - 14.35 Lakh* onwards ");
			System.out.println();
			System.out.println("press 2 for Tata Altroz Rs- 6.44 Lakh* onwards");
			System.out.println();
			System.out.println("press 3 for Tata Harrier Rs. 15.00 - 24.07 Lakh onwards");
			System.out.println();
			System.out.println("press 4 for Tata Punch Rs. 6.00 - 9.47 Lakh onwards");
			Scanner c = new Scanner(System.in);
			int honda = c.nextInt();
			switch (honda) {

			case 1:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h1.name);
				System.out.println("COLORE       >>" + h1.colore);
				System.out.println("price        >>" + h1.price);
				System.out.println("engincc      >>" + h1.engincc);
				System.out.println("Mileage      >>" + h1.Mileage);
				System.out.println("Fuel         >>" + h1.Fuel);
				System.out.println("Transmission >>" + h1.Transmission);
				System.out.println("Safety       >>" + h1.Safety);
				System.out.println("Seating      >>" + h1.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int a = c.nextInt();
				switch (a) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

//match the value of week
				case 3:
					TATADtails(n);
					break;

				}

				break;

			case 2:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h2.name);
				System.out.println("COLORE       >>" + h2.colore);
				System.out.println("price        >>" + h2.price);
				System.out.println("engincc      >>" + h2.engincc);
				System.out.println("Mileage      >>" + h2.Mileage);
				System.out.println("Fuel         >>" + h2.Fuel);
				System.out.println("Transmission >>" + h2.Transmission);
				System.out.println("Safety       >>" + h2.Safety);
				System.out.println("Seating      >>" + h2.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int b = c.nextInt();
				switch (b) {
				case 1:
					payment();					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					TATADtails(n);
					break;

				}

				break;

			// match the value of week
			case 3:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h3.name);
				System.out.println("COLORE       >>" + h3.colore);
				System.out.println("price        >>" + h3.price);
				System.out.println("engincc      >>" + h3.engincc);
				System.out.println("Mileage      >>" + h3.Mileage);
				System.out.println("Fuel         >>" + h3.Fuel);
				System.out.println("Transmission >>" + h3.Transmission);
				System.out.println("Safety       >>" + h3.Safety);
				System.out.println("Seating      >>" + h3.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int d = c.nextInt();
				switch (d) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					TATADtails(n);
					break;

				}

				break;

			case 4:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h4.name);
				System.out.println("COLORE       >>" + h4.colore);
				System.out.println("price        >>" + h4.price);
				System.out.println("engincc      >>" + h4.engincc);
				System.out.println("Mileage      >>" + h4.Mileage);
				System.out.println("Fuel         >>" + h4.Fuel);
				System.out.println("Transmission >>" + h4.Transmission);
				System.out.println("Safety       >>" + h4.Safety);
				System.out.println("Seating      >>" + h4.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int f = c.nextInt();
				switch (f) {
				case 1:
					payment();
					
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					TATADtails(n);
					break;

				}

			default:

				System.out.println("******enter the vaild key*****");
				System.out.println("----- we are rtruning to main menu ----");
				for (int i = 1; i <= 4; i++) {
					System.out.println("  " + i + "  ");
					try {
						Thread.sleep(1000); // Sleep for 1 second
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				cars();
			}
			break;
		}
	}



	public static void MGDtails(int n) {
		customer h1 = new customer("MG Hector", "red", 14.73, "1451 to 1956 cc", "17.8 to 24.4 kmpl", "Petrol & Diesel",
				"Manual & Automatic", "2 Star (Global NCAP)", " 5 siter");
		customer h2 = new customer("MG Astor", "green", 10.52, "1349 to 1498 cc", "14.8 to 23.3 kmpl", "Petrol",
				"Manual & Automatic", "3 Star (Global NCAP)", " 5 siter");
		customer h3 = new customer("MG Hector Plus ", "blue ", 17.50, "1451 to 1956 cc", "14.8 to 16.3 kmpl", " petrol&Diesel",
				"Manual & Automatic", "5 Star (Global NCAP)", " 5 siter");
		customer h4 = new customer("MG 5 Estate", "blue", 50, "1998", "300kmpc", "Electric",
				"Manual & Automatic", "5 Star (Global NCAP)", " 5 siter");

	int j=1;
		switch (j) {

		case 1:
			System.out.println("--------car specification-----------");

			System.out.println(" MG is  a great choise  ");
			System.out.println();
			System.out.println("press 1 for MG Hector Rs. 14.73 - 22.09 Lakh* onwards ");
			System.out.println();
			System.out.println("press 2 for MG Astor Rs- 10.52 Lakh* onwards");
			System.out.println();
			System.out.println("press 3 for MG Hector Plus Rs. 17.00 - 22.07 Lakh onwards");
			System.out.println();
			System.out.println("press 4 for MG 5 Estate Rs. 50.00 - 60.00 Lakh onwards");
			Scanner c = new Scanner(System.in);
			int mg = c.nextInt();
			switch (mg) {

			case 1:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h1.name);
				System.out.println("COLORE       >>" + h1.colore);
				System.out.println("price        >>" + h1.price);
				System.out.println("engincc      >>" + h1.engincc);
				System.out.println("Mileage      >>" + h1.Mileage);
				System.out.println("Fuel         >>" + h1.Fuel);
				System.out.println("Transmission >>" + h1.Transmission);
				System.out.println("Safety       >>" + h1.Safety);
				System.out.println("Seating      >>" + h1.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int a = c.nextInt();
				switch (a) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

//match the value of week
				case 3:
					MGDtails(n);
					break;

				}

				break;

			case 2:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h2.name);
				System.out.println("COLORE       >>" + h2.colore);
				System.out.println("price        >>" + h2.price);
				System.out.println("engincc      >>" + h2.engincc);
				System.out.println("Mileage      >>" + h2.Mileage);
				System.out.println("Fuel         >>" + h2.Fuel);
				System.out.println("Transmission >>" + h2.Transmission);
				System.out.println("Safety       >>" + h2.Safety);
				System.out.println("Seating      >>" + h2.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int b = c.nextInt();
				switch (b) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					MGDtails(n);
					break;

				}

				break;

			// match the value of week
			case 3:
				System.out.println("--------car specification-----------");

				System.out.println("NAME         >>" + h3.name);
				System.out.println("COLORE       >>" + h3.colore);
				System.out.println("price        >>" + h3.price);
				System.out.println("engincc      >>" + h3.engincc);
				System.out.println("Mileage      >>" + h3.Mileage);
				System.out.println("Fuel         >>" + h3.Fuel);
				System.out.println("Transmission >>" + h3.Transmission);
				System.out.println("Safety       >>" + h3.Safety);
				System.out.println("Seating      >>" + h3.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int d = c.nextInt();
				switch (d) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					MGDtails(n);
					break;

				}

				break;

			case 4:
System.out.println("--------cSar specification-----------");
				System.out.println("NAME         >>" + h4.name);
				System.out.println("COLORE       >>" + h4.colore);
				System.out.println("price        >>" + h4.price);
				System.out.println("engincc      >>" + h4.engincc);
				System.out.println("Mileage      >>" + h4.Mileage);
				System.out.println("Fuel         >>" + h4.Fuel);
				System.out.println("Transmission >>" + h4.Transmission);
				System.out.println("Safety       >>" + h4.Safety);
				System.out.println("Seating      >>" + h4.Seating);
				System.out.println();
				System.out.println("IF WANT TO BUYE PLZ PRESS >> 1");
				System.out.println("IF U WANT TO GO CAR MANEU PRESS >> 2");
				System.out.println("IF U WANT TO GO BRAND MENU PRESS >> 3");
				int f = c.nextInt();
				switch (f) {
				case 1:
					payment();
					break;

				case 2:
					cars();
					break;

				// match the value of week
				case 3:
					MGDtails(n);
					break;

				}

			default:

				System.out.println("******enter the vaild key*****");
				System.out.println("----- we are rtruning to main menu ----");
				for (int i = 1; i <= 4; i++) {
					System.out.println("  " + i + "  ");
					try {
						Thread.sleep(1000); // Sleep for 1 second
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				cars();
			}
			break;
		}
	}
	    public static void payment() {
	        Scanner input = new Scanner(System.in);
	        
	        // Get user input for car details
	        System.out.println("Enter car model: ");
	        String model = input.nextLine();
	        System.out.println("Enter car year: ");
	        int year = input.nextInt();
	        input.nextLine(); // consume remaining newline character
	        
	        // Get user input for payment details
	        System.out.println("Enter price of car: ");
	        double price = input.nextDouble();
	        System.out.println("Enter tax rate (%): ");
	        double taxRate = input.nextDouble();
	        System.out.println("Enter down payment: ");
	        double downPayment = input.nextDouble();
	        System.out.println("Enter term of loan (in months): ");
	        int loanTerm = input.nextInt();
	        
	        // Calculate payment details
	        int taxAmount = (int) (price * taxRate / 100);
	        int loanAmount = (int) (price + taxAmount - downPayment);
	         int monthlyPayment = loanAmount / loanTerm;
	        
	        // Display receipt
	        System.out.println("\n\nCAR RECEIPT");
	        System.out.println("------------------------------------------------------");
	        System.out.println("| Model:                      " + model+"              ");
	        System.out.println("| Year:                        " + year+"                ");
	        System.out.println("| Price:                      $" + price+"                 ");
	        System.out.println("| Tax rate:                    "+ taxRate +"%"+"            ");
	        System.out.println("| Tax amount:                 $"+ taxAmount+"          ");
	        System.out.println("| Down payment:             $ "+ downPayment+"                  ");
	        System.out.println("| laonAmount:                $" +loanAmount+"                    ");
	        System.out.println("| Loan term:                 "+ loanTerm + "months              ");
	        System.out.println("| Monthly payment:        $"  + monthlyPayment+"          ");
	        System.out.println("---------      THANQ FOR JOIN OUR FAMILY   -------------");
	    }
	


}
