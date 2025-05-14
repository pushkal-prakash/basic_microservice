package com.ecomm.Inventory_service.repo;

import com.ecomm.Inventory_service.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, String> {
}