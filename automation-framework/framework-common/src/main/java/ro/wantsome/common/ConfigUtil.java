package ro.wantsome.common;

import com.google.gson.reflect.TypeToken;
import ro.wantsome.common.pojo.ConfigModel;

import java.lang.reflect.Type;
import java.util.Map;

public class ConfigUtil {
    private static final String CONFIG_FILE = "config.json";

    private static Map<String, ConfigModel> configs;

    public static Map<String, ConfigModel> getConfigs() {
        if (configs == null) {
            try {
                Type type = new TypeToken<Map<String, ConfigModel>>() {
                }.getType();
                configs =
                        JsonReaderUtil.readJSONFile(CONFIG_FILE, type);
            } catch (Exception e) {
                throw new NullPointerException(
                        "Unable to read the environment preferences from " + CONFIG_FILE + "\n" + e
                                .getMessage());
            }
        }
        return configs;
    }

    public static ConfigModel getCurrentConfig() {
        return getConfigs().get(EnvironmentUtil.getEnvironmentName());
    }
}
