package com.g5.Knight2MeetYou.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.g5.Knight2MeetYou.model.Player;
import java.util.Optional;


@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
    
    
}
