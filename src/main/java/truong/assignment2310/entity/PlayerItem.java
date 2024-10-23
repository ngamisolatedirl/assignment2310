package truong.assignment2310.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="player_item_t")
public class PlayerItem {

    @EmbeddedId
    private PlayerItemKey id;

    @ManyToOne
    @MapsId("itemId")
    @JoinColumn(name = "itemId")
    private Item item;

    @ManyToOne
    @MapsId("playerId")
    @JoinColumn(name = "playerId")
    private Player player;

    public PlayerItemKey getId() {
        return id;
    }

    public void setId(PlayerItemKey id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
