package association.aggrgation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author vaibhav
 * created on 18-02-2024
 */
//Country class
class Country {
    List<SportPerson> sportPersons;
    private String name;

    public Country(String name)  //to assign Country name
    {
        this.name = name;
    }

    public List<String> getSportPersons() {
        List<SportPerson> listOfSportPersons = this.sportPersons;
        List<String> names = new ArrayList<String>();
        for (SportPerson sportPerson : listOfSportPersons) {
            names.add(sportPerson.getName());
        }
        return names;
    }

    public void setSportPersons(List<SportPerson> sportPersons)  //To assign sportspeople
    {
        this.sportPersons = sportPersons;
    }

    public String getName() {
        return this.name;
    }
}

//Sportsperson class
class SportPerson {
    private String name;

    public SportPerson(String name)  //to assign Sportsperson name
    {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

class Main {
    public static void main(String[] args) {
        //Create three Sportsperson objects
        SportPerson macculum = new SportPerson("Mccullum");
        SportPerson dhoni = new SportPerson("Dhoni");
        SportPerson kohli = new SportPerson("Kohli");
        //Create a country
        Country india = new Country("India");
        //Create a arraylist and add the sportspersons
        List<SportPerson> listOfSportPersons = new ArrayList<SportPerson>();
        listOfSportPersons.add(macculum);
        listOfSportPersons.add(dhoni);
        listOfSportPersons.add(kohli);

        //now add this list to Country Class
        india.setSportPersons(listOfSportPersons);
        //Outputting the Has-a association between Country and Sportsperson
        System.out.println("The sports people from country " + india.getName() + " are " + india.getSportPersons());

    }
}

