package model;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author keerthikeerthi
 */
public class VitalSigns {
    
    private int respiratoryRating;
    private int heartRating;
    private int bloodPressure;
    private int weight;
    private Date timestamp;
    
    public int getRespiratoryRate() {
        return respiratoryRating;
    }
    
    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRating = respiratoryRate;
    }
    
    public int getHeartRate() {
        return heartRating;
    }
    
    public void setHeartRate(int heartRate) {
        this.heartRating = heartRate;
    }
    
    public int getBloodPressure() {
        return bloodPressure;
    }
    
    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    public Date getTimestamp() {
        return timestamp;
    }
    
    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
    @Override
    public String toString() {
        SimpleDateFormat ft = new SimpleDateFormat("MM/dd/yyyy 'at' hh:mm:ss a");
        return ft.format(timestamp);
    }
}
