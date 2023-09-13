package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Builder
public class Cases {

    @SerializedName(value = "title")
    private String caseTitle;

    @SerializedName(value = "id")
    @EqualsAndHashCode.Exclude
    private String caseId;

}
