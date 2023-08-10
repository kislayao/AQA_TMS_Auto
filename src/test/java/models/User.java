package models;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
public class User {

    private String userName;

    @ToString.Exclude
    private String password;

}
