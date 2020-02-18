package sw2.clase11ej1servidorrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sw2.clase11ej1servidorrest.repository.ProductRepository;

@RestController
public class ProductWebService {

    @Autowired
    ProductRepository productRepository;

    @GetMapping(value = "/product",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity listarProductos(){
        return new ResponseEntity(productRepository.findAll(), HttpStatus.OK);
    }
}

