package OnlineStore.Services;

import java.util.List;

import OnlineStore.Enteties.Product;

public interface ProductManagementService {
	
	List<Product> getProducts();

	Product getProductById(int productIdToAddToCart);

}
