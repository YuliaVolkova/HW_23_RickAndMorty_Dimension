import configRickAndMorty.BaseClass;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.when;

public class RickAndMorty_Dimension_Test extends BaseClass {
    static String baseURL = "location";




    @Test
    public void testDimensionValues() {
        List<String> url=  when()
                .get(baseURL).then().extract().jsonPath().getList("results.dimension",String.class);
        System.out.println(url);
    }


}
