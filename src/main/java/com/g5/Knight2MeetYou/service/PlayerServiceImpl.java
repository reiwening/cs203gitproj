package com.g5.Knight2MeetYou.service;
import org.springframework.stereotype.Service;

import com.g5.Knight2MeetYou.controller.PlayerNotFoundException;
import com.g5.Knight2MeetYou.entity.Player;

import java.util.*;

@Service
public class PlayerServiceImpl implements PlayerService {

    private PlayerRepository playerRepository;

    // constructor 
    public PlayerServiceImpl( PlayerRepository playerRepository ) {
        this.playerRepository = playerRepository;
    }
    
// override the methods

    @Override
    public boolean authenticatePlayer(String username, String hashedPassword) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Player deletePlayer(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Tournament> getActiveTournamentRegistered(Player player) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Player> getAllPlayers() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Player getPlayerById(Long id) {
        return playerRepository.findById(id).orElse(null);
    }

    @Override
    public double getPlayerGlobalEloRating(Player player) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Queue<Match> getPlayerMatchHistory(Player player) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int getPlayerTournamentRankings(Player player, Tournament tournament) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Tournament> getTournamentRegistered(Player player) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Player registerPlayer(Player player) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Player updatePlayer(Long id, Player updatedPlayer) {
        // TODO Auto-generated method stub
        return null;
    }

   
    
    
}