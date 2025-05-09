package org.example.backendproject;


import org.example.backendproject.Entity.Client;
import org.example.backendproject.ResponseRequest.*;
import org.example.backendproject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(maxAge = 3600)
@RestController
public class EchoController {
    @Autowired
    ClientRepository repositoryClient;
    @Autowired
    ProductRepository repositoryProduct;

    @PostMapping("/client/login")
    public ResponseEntity<?> loginAdmin(@RequestBody LoginRequestClient loginRequest) {
        var client = repositoryClient.searchByLogin(loginRequest.getEmail(), loginRequest.getPassword());
        if (client.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new LoginResponse("Incorrecto nombre o contraseña"));
        } else {
            return ResponseEntity.status(200).body(client.get());
        }
    }
    @PostMapping("/client/register")
    public ResponseEntity<?> loginRegister(@RequestBody Client client) {
        var c = repositoryClient.searchByEmail(client.getEmail());
        if(c.isPresent()){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(new RegisterResponse("Ya existe un usuario con ese correo"));
        } else{
            repositoryClient.save(client);
            return ResponseEntity.status(200).body(new RegisterResponse("Se ha añadido un cliente"));
        }
    }
    @GetMapping("/client/getProducts")
    public ResponseEntity<?> listDoctorPage() {
        var products = repositoryProduct.findAll();
        return ResponseEntity.status(200).body(products);
    }
}



