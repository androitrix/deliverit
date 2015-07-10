package org.ndas.deliverit.repository;

import org.ndas.deliverit.data.Job;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends CrudRepository<Job, Long> {

}
