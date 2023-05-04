package Food_Order_Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Food_Order_DTO.FoodOrder;

public class SaveOrder {
    public static void main(String[] args) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction= manager.getTransaction();
		FoodOrder order= new FoodOrder();
		order.setItems("HUNTER");
		order.setCost(160);
		manager.persist(order);
		transaction.begin();
		transaction.commit();
		
	}
}
