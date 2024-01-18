package ru.gindemit.bestiarydnd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import ru.gindemit.bestiarydnd.model.Creature;

@Repository
public interface CreatureRepository extends JpaRepository<Creature, Long>, JpaSpecificationExecutor<Creature> {
}
