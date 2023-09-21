package models;

import com.google.gson.annotations.SerializedName;
import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@Table(name = "Cases")
public class Cases {

    @SerializedName(value = "id")
    @EqualsAndHashCode.Exclude
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int caseId;

    @SerializedName(value = "title")
    @Column(name = "Title")
    private String caseTitle;

    public Cases(String title) {
        this.caseTitle = title;
    }
}
