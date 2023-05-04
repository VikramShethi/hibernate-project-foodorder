package Food_Order_DTO;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class FoodOrder {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String items;
    private double cost;
    @CreationTimestamp
    private LocalDateTime oderedTime;
    @UpdateTimestamp
    private LocalDateTime delTime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItems() {
		return items;
	}
	public void setItems(String items) {
		this.items = items;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public LocalDateTime getOderedTime() {
		return oderedTime;
	}
	public void setOderedTime(LocalDateTime oderedTime) {
		this.oderedTime = oderedTime;
	}
	public LocalDateTime getDelTime() {
		return delTime;
	}
	public void setDelTime(LocalDateTime delTime) {
		this.delTime = delTime;
	}
}
