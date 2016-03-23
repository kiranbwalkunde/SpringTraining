package creators;

import java.util.Map;
import java.util.Properties;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import pojos.Battery;
import pojos.Disc;
import pojos.Product;

/**
 * To test static factory Method. 
 * 
 * @author kiran. Created on 11/03/2016.
 */
public class ProductCreator implements InitializingBean, DisposableBean{
    
    @Value("#{System.properties}")
    private Properties systemProperties;
    
    @Value("#{systemProperties['user.region']}")
    private String userRegion;
    
    private Map<String, Product> products;
    public static final Product AAA = new Battery("Lenovo", 1200);
    public static final Product CDRW = new Disc("Sony",20);

    public String getUserRegion() {
        return userRegion;
    }
    
    
    
    public Product createProduct(String productId){
        Product product = products.get(productId);
        if(product != null){
            return product;
        }
        throw new IllegalArgumentException("Illegal Argument Exception :"+productId);
    }

    public Map<String, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<String, Product> products) {
        this.products = products;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("The Properties has been set...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("The destroy method has been called...");
    }
    
}
