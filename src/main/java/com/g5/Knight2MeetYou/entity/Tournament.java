package com.g5.Knight2MeetYou.entity;
 -X
 
import java.util.*;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Tournament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "tournament_id")  // Foreign key in the Match table
    private List<Match> tournamentMatchHistory;

    private String tournamentStatus;
    private String tournamentStyle = "random"; // random by default 

    @ManyToMany
    @JoinTable(
        name = "player_tournament",
        joinColumns = @JoinColumn(name = "tournament_id"),
        inverseJoinColumns = @JoinColumn(name = "player_id"))
    private List<Player> registeredPlayers;

    
    @ElementCollection // Use @ElementCollection to store a Map in the database
    @CollectionTable(name = "tournament_rankings", joinColumns = @JoinColumn(name = "tournament_id"))
    @MapKeyColumn(name = "player_id")
    @Column(name = "rank")
    private Map<Long, Integer> rankings;

    private int maxPlayers;
    private int minPlayers;

    private int minElo;
    private int maxElo;

    private LocalDateTime registrationCutOff;

    @ManyToOne  // ManyToOne because one admin can oversee many tournaments, but one tournament can have only one admin
    @JoinColumn(name = "admin_id") 
    private Admin admin;  

    // Constructors, getters, and setters
    public Tournament() {
    }

    public Tournament(String name, String tournamentStatus, String tournamentStyle, int maxPlayers, int minPlayers, int minElo, int maxElo, LocalDateTime registrationCutOff) {
        this.name = name;
        this.tournamentStatus = tournamentStatus;
        this.tournamentStyle = tournamentStyle;
        this.maxPlayers = maxPlayers;
        this.minPlayers = minPlayers;
        this.minElo = minElo;
        this.maxElo = maxElo;
        this.registrationCutOff = registrationCutOff;
    }

    // Getters and setters for all fields
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Match> getTournamentMatchHistory() {
        return tournamentMatchHistory;
    }

    public void setTournamentMatchHistory(List<Match> tournamentMatchHistory) {
        this.tournamentMatchHistory = tournamentMatchHistory;
    }

    public String getTournamentStatus() {
        return tournamentStatus;
    }

    public void setTournamentStatus(String tournamentStatus) {
        this.tournamentStatus = tournamentStatus;
    }

    public String getTournamentStyle() {
        return tournamentStyle;
    }

    public void setTournamentStyle(String tournamentStyle) {
        this.tournamentStyle = tournamentStyle;
    }

    public List<Player> getRegisteredPlayers() {
        return registeredPlayers;
    }

    public void setRegisteredPlayers(List<Player> registeredPlayers) {
        this.registeredPlayers = registeredPlayers;
    }

    public Map<Long, Integer> getRankings() {
        return rankings;
    }

    public void setRankings(Map<Long, Integer> rankings) {
        this.rankings = rankings;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(int maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public void setMinPlayers(int minPlayers) {
        this.minPlayers = minPlayers;
    }

    public int getMinElo() {
        return minElo;
    }

    public void setMinElo(int minElo) {
        this.minElo = minElo;
    }

    public int getMaxElo() {
        return maxElo;
    }

    public void setMaxElo(int maxElo) {
        this.maxElo = maxElo;
    }

    public LocalDateTime getRegistrationCutOff() {
        return registrationCutOff;
    }

    public void setRegistrationCutOff(LocalDateTime registrationCutOff) {
        this.registrationCutOff = registrationCutOff;
    }

    public List<Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(List<Admin> admins) {
        this.admins = admins;
    }



}
