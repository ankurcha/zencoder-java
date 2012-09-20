package de.bitzeche.video.transcoding.zencoder.job;

import java.util.Date;
import java.util.List;

/**
 * User: achauhan
 * Date: 9/18/12
 */
public class ZencoderMinutesUsedReport {
    class Total {
        long encodedMinutes;
        long billableMinutes;

        public long getEncodedMinutes() {
            return encodedMinutes;
        }

        public void setEncodedMinutes(long encodedMinutes) {
            this.encodedMinutes = encodedMinutes;
        }

        public long getBillableMinutes() {
            return billableMinutes;
        }

        public void setBillableMinutes(long billableMinutes) {
            this.billableMinutes = billableMinutes;
        }
    }

    class StatisticGroup {
        String grouping;
        Date collectedOn;
        long encodedMinutes;
        long billableMinutes;

        public String getGrouping() {
            return grouping;
        }

        public void setGrouping(String grouping) {
            this.grouping = grouping;
        }

        public Date getCollectedOn() {
            return collectedOn;
        }

        public void setCollectedOn(Date collectedOn) {
            this.collectedOn = collectedOn;
        }

        public long getEncodedMinutes() {
            return encodedMinutes;
        }

        public void setEncodedMinutes(long encodedMinutes) {
            this.encodedMinutes = encodedMinutes;
        }

        public long getBillableMinutes() {
            return billableMinutes;
        }

        public void setBillableMinutes(long billableMinutes) {
            this.billableMinutes = billableMinutes;
        }
    }

    Total total;
    List<StatisticGroup> statistics;

    public Total getTotal() {
        return total;
    }

    public void setTotal(Total total) {
        this.total = total;
    }

    public List<StatisticGroup> getStatistics() {
        return statistics;
    }

    public void setStatistics(List<StatisticGroup> statistics) {
        this.statistics = statistics;
    }
}
