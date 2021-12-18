package com.ituwei.crud.repo;

import com.ituwei.crud.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface NoteRepo extends JpaRepository<Note,Long> {
}
