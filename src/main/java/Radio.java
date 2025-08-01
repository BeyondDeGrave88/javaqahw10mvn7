public class Radio {
    private int currentRadioStation;
    private int currentVolume;
    private int quantityOfStations;

    public Radio() {
        this.quantityOfStations = 10;
    }

    public Radio(int quantityOfStations) {
        if (quantityOfStations < 1) {
            this.quantityOfStations = 10;
        } else {
            this.quantityOfStations = quantityOfStations;
        }
    }

    public int getQuantityOfStations() {
        return quantityOfStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int radioStation) {
        if (radioStation < 0) {
            currentRadioStation = 0;
        } else if (radioStation > quantityOfStations) {
            currentRadioStation = quantityOfStations - 1;
        } else {
            currentRadioStation = radioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int volume) {
        if (volume < 0) {
            currentVolume = 0;
        } else if (volume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = volume;
        }
    }

    public void nextRadioStation() {
        currentRadioStation = (currentRadioStation + 1) % quantityOfStations;
    }

    public void prevRadioStation() {
        currentRadioStation = (currentRadioStation - 1 + quantityOfStations) % quantityOfStations;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}