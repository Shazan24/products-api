package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // tells Spring:This class contains REST API endpoints.
// Without it, Spring won't treat this class as a REST controller.
@RequestMapping("/products")    // This gives the controller a base URL.

public class ProductController {
    @GetMapping("{id}") // tells Spring:This method should respond to an HTTP GET request.
    // This means: When someone sends a GET request to /products/{id}, execute the method below.
    // /products/50

    public Product getById(@PathVariable Long id){
        // means: Take the {id} from the URL and put it into the Java variable id.
        //Your method returns:Product
        //NOT: String
        //Spring Boot uses Jackson to convert the Java object into JSON.
        //So:Product
        //becomes:{
        //  "id": 1,
        //  "name": "Laptop",
        //  "price": 999.99
        //}

        return new Product(id, "Laptop", 999.99);
    }
}
