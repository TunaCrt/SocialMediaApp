package com.project.questapp.repos;

import com.project.questapp.entities.post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface postRepository extends JpaRepository<post, Long> {
    List<post> findByUserId(Optional<Long> userId);


}
