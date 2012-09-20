package de.bitzeche.video.transcoding.zencoder.job;

/**
 * User: achauhan
 * Date: 9/18/12
 */
public class ZencoderAccount {
    public enum State {
        ACTIVE, STOPPED, SUSPENDED, CANCELLED
    }

    public enum BillingState {
        ACTIVE, PAST_DUE, CANCELLED
    }

    State accountState;
    String plan;
    long minutesUsed;
    long minutesIncluded;
    BillingState billingState;

    boolean integrationMode;

}
