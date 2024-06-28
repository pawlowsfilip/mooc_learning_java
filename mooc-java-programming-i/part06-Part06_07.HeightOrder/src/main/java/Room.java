import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if(this.room.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public Person shortest() {
        if(this.room.isEmpty()) {
            return null;
        }

        Person shortestOne = this.room.get(0);

        for (Person person: room) {
            if (person.getHeight() < shortestOne.getHeight()) {
                shortestOne = person;
            }
        }

        return shortestOne;
    }

    public Person take() {
          if(this.room.isEmpty()) {
            return null;
        }

        Person shortestOne = this.room.get(0);

        for (Person person: room) {
            if (person.getHeight() < shortestOne.getHeight()) {
                shortestOne = person;
            }
        }

        room.remove(shortestOne);

        return shortestOne;

    }
}
