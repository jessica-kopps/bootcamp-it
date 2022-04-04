package pratica2.entitys;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class People {

    private String name;
    private String surname;
    private String age;
    private Sport sport;

    public People (peopleDTO peopleDTO) {
        this.name = peopleDTO
    }
}
