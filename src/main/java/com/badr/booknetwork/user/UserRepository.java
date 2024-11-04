package com.badr.booknetwork.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    // La méthode retourne un Optional<User>, ce qui permet de gérer les cas où aucun utilisateur
    // ne correspond à l'email spécifié, sans avoir besoin de vérifier pour null.
    Optional<User> findByEmail(String email);
}
