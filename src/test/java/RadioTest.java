import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void getCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(5);
        assertEquals(5, radio.getCurrentRadioStation());
    }

    @Test
    void setCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(10);
        assertEquals(10, radio.getCurrentRadioStation());
    }

    @Test
    void getCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        assertEquals(7, radio.getCurrentVolume());
    }

    @Test
    void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(3);
        assertEquals(3, radio.getCurrentVolume());
    }

    @Test
    void getQuantityOfStations() {
        Radio radio = new Radio();
        radio.setQuantityOfStations(12);
        assertEquals(12, radio.getQuantityOfStations());
    }

    @Test
    void setQuantityOfStations() {
        Radio radio = new Radio();
        radio.setQuantityOfStations(8);
        assertEquals(8, radio.getQuantityOfStations());
    }
}
