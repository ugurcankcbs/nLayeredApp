package nLayereredApp.nLayeredApp.api;



import nLayereredApp.nLayeredApp.business.concretes.CorporateCustomerManager;
import nLayereredApp.nLayeredApp.business.concretes.IndividualCustomerManager;
import nLayereredApp.nLayeredApp.dataaccess.concretes.HibernateCorporateCustomerDao;
import nLayereredApp.nLayeredApp.dataaccess.concretes.HibernateIndividiualCustomerDao;
import nLayereredApp.nLayeredApp.dataaccess.concretes.JdbcCorporateCustomerDao;
import nLayereredApp.nLayeredApp.dataaccess.concretes.JdbcIndiviudalCustomerDao;
import nLayereredApp.nLayeredApp.entities.concretes.CorporateCustomer;
import nLayereredApp.nLayeredApp.entities.concretes.IndividualCustomer;

public class Main {

    public static void main(String[] args) {

        IndividualCustomer customer1 = new IndividualCustomer(1,"123","Uğur","Kocabaş","246813579");
        IndividualCustomer customer2 = new IndividualCustomer(2,"1234","Can","Kocabaş","135792468");
        IndividualCustomer customer3 = new IndividualCustomer(3,"12345","Behzat","Ç","975318642");


        IndividualCustomerManager individualCustomerManager = new IndividualCustomerManager(new JdbcIndiviudalCustomerDao());
        individualCustomerManager.add(customer1);
        individualCustomerManager = new IndividualCustomerManager(new HibernateIndividiualCustomerDao());
        individualCustomerManager.add(customer1);

        CorporateCustomer customer4 = new CorporateCustomer(1,"FİRMA","DENEME","BAŞİARILI");

        CorporateCustomerManager corporateCustomerManager = new CorporateCustomerManager(new HibernateCorporateCustomerDao());
        corporateCustomerManager.update(customer4);
        corporateCustomerManager = new CorporateCustomerManager(new JdbcCorporateCustomerDao());
        corporateCustomerManager.update(customer4);



//		for (IndividualCustomer customer: individualCustomerManager.getAll()) {
//			System.out.println(customer.getFirstName()+ customer.getId());
//		}

    }

}
