package Players;

public class Player {

    private Long id;
    private String username;
    private String password;
    private int rating;

    // Constructors
    public Player() {}

    public Player(String username, String password, int rating) {
        this.username = username;
        this.password = password;
        this.rating = rating;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}