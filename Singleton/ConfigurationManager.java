import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private static ConfigurationManager instance; // Единственный экземпляр (Singleton)
    private final Map<String, String> configMap; // Хранилище конфигурации

    // Приватный конструктор, чтобы запретить создание объектов извне
    private ConfigurationManager() {
        configMap = new HashMap<>();
        configMap.put("maxPlayers", "100");
        configMap.put("defaultLanguage", "en");
        configMap.put("gameDifficulty", "medium");
    }

    // Метод для получения единственного экземпляра класса
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager(); // Ленивое создание экземпляра
        }
        return instance;
    }

    // Метод для получения значения конфигурации по ключу
    public String getConfig(String key) {
        return configMap.getOrDefault(key, "Key not found");

    }

    // Метод для вывода всех конфигурационных параметров
    public void printAllConfigs() {
        for (Map.Entry<String, String> entry : configMap.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}

