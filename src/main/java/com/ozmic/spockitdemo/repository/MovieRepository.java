package com.ozmic.spockitdemo.repository;

import com.ozmic.spockitdemo.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface MovieRepository extends CrudRepository<Movie, Long> {
}
