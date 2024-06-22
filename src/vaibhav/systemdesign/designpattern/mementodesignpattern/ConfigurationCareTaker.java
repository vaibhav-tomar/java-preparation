package vaibhav.systemdesign.designpattern.mementodesignpattern;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    List<ConfigurationMemento> history = new ArrayList<>();

    public void addMemento(ConfigurationMemento memento) {
        history.add(memento);
    }

    public ConfigurationMemento undo() {
        if (history.isEmpty() == false) {
            int lastIndex = history.size() - 1;
            ConfigurationMemento configurationMemento = history.get(lastIndex);
            history.remove(configurationMemento);
            return configurationMemento;
        }
        return null;
    }
}
