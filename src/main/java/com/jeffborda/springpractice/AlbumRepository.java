package com.jeffborda.springpractice;

import org.springframework.data.repository.CrudRepository;

public interface AlbumRepository extends CrudRepository<Album,Long> {
}
