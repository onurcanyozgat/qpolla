package com.qpolla.poll.repository;

import com.qpolla.poll.data.entity.OptionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<OptionEntity, Long> {}