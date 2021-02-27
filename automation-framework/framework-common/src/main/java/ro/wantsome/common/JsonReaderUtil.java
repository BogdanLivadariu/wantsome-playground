package ro.wantsome.common;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Type;

class JsonReaderUtil {
    private static final Gson gson = new GsonBuilder().create();

    public static <T> T readJSONFile(String fileName, Type type) {
        InputStream inputStream = JsonReaderUtil.class.getClassLoader().getResourceAsStream(fileName);

        return readJSONFromInputStream(inputStream, type);
    }

    public static <T> T readJSONFromInputStream(InputStream inputStream, Type type) {
        Reader reader = new InputStreamReader(inputStream);

        return gson.fromJson(reader, type);
    }
}
