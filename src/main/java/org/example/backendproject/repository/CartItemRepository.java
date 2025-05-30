package org.example.backendproject.repository;
import org.example.backendproject.Entity.CartItem;
import org.example.backendproject.Entity.Client;
import org.example.backendproject.Entity.ShoppingCart;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
public interface CartItemRepository extends CrudRepository<CartItem, Long> {
}
