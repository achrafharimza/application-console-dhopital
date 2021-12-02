package com.hospital.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.hospital.enumerations.InsuranceType;
import com.hospital.interfaces.PatientInterface;
import com.hospital.models.Doctor;
import com.hospital.models.Hospital;
import com.hospital.models.Infermiere;
import com.hospital.models.Operation;
import com.hospital.models.Operation.InfoOperation;
import com.hospital.models.Patient;
import com.hospital.models.Person;
import com.hospital.models.Room;
import com.hospital.models.TimeSlot;








public class Main {
	static Scanner sc = new Scanner(System.in);
	static TimeSlot shift = new TimeSlot(9,18);
	public static List<Doctor> ListeDoctor  = loadData_docteur();
	public static List<Infermiere> Listeinfermier  = loadData_infermier();
	public static List<Room> listeroom = loadData_Room();
	public static List<Hospital> listehopital = loadData_Hospital();
	public static List<Patient> ListePatient = loadData_patient();
	
	public static List<Patient> loadData_patient() {
		Patient patient1 = new Patient("AAA","BBBB","CCC","DDDD",null, "AB7",InsuranceType.CNSS,700);
		
;
		
		List<Patient> ListePatient = new ArrayList<Patient>();
		ListePatient.add(patient1);
		
		
		return ListePatient;
	}
	
	
	public static List<Doctor> loadData_docteur() {
		Doctor docteur1 = new Doctor("ACHRAF","HARIMZA","0659899","SAFI MATAR MAROC","HH123",shift,10000);
		Doctor docteur2 = new Doctor("ACHRAF","LEO","0659899","SAFI MATAR MAROC","HH122",shift,10000);
		Doctor docteur3 = new Doctor("SAMIR","HARIMZA","0659899","SAFI MATAR MAROC","HH124",shift,10000);
		Doctor docteur4 = new Doctor("MESSI","leo","0659899","SAFI MATAR MAROC","HH143",shift,10000);
		
		List<Doctor> ListeDoctor = new ArrayList<Doctor>();
		ListeDoctor.add(docteur1);
		ListeDoctor.add(docteur2);
		ListeDoctor.add(docteur3);
		ListeDoctor.add(docteur4);
		
		return ListeDoctor;
	}
	
	private static List<Hospital> loadData_Hospital() {
		// TODO Auto-generated method stub
		return null;
	}

	public static List<Infermiere> loadData_infermier() {
		Infermiere infermier1 = new Infermiere("salim","benis","0659899","SAFI MATAR MAROC","HH123",shift,10000);
		Infermiere infermier2 = new Infermiere("salima","benis","0659899","SAFI MATAR MAROC","HH123",shift,10000);
		Infermiere infermier3 = new Infermiere("Amine","azert","0659899","SAFI MATAR MAROC","HH123",shift,10000);
		Infermiere infermier4 = new Infermiere("Amina","azer","0659899","SAFI MATAR MAROC","HH123",shift,10000);
		
		List<Infermiere> Listeinfermier = new ArrayList<Infermiere>();
		Listeinfermier.add(infermier1);
		Listeinfermier.add(infermier2);
		Listeinfermier.add(infermier3);
		Listeinfermier.add(infermier4);
		
		
		return Listeinfermier;
	}
	
	public static List<Room> loadData_Room(){
		Room room1= new Room(1,1);
		Room room2= new Room(2,1);
		Room room3= new Room(3,1);
		Room room4= new Room(4,1);
	
		
		List<Room> listeroom = new  ArrayList<Room>() ;
		
		listeroom.add(room1);
		listeroom.add(room2);
		listeroom.add(room3);
		listeroom.add(room4);
		
	
		
		return listeroom;
		
	}
	
	public static List<Hospital> listehopital() {
		Hospital hospital1 = new Hospital("Moamed V","Safi",ListeDoctor,listeroom);
		Hospital hospital3 = new Hospital("CHEIKH ZAÏD","casablanca",ListeDoctor,listeroom);
		Hospital hospital4 = new Hospital("AR RAZI","casablanca",ListeDoctor,listeroom);
		Hospital hospital2 = new Hospital("Ibn Tofail","Marrackech",ListeDoctor,listeroom);
		
		

		List<Hospital> listehopital = new ArrayList<Hospital>();
		listehopital.add(hospital1);
		listehopital.add(hospital2);
		listehopital.add(hospital3);
		listehopital.add(hospital4);
	

		return listehopital;

	}
	
	
	public static void menu() {
	
		int choix = 0;
		do {
		System.out.println("*********************************** ");
		System.out.println(" ------------Menu------------ ");
		System.out.println("1)-Choisir une operation");
		System.out.println("2)-s'inscrire ");
		System.out.println("3)-Ajouter/Consulter votre solde");
		System.out.println("4)-Afficher la liste des docteurs ");
		System.out.println("5)-Afficher la liste des hopitaux ");
		System.out.println("6)-Afficher la liste de room");
		System.out.println("0)-Quitter");
		System.out.println("*********************************** ");
		
		List<Hospital> listehopital = listehopital();
		
		
		Person persone = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Entrer votre choix ");
		choix = sc.nextInt();
		
		
		
			switch (choix) {
			case 1:
				System.out.println("Entrer  AffiliationNumber  :");
				String id = sc.next();
				 for (int i = 0; i < ListePatient.size(); i++) {
//				      System.out.println(ListePatient.get(i).getAffiliationNumber());
				      if(ListePatient.get(i).getAffiliationNumber().contains(id)) {
				    	  System.out.println("vous etes deja inscrit ");
				    	  System.out.println(ListePatient.get(i).toString());
				    	  int patientId=i ;
				    	  InsuranceType typeAS= ListePatient.get(i).getInsuranceType();
				    	  menuOPeration(typeAS ,patientId );
				    	  
				      }
				      else {
				    	  System.out.println("vous devez inscrire afin prendre un RV  :");
				      }
				    }
				
				break;
				
				
				
			case 2:
				System.out.println("Entrer  le nom de patient  :");
				String nom = sc.next();
				
				System.out.println("Entrer le  prénom de patient :");
				String prenom = sc.next();
				
				System.out.println("Entrer votre le telephone  de patient  :");
				String phone = sc.next();
				
				System.out.println("Entrer le  l'adresse de patient :");
				String adress = sc.next();
				
				System.out.println("Entrer affiliationNumber de patient :");
				String affiliationNumber = sc.next();
				
				System.out.println("Entrer InsuranceType de patient : CNSS-CNOPS-CNOPS");
				String InType = sc.next();
	
				
		
				
//				persone = new Person(nom, prenom,phone,adress);
//				ListePatient.add(new Patient("AAA","BBBB","CCC","DDDD",null, "AB8",InsuranceType.CNSS));
				ListePatient.add(new Patient(nom, prenom,phone,adress,null,affiliationNumber,InsuranceType.valueOf(InType),0));
				int inP = ListePatient.size()-1;
				 System.out.println("compte Patient bien crier :");
				      System.out.println(ListePatient.get(inP).toString());

						System.out.println("Voullez-vous ajouter de l'argent au compte ? Y/N");
						String Rajouter = sc.next();  
						
						if(Rajouter.equals("Y")) {
							System.out.println("Daccord entrez le montant que vous voullez ajouter");
							 
							double montantAjouter =sc.nextDouble();
							ListePatient.get(inP).setPortfeuille(montantAjouter);
							System.out.println(ListePatient.get(inP).toString());
						}
				   
				break;
				
			case 3:
				System.out.println("Entrer  AffiliationNumber  :");
				String ida = sc.next();
				 for (int i = 0; i < ListePatient.size(); i++) {
//				      System.out.println(ListePatient.get(i).getAffiliationNumber());
				      if(ListePatient.get(i).getAffiliationNumber().contains(ida)) {
				    	  System.out.println(ListePatient.get(i).toString());
				    	  System.out.println("Entrez le montant que vous voullez ajouter"); 
							double montantAjouter =sc.nextDouble();
							ListePatient.get(i).setPortfeuille(montantAjouter);
							System.out.println(ListePatient.get(i).toString());
				    	
				    	  
				      }
				      else {
				    	  System.out.println("Ce AffiliationNumber n'est pas existe :");
				      }
				    }
				
				
				
				
			break;
				
				
				
				
				
				
				
			case 4 : 
				 for (int i = 0; i < ListeDoctor.size(); i++) {
//					 System.out.println("********************************************************************** ");
//				      System.out.println("Firstname \t Lastname \t Phone \t  Address");

					 System.out.println(ListeDoctor.get(i).getFirstname()+" \t " + ListeDoctor.get(i).getLastname() + " \t" + ListeDoctor.get(i).getPhone() + " \t " + ListeDoctor.get(i).getAddress());
				    }
				
				break;
				
				
			case 5:
				 for (int i = 0; i < listehopital.size(); i++) {
				      System.out.println(listehopital.get(i).getName()+"-------"+listehopital.get(i).getCity());
				    }
				
				break;
				
				case 6:
					 for (int i = 0; i < listeroom.size(); i++) {
					      System.out.println(listeroom.get(i));
					    }
					
					break;
			}


		} while (choix != 0);
		 System.out.println("***********************------FIN--------***************************** ");

	}
	
	
	   
	public static void menuOPeration(InsuranceType typeAS , int patientId) {
		
		System.out.println("*********************************** ");
		System.out.println(" ------------Menu OF Operation ------------ ");
		for(int i=1; i <= InfoOperation.values().length ;i++ ) {
			System.out.println(i+"--"+InfoOperation.valueOf("OP"+i).getTitre()+"------"+InfoOperation.valueOf("OP"+i).getPrix()+" DH");
			
		}
		System.out.println("*********************************** ");
		System.out.println("Entrer votre choix");
		int opChoix = sc.nextInt();

		String typeASstng=typeAS.toString();
		InsuranceType.valueOf(typeASstng);
		double rembourse= InfoOperation.valueOf("OP"+opChoix).getPrix()*InsuranceType.valueOf(typeASstng).getRed();
		double montantTotal =InfoOperation.valueOf("OP"+opChoix).getPrix()-rembourse;
			System.out.println("le montant total : "+montantTotal+" DH       [apres reduction d'assurance ] ");
			System.out.println("votre solde :"+ListePatient.get(patientId).getPortfeuille());
			System.out.println("Vous voullez payez le montant ? Y/N");
			String Qpayer = sc.next();
			if(Qpayer.equals("Y")) {
				if(ListePatient.get(patientId).getPortfeuille()>= montantTotal) {
					
					ListePatient.get(patientId).payerPortfeuille(montantTotal);
					System.out.println("paiement est bien passé");
					
				}
				else {
					System.out.println("solde insuffisant");
				}
					
				System.out.println("votre solde :"+ListePatient.get(patientId).getPortfeuille());	
					
			}
	}
	
	

	
	public static void main(String args[])
	{
	
		 
		 
			menu();
		
		
		
		
		
		 
		
	}

}
