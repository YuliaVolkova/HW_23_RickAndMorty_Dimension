import configRickAndMorty.BaseClass;
import org.junit.Test;

import java.awt.*;
import java.util.List;

import static io.restassured.RestAssured.when;

public class RickAndMortyTest_Dimension extends BaseClass {
    static String baseURL = "location";




    @Test
    public void testDimensionValues() {
        List<String> url=  when()
                .get(baseURL).then().extract().jsonPath().getList("results.dimension",String.class);
        System.out.println(url);
    }


}
