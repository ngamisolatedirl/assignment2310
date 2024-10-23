package truong.assignment2310.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "item_type_t")
public class ItemType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemTypeId;
    private String itemTypeName;

    // Getters and setters
    public int getItemTypeId() {
        return itemTypeId;
    }

    public void setItemTypeId(int itemTypeId) {
        this.itemTypeId = itemTypeId;
    }

    public String getItemTypeName() {
        return itemTypeName;
    }

    public void setItemTypeName(String itemTypeName) {
        this.itemTypeName = itemTypeName;
    }
}
