package de.bitzeche.video.transcoding.zencoder.job;

/**
 * User: achauhan
 * Date: 9/18/12
 */
public class ZencoderInputProgress {

    public enum State {
         WAITING, PENDING, ASSIGNING, PROCESSING, FINISHED, FAILED, CANCELLED
    }

    public enum Event {
        DOWNLOADING, INSPECTING
    }
    State state;
    Event currentEvent;
    double currentEventProgress;
    double progress;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Event getCurrentEvent() {
        return currentEvent;
    }

    public void setCurrentEvent(Event currentEvent) {
        this.currentEvent = currentEvent;
    }

    public double getCurrentEventProgress() {
        return currentEventProgress;
    }

    public void setCurrentEventProgress(double currentEventProgress) {
        this.currentEventProgress = currentEventProgress;
    }

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
