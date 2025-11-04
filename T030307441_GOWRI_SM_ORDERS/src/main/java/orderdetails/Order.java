package orderdetails;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders_details")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int order_id;
    private String customerName;
    private String product;
    private int quantity;

    // Generate getter and setter
    public int getorder_id() {
        return order_id;
    }

    public void setorder_id(int order_id) {
        this.order_id = order_id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Generate constructors
    public Order() {
        super();
    }

    public Order(String customerName, String product, int quantity, int order_id) {
        super();
        this.order_id=order_id;
        this.customerName = customerName;
        this.product = product;
        this.quantity = quantity;
    }

    // Generate toString()
    @Override
    public String toString() {
        return "Order [order_id=" + order_id + ", customerName=" + customerName + ", product=" + product + ", quantity=" + quantity + "]";
    }
}
