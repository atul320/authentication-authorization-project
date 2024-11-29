package com.journal.journal.repository;

import com.journal.journal.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
