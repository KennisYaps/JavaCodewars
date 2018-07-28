/*
 * In this kata, your job is to create a class Dictionary which you can add
 * words to and their entries.
 * 
 */

class Dictionary {
    // Private instance variables
    private String[] keys;
    private String[] values;

    private int numberOfEntries;
    private static final int MAX_ENTRIES = 100;

    //  Constructor
    public Dictionary() {
        this.keys = new String[MAX_ENTRIES];
        this.values = new String[MAX_ENTRIES];
        this.numberOfEntries = 0;
    }

    // Methods / Behavior
    public void newEntry(String key, String values) {
        this.keys[this.numberOfEntries] = key;
        this.values[this.numberOfEntries] = values;
        ++this.numberOfEntries;
    }

    public String look(String key) {
        // return Arrays.asList(this.keys).contains(key) ?
        String result = "Cant find entry for " + key;
        for (int i = 0; i < this.keys.length; ++i) {
            if (this.keys[i] == key) {
                result = this.values[i];
            }
        }
        return result;
    }

}
// Other people' Ans :
/* 
import java.util.*;

public class Dictionary {
  
  private Map<String, String> entry = new HashMap<String, String>();
  
  public Dictionary() {}
  
  public void newEntry(String key, String value) {
    this.entry.put(key, value);
  }
  
  public String look(String key) {
    return this.entry.getOrDefault(key, "Cant find entry for " + key);
  }
}
*/