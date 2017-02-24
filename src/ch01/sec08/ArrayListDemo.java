package ch01.sec08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * Created by 이성희 on 2017-02-20.
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> friends = new ArrayList<>();
        friends.add("peter");
        friends.add("paul");

        friends.remove(1);
        friends.add(0,"Paul");

        System.out.println("Friends = "+ friends);

        String first = friends.get(0);

        System.out.println(first);

        System.out.println("-------");

        friends.set(1,"Mary");

        for(int i =0;i<friends.size();i++) {
            System.out.println(friends.get(i));
        }

        ArrayList<String> people = friends;
        people.set(0,"Mary1");

        System.out.println("friends = "+ friends);

        ArrayList<String> copiedFriends = new ArrayList<>(friends);
        copiedFriends.set(0,"Fred1");

        System.out.println("copiedFriends=" + copiedFriends);
        System.out.println("friends=" + friends);

        friends = new ArrayList<>(Arrays.asList("Peter","Paul","Mary","a","c","b"));
        String[] names = friends.toArray(new String[0]);
        System.out.println("names = " + Arrays.toString(names));

        ArrayList<String> moreFriends = new ArrayList<>(Arrays.asList(names));

        System.out.println(moreFriends);

        Collections.reverse(moreFriends);
        System.out.println(moreFriends);

        Collections.shuffle(moreFriends);
        System.out.println(moreFriends);

        Collections.sort(moreFriends);
        System.out.println(moreFriends);

    }
}
