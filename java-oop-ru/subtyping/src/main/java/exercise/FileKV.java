package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class FileKV implements  KeyValueStorage {
    private final  String filePath;
    private Map<String, String> data;

    public FileKV(String filePath, Map<String, String> initialData) {
        this.filePath = filePath;
        this.data = initialData;
    }

    @Override
    public void set(String key, String value) {
        data.put(key, value);
        saveDatatoFile();
    }


    @Override
    public void unset(String key) {
        data.remove(key);
        saveDatatoFile();
    }

    @Override
    public String get(String key, String defaultValue) {
        String value = data.get(key);
        if (value == null) {
            return defaultValue;
        }
        return value;
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(data);
    }

    private void saveDatatoFile() {
        String serializedData = Utils.serialize(data);
    }
    private void loadDataFromFile() {
        String serializedData = Utils.readFile(filePath);
        data = Utils.deserialize(serializedData);
    }
    public void close() throws Exception {
        saveDatatoFile();
    }
}
// END
