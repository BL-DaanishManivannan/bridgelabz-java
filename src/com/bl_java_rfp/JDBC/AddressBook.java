import java.util.*;
import java.util.concurrent.*;
import java.util.stream.Collectors;

public class AddressBook {

    private List<Person> persons = new ArrayList<>();

    // UC2 + UC6
    public void addPerson(Person person) {
        boolean exists = persons.stream()
                .anyMatch(p -> p.equals(person));
        if (!exists) persons.add(person);
    }

    public int getPersonCount() {
        return persons.size();
    }

    // UC3
    public void editPerson(String firstName, String newAddress) {
        persons.stream()
                .filter(p -> p.getFirstName().equals(firstName))
                .forEach(p -> p.setAddress(newAddress));
    }

    // UC4
    public void deletePerson(String firstName) {
        persons.removeIf(p -> p.getFirstName().equals(firstName));
    }

    // UC7
    public void sortByName() {
        persons.sort(Comparator.comparing(Person::getFirstName));
    }

    // UC8
    public void sortByCity() {
        persons.sort(Comparator.comparing(Person::getCity));
    }

    public void sortByState() {
        persons.sort(Comparator.comparing(Person::getState));
    }

    public void sortByZip() {
        persons.sort(Comparator.comparing(Person::getZip));
    }

    public List<Person> getPersons() {
        return persons;
    }

    // UC9
    public Map<String, List<Person>> getPersonsByCity() {
        return persons.stream().collect(Collectors.groupingBy(Person::getCity));
    }

    public Map<String, List<Person>> getPersonsByState() {
        return persons.stream().collect(Collectors.groupingBy(Person::getState));
    }

    // UC10
    public List<Person> searchByCity(String city) {
        return persons.stream()
                .filter(p -> p.getCity().equals(city))
                .toList();
    }

    public List<Person> searchByState(String state) {
        return persons.stream()
                .filter(p -> p.getState().equals(state))
                .toList();
    }

    // UC11 - JSON File (basic)
    public void writeToJson(String filePath) throws Exception {
        java.nio.file.Files.writeString(
                java.nio.file.Paths.get(filePath),
                persons.toString()
        );
    }

    // UC12 - CSV (basic)
    public void writeToCSV(String filePath) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (Person p : persons) {
            sb.append(p.getFirstName()).append(",")
                    .append(p.getLastName()).append(",")
                    .append(p.getCity()).append("\n");
        }
        java.nio.file.Files.writeString(java.nio.file.Paths.get(filePath), sb.toString());
    }

    // UC13 - GSON
    public void writeToJsonGson(String filePath) throws Exception {
        com.google.gson.Gson gson = new com.google.gson.Gson();
        String json = gson.toJson(persons);
        java.nio.file.Files.writeString(java.nio.file.Paths.get(filePath), json);
    }

    // UC14 - Simulated REST call
    public void saveToServer() {
        System.out.println("Simulated REST API call");
    }

    // UC15 - Multithreading
    public void asyncWrite(Runnable task) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.submit(task);
        executor.shutdown();
    }
}