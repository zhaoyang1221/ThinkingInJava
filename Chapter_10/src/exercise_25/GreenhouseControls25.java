package exercise_25;

import exercise_24.Event;
import exercise_24.GreenhouseController;

/**
 * Created with IntelliJ IDEA.
 * User: zhaoyang
 * Date: 2018/5/14 0014
 * Description:
 */
public class GreenhouseControls25 extends GreenhouseController {
    private boolean waterMist = false;
    public class WaterMistOn extends Event {
        public WaterMistOn(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMist = true;
        }

        @Override
        public String toString() {
            return "WaterMist is On";
        }
    }
    public class WaterMistOff extends Event {
        public WaterMistOff(long delayTime) {
            super(delayTime);
        }

        @Override
        public void action() {
            waterMist = false;
        }

        @Override
        public String toString() {
            return "WaterMist is Off";
        }
    }
}