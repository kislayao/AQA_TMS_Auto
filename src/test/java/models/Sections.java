package models;

import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Sections {

    @SerializedName(value = "name")
    private String sectionName;


}
