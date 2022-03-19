package model;

import java.util.ArrayList;
/**
 *
 * @author keerthikeerthi
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> history;
    
    public VitalSignHistory() {
        history = new ArrayList<>();
    }
    
    public ArrayList<VitalSigns> getHistory() {
        return history;
    }
    
    public void setHistory(ArrayList<VitalSigns> history) {
        this.history = history;
    }
    
    public VitalSigns createAndAddVitalSign() {
        VitalSigns vitalSign = new VitalSigns();
        history.add(vitalSign);
        return vitalSign;
    }
    
    public void deleteVitalSign(VitalSigns vitalSign) {
        history.remove(vitalSign);
    }
}
