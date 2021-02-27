package ro.wantsome.common;

public class EnvironmentUtil {
    private static String environmentName;

    public static String getEnvironmentName() {
        if (environmentName == null) {
            String env;
            if ((env = System.getProperty("env", "local")) != null) {
                environmentName = env;
            } else {
                throw new NullPointerException("The 'env' system property was not set, "
                        + "make sure that you have it set using -Denv=local , or any other environment of choice");
            }
        }
        return environmentName;
    }

    public static String getBrowser() {
        return System.getProperty("browser", "chrome");
    }
}
