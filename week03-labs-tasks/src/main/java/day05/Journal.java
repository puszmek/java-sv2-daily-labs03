package day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Journal {

    private List<String> names = new ArrayList<>();

    public boolean addStudent(String name) {
        if ((name.trim().indexOf(" ") > 0)) {
            names.add(name);
            return true;
        } else {
            System.out.println("A név helytelen, nem tartalmaz vezeték és keresztnevet is.");
        }
        return false;
    }

    public List<String> getNames() {
        return names;
    }
}
