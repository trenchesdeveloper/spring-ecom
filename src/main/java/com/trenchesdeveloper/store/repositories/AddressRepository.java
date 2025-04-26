package com.trenchesdeveloper.store.repositories;

import com.trenchesdeveloper.store.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Long> {
}
