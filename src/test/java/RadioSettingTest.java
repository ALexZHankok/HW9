import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioSettingTest {
    @Test
    public void parametersStationTest() {
        Radio radio = new Radio(10);
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStationTest() {
        Radio radio = new Radio(10);
        radio.setMaxStation(9);

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underMaxStationTest() {
        Radio radio = new Radio(10);
        radio.setMaxStation(-1);

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void upperMaxStationTest() {
        Radio radio = new Radio(10);
        radio.setMaxStation(15);

        int expected = 9;
        int actual = radio.getMaxStation();

        Assertions.assertEquals(expected, actual);
    }

}

