package lessons.lesson4.zooClub;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.*;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@AllArgsConstructor
@Data

public class ZooClub {
    Map<ZooMember, List<Pet>> club = new HashMap<>();

    public void setMember(ZooMember member) {
        this.club.put(member, new ArrayList<Pet>());
    }

    public void setPet(ZooMember member, Pet pet) {
        this.club.get(member).add(pet);
    }
    public void showZooClub() {
        System.out.println(this.club);
    }
    public void deletePet(ZooMember member, String petName) {
        this.club.get(member).removeIf(pet -> pet.getName().equals(petName));
    }
    public void deletePetFromAllMembers(String petName) {
        for (List<Pet> pets : this.club.values()) {
            pets.removeIf(pet -> pet.getName().equals(petName));
        }
    }
    public void deleteMember(ZooMember member) {
        this.club.remove(member);
    }
}
