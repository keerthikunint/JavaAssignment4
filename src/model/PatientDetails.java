package model;

/**
 *
 * @author keerthikeerthi
 */
public class PatientDetails {
    
    private String patient_Identity;
    private String primary_Doctor_Name;
    private String pharmacy_preference;
    private VitalSignHistory vitalSignHistory;
    private boolean is_Abnormal;

    public boolean isIsAbnormal() {
        return is_Abnormal;
    }

    public void setIsAbnormal(boolean isAbnormal) {
        this.is_Abnormal = isAbnormal;
    }
    
    public PatientDetails() {
        this.vitalSignHistory = new VitalSignHistory();
    }
    
    public String getPatient_Identity() {
        return patient_Identity;
    }
    
    public void setPatient_Identity(String patientID) {
        this.patient_Identity = patientID;
    }
    
    public String getPrimaryDoctorName() {
        return primary_Doctor_Name;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primary_Doctor_Name = primaryDoctorName;
    }
    
    public String getPrefferedPharmacy() {
        return pharmacy_preference;
    }
    
    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.pharmacy_preference = prefferedPharmacy;
    }
    
    public VitalSignHistory getVitalSignHistory() {
        return vitalSignHistory;
    }
    
    public void setVitalSignHistory(VitalSignHistory vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    @Override
    public String toString()
    {
        return String.valueOf(this.patient_Identity);
    }
}
