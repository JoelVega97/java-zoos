package com.lambda.zoo.repository;

import com.lambda.zoo.models.Zooanmials;
import org.springframework.data.repository.CrudRepository;

public interface ZooAnimalsRepository extends CrudRepository<Zooanmials, Long> {
}
