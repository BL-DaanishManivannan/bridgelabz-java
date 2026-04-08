import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Person> persons = new ArrayList<>();

    // UC2 - Add Person (updated in UC6 for duplicate check)
    public void addPerson(Person person) {
        boolean exists = persons.stream()
                .anyMatch(p -> p.getFirstName().equals(person.getFirstName())
                        && p.getLastName().equals(person.getLastName()));

        if (!exists) {
            persons.add(person);
        }
    }

    // UC2 - Get Count
    public int getPersonCount() {
        return persons.size();
    }

    // UC3 - Edit Person (only address for now)
    public void editPerson(String firstName, String newAddress) {
        for (Person person : persons) {
            if (person.getFirstName().equals(firstName)) {
                person.setAddress(newAddress);
            }
        }
    }

    // UC4 - Delete Person
    public void deletePerson(String firstName) {
        persons.removeIf(person -> person.getFirstName().equals(firstName));
    }

    import java.util.Comparator;

    public void sortByName() {
        persons.sort(Comparator.comparing(Person::getFirstName));
    }

    // Needed for test (minimal exposure)
    public List<Person> getPersons() {
        return persons;
    }
    import java.util.Comparator;

    // Sort by City
    public void sortByCity() {
        persons.sort(Comparator.comparing(Person::getCity));
    }

    // Sort by State
    public void sortByState() {
        persons.sort(Comparator.comparing(Person::getState));
    }

    // Sort by Zip
    public void sortByZip() {
        persons.sort(Comparator.comparing(Person::getZip));
    }
}