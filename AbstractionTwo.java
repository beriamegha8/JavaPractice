abstract class Remote {
    int noOfButtons;

    abstract void on();

    abstract void off();

    abstract void changeChannel();
}

abstract class Radio extends Remote {
    abstract void frequency();
}

class CarRadio extends Radio {
    void frequency() {
        System.out.println("Frequency is changed");
    }

    @Override
    void on() {
        System.out.println("Radio is on");
    }

    @Override
    void off() {
        System.out.println("Radio is off");
    }

    @Override
    void changeChannel() {
        System.out.println("Radio is playing");
    }
}

class TV extends Remote {
    void on() {
        System.out.println("TV is on");
    }

    void off() {
        System.out.println("TV is off");
    }

    void changeChannel() {
        System.out.println("Channel is changed");
    }
}

class DVD extends Remote {
    void on() {
        System.out.println("DVD is on");
    }

    void off() {
        System.out.println("DVD is off");
    }

    void changeChannel() {
        System.out.println("DVD is playing");
    }

    void changeVolume() {
        System.out.println("Volume is changed");
    }
}

class AC extends Remote {
    void on() {
        System.out.println("AC is on");
    }

    void off() {
        System.out.println("AC is off");
    }

    void changeChannel() {
        System.out.println("AC is cooling");
    }

    void changeTemperature() {
        System.out.println("Temperature is changed");
    }

    void changeMode() {
        System.out.println("Mode is changed");
    }
}

public class AbstractionTwo {
    public static void main(String[] args) {
        TV tv = new TV();
        tv.on();
        tv.off();
        tv.changeChannel();

        DVD dvd = new DVD();
        dvd.on();
        dvd.off();
        dvd.changeChannel();
        dvd.changeVolume();

        AC ac = new AC();
        ac.on();
        ac.off();
        ac.changeChannel();
        ac.changeTemperature();
        ac.changeMode();

        Remote r = new Remote() {
            @Override
            void on() {
                System.out.println("Remote is on");
            }

            @Override
            void off() {
                System.out.println("Remote is off");
            }

            @Override
            void changeChannel() {
                System.out.println("Remote is changing channel");
            }
        };
    }
}
