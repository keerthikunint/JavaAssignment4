package model;

import java.util.ArrayList;

/**
 *
 * @author keerthikeerthi
 */
public class PersonDirectory {
    
    private ArrayList<PersonDetails> personDirectory;
    
    public PersonDirectory() {
        personDirectory = new ArrayList<>();
    }
    
    public ArrayList<PersonDetails> getPersonHistory() {
        return personDirectory;
    }
    
    public void setPersonHistory(ArrayList<PersonDetails> personHistory) {
        this.personDirectory = personHistory;
    }
    
    public PersonDetails createAndAddPerson() {
        PersonDetails person = new PersonDetails();
        personDirectory.add(person);
        return person;
    }
    
    public void deletePerson(PersonDetails person) {
        personDirectory.remove(person);
    }
    
    public ArrayList<PersonDetails> searchPatient(String key)
    {
        ArrayList<PersonDetails> searchPatientDirectory = new ArrayList();
        for(PersonDetails person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                if(person.getPatient()!=null)
                {
                    searchPatientDirectory.add(person);
                }
            }
        }
        return searchPatientDirectory;
    }
    
    public ArrayList<PersonDetails> searchCommunity(String key)
    {
        ArrayList<PersonDetails> searchPatientDirectory = new ArrayList();
        for(PersonDetails person: personDirectory)
        {
           if(person.getCommunityName().toLowerCase().equals(key.toLowerCase())) 
            if(person.getPatient().isIsAbnormal())
                   searchPatientDirectory.add(person); 
        }
        return searchPatientDirectory;
    }
    public ArrayList<PersonDetails> searchPerson(String key)
    {
        ArrayList<PersonDetails> searchPersonDirectory = new ArrayList();
        for(PersonDetails person: personDirectory)
        {
            if(person.getPersonName().toLowerCase().startsWith(key.toLowerCase()))
            {
                searchPersonDirectory.add(person);
            }
        }
        return searchPersonDirectory;
    }
}