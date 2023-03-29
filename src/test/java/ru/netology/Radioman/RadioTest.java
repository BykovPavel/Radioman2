package ru.netology.Radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetStation() {
        Radio station = new Radio();
        station.setCurrentStation(1);
        int expected = 1;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinStation() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMinStation() {
        Radio station = new Radio();
        station.setCurrentStation(-1);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxStation() {
        Radio station = new Radio();
        station.setCurrentStation(10);
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.next();
        int expected = 8;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchNextStationIfMax() {
        Radio station = new Radio();
        station.setCurrentStation(9);
        station.next();
        int expected = 0;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStation() {
        Radio station = new Radio();
        station.setCurrentStation(7);
        station.prev();
        int expected = 6;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSwitchPrevStationIfMin() {
        Radio station = new Radio();
        station.setCurrentStation(0);
        station.prev();
        int expected = 9;
        int actual = station.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(2);
        int expected = 2;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetBelowMinVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(-1);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetAboveMaxVolume() {
        Radio volume = new Radio();
        volume.setCurrentVolume(11);
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUp() {
        Radio volume = new Radio();
        volume.setCurrentVolume(6);
        volume.volumeUp();
        int expected = 7;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUpAboveMax() {
        Radio volume = new Radio();
        volume.setCurrentVolume(10);
        volume.volumeUp();
        int expected = 10;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDown() {
        Radio volume = new Radio();
        volume.setCurrentVolume(3);
        volume.volumeDown();
        int expected = 2;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownBelowMin() {
        Radio volume = new Radio();
        volume.setCurrentVolume(0);
        volume.volumeDown();
        int expected = 0;
        int actual = volume.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}

