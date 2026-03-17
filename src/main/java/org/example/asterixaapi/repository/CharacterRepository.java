
package org.example.asterixaapi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.lang.Character;

public interface CharacterRepository extends MongoRepository<Character, String> {
}

