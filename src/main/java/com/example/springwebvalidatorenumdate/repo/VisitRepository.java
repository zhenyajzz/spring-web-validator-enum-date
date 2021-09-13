package com.example.springwebvalidatorenumdate.repo;

import com.example.springwebvalidatorenumdate.model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit,Long> {
}
