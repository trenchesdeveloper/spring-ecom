package com.trenchesdeveloper.store.repositories;

import com.trenchesdeveloper.store.entities.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Byte> {
}
