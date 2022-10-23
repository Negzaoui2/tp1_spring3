package com.negzaoui.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.negzaoui.produits.entities.Produits;

public interface ProduitRepository extends JpaRepository<Produits, Long> {

}
