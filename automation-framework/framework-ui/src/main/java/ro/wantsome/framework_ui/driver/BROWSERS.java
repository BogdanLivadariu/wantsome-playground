package ro.wantsome.framework_ui.driver;

public enum BROWSERS {
    CHROME("chrome"),
    FIREFOX("firefox");
    private final String name;

    BROWSERS(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static BROWSERS fromName(String name) {
        switch (name) {
            case "chrome":
            default:
                return CHROME;
            case "firefox":
                return FIREFOX;
        }
    }
}
