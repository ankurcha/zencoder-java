package de.bitzeche.video.transcoding.zencoder.job;

/**
 * User: achauhan
 * Date: 9/18/12
 */
public class ZencoderOutputProgress {

    public enum State {
         WAITING, QUEUED, ASSIGNING, PROCESSING, FINISHED, FAILED, CANCELLED, NOINPUT, SKIPPED
    }

    public enum Event {
        DOWNLOADING, TRANSCODING, UPLOADING
    }
    State state;
    Event currentEvent;
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

    public double getProgress() {
        return progress;
    }

    public void setProgress(double progress) {
        this.progress = progress;
    }
}
