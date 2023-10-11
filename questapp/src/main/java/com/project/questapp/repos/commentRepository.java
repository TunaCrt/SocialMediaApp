package com.project.questapp.repos;

import com.project.questapp.entities.comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface commentRepository extends JpaRepository<comment, Long> {
}
