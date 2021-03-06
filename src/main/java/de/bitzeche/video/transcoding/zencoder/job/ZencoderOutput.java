/**
 * Copyright (C) 2012 Bitzeche GmbH <info@bitzeche.de>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.bitzeche.video.transcoding.zencoder.job;

import de.bitzeche.video.transcoding.zencoder.enums.ZencoderAudioCodec;
import de.bitzeche.video.transcoding.zencoder.enums.ZencoderVideoCodec;

public class ZencoderOutput {
    public enum State {
        PENDING, WAITING, PROCESSING, FINISHED, FAILED, CANCELLED
    }

    int audioBitRateInKbps;
    ZencoderAudioCodec audioCodec;
    long audioSampleRate;
    int channels;
    long durationInMs;
    long fileSizeInBytes;
    String format;
    double frameRate;
    int height;
    long id;
    String label;
    State state;
    int totalBitRateInKbps;
    String url;
    int videoBitrateInKbps;
    ZencoderVideoCodec videoCodec;
    int width;
    String md5Checksum;

    public int getAudioBitRateInKbps() {
        return audioBitRateInKbps;
    }

    public void setAudioBitRateInKbps(int audioBitRateInKbps) {
        this.audioBitRateInKbps = audioBitRateInKbps;
    }

    public ZencoderAudioCodec getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(ZencoderAudioCodec audioCodec) {
        this.audioCodec = audioCodec;
    }

    public long getAudioSampleRate() {
        return audioSampleRate;
    }

    public void setAudioSampleRate(long audioSampleRate) {
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

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getTotalBitRateInKbps() {
        return totalBitRateInKbps;
    }

    public void setTotalBitRateInKbps(int totalBitRateInKbps) {
        this.totalBitRateInKbps = totalBitRateInKbps;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getVideoBitrateInKbps() {
        return videoBitrateInKbps;
    }

    public void setVideoBitrateInKbps(int videoBitrateInKbps) {
        this.videoBitrateInKbps = videoBitrateInKbps;
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
