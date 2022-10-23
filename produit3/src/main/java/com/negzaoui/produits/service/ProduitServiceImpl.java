package com.negzaoui.produits.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.negzaoui.produits.entities.Produits;
import com.negzaoui.produits.repos.ProduitRepository;

@Service
public class ProduitServiceImpl implements ProduitService {
@Autowired ProduitRepository produitRepository;
@Override
public Produits saveProduit(Produits p) {
return produitRepository.save(p);
}
@Override
public Produits updateProduit(Produits p) { return produitRepository.save(p);
}
@Override
public void deleteProduit(Produits p) { produitRepository.delete(p);
}
@Override
public void deleteProduitById(Long id) {
produitRepository.deleteById(id);
}
@Override
public Produits getProduit(Long id) { return produitRepository.findById(id).get();
}
@Override
public List<Produits> getAllProduits() { return produitRepository.findAll();
}

}