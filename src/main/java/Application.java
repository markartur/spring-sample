import com.pluralsight.service.CustomerServiceImpl;
import com.pluralsight.service.CustomerService;

public class Application {

	public static void main(String[] args) {
		
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstname());

	}

}
