package com.example.demo.repository;

import com.example.demo.model.PullRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.*;


public interface IPullRequestRepository extends JpaRepository<PullRequest, Long> {

    //@GetMapping
    //public List<PullRequest> findBy(@RequestParam  ) {
        //return checkpointStopRepository.findAll();
   // }
}
