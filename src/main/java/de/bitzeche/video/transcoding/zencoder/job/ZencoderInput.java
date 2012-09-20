package de.bitzeche.video.transcoding.zencoder.job;

import de.bitzeche.video.transcoding.zencoder.enums.ZencoderAudioCodec;
import de.bitzeche.video.transcoding.zencoder.enums.ZencoderVideoCodec;

/**
 * User: achauhan
 * Date: 9/18/12
 */
public class ZencoderInput {

    public enum State {
        PENDING, WAITING, PROCESSING, FINISHED, FAILED, CANCELLED
    }

    int audioBitrateInKbps;
    ZencoderAudioCodec audioCodec;
    int audioSampleRate;
    int channels;
    long durationInMs;
    long fileSizeInBytes;
    String format;
    double frameRate;
    int height;
    long id;
    boolean privacy;
    long jobId;
    State state;
    int totalBitrateInKbps;
    ZencoderVideoCodec videoCodec;
    int width;
    String md5Checksum;


    public int getAudioBitrateInKbps() {
        return audioBitrateInKbps;
    }

    public void setAudioBitrateInKbps(int audioBitrateInKbps) {
        this.audioBitrateInKbps = audioBitrateInKbps;
    }

    public ZencoderAudioCodec getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(ZencoderAudioCodec audioCodec) {
        this.audioCodec = audioCodec;
    }

    public int getAudioSampleRate() {
        return audioSampleRate;
    }

    public void setAudioSampleRate(int audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    public int getChannels() {
        return channels;
    }

    public void setChannels(int channels) {
        this.channels = channels;
    }

    public long getDurationInMs() {
        return durationInMs;
    }

    public void setDurationInMs(long durationInMs) {
        this.durationInMs = durationInMs;
    }

    public long getFileSizeInBytes() {
        return fileSizeInBytes;
    }

    public void setFileSizeInBytes(long fileSizeInBytes) {
        this.fileSizeInBytes = fileSizeInBytes;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public double getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(double frameRate) {
        this.frameRate = frameRate;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isPrivacy() {
        return privacy;
    }

    public void setPrivacy(boolean privacy) {
        this.privacy = privacy;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getTotalBitrateInKbps() {
        return totalBitrateInKbps;
    }

    public void setTotalBitrateInKbps(int totalBitrateInKbps) {
        this.totalBitrateInKbps = totalBitrateInKbps;
    }

    public ZencoderVideoCodec getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(ZencoderVideoCodec videoCodec) {
        this.videoCodec = videoCodec;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getMd5Checksum() {
        return md5Checksum;
    }

    public void setMd5Checksum(String md5Checksum) {
        this.md5Checksum = md5Checksum;
    }
}
