import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int quantityOfStations;

    public Radio(int currentRadioStation) {
        this.currentRadioStation = currentRadioStation;
    }
}
