public interface Tournament {
    Long id;
    String name;
    List<Player> registeredPlayers;
    //used for automatically determining if a tournament starts or cancels
    int maxPlayers;
    int minPlayers;
    localDateTime registrationCutOff;
    boolean tournamentStarted;
    //stores every single game in the tournament
    List<Match> tournamentMatchHistory;
    Map<Integer, Set<Player>> rankings;


    public Long getId();
    public String getName();
    public List<Match> getTournamentMatchHistory();
    public Match getMatch(Player p1, Player p2);
    public Match getMatch(Long matchId);
    public int getRegisteredPlayerCount;


}
