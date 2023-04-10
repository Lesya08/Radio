import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void nextMinStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(0);

        rado.nextStation();

        int expected = 1;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRightMinStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(1);

        rado.nextStation();

        int expected = 2;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMediumStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(5);

        rado.nextStation();

        int expected = 6;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextMaxStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(9);

        rado.nextStation();

        int expected = 0;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void nextLeftMaxStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(8);

        rado.nextStation();

        int expected = 9;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMinStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(0);

        rado.prevStation();

        int expected = 9;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRightMinStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(1);

        rado.prevStation();

        int expected = 0;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMediumStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(5);

        rado.prevStation();

        int expected = 4;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevLefMaxStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(8);

        rado.prevStation();

        int expected = 7;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevMaxStationTest() {
        Radio rado = new Radio();
        rado.setCurrentStation(9);

        rado.prevStation();

        int expected = 8;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mediumStationTest() {
        Radio radio = new Radio();

        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void zeroStationTest() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minStationTest() {
        Radio rado = new Radio();

        rado.setCurrentStation(1);

        int expected = 1;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxStationTest() {
        Radio rado = new Radio();

        rado.setCurrentStation(9);

        int expected = 9;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void lessMinStationTest() {
        Radio rado = new Radio();

        rado.setCurrentStation(-1);

        int expected = 0;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void moreMaxStationTest() {
        Radio rado = new Radio();

        rado.setCurrentStation(10);

        int expected = 0;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void leftMaxStationTest() {
        Radio rado = new Radio();

        rado.setCurrentStation(8);

        int expected = 8;
        int actual = rado.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeZeroTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeFromOneTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.increaseVolume();

        int expected = 2;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMediumTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.increaseVolume();

        int expected = 51;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeLefMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeZeroTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeFromOneTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);

        radio.decreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMediumTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);

        radio.decreaseVolume();

        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLefMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);

        radio.decreaseVolume();

        int expected = 98;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeMaxTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);

        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}
