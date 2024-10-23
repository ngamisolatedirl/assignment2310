package truong.assignment2310.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="player_t")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int playerId;
    private String playerName;
    private String playerNational;

    // Getters and setters
    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerNational() {
        return playerNational;
    }

    public void setPlayerNational(String playerNational) {
        this.playerNational = playerNational;
    }
}
