package tests;

import java.util.Map;

import static utils.YAMLDeserializer.fromFileToMap;

public class AuthorizedTest extends BaseTest {

    protected static Map<String, String> user;

    static {
        user = fromFileToMap("user.yaml");
    }

    public AuthorizedTest() {
        super();
    }
}
