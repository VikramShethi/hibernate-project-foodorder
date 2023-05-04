package Food_Order_Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import Food_Order_DTO.FoodOrder;

public class UpdateOrder {
  public static void main(String[] args) {
	EntityManagerFactory factory= Persistence.createEntityManagerFactory("dev");
	EntityManager manager= factory.createEntityManager();
	EntityTransaction transaction= manager.getTransaction();
	FoodOrder order= manager.find(FoodOrder.class, 1);
	order.setCost(169);
	order.setItems("BIRABOOM");
	transaction.begin();
	transaction.commit();
}
}
