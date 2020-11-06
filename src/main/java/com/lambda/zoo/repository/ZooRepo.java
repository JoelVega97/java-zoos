package com.lambda.zoo.repository;

import com.lambda.zoo.models.Zoo;
import org.springframework.data.repository.CrudRepository;

public interface ZooRepo extends CrudRepository<Zoo, Long> {
}
