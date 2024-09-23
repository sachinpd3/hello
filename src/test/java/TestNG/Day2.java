package TestNG;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class Day2 extends Base
{
    @Parameters({"url"})
    @Test(groups={"smoke"})
    public void SelenuimTest2(String link)  {
        System.out.println("--After  Sorting--");
        System.out.println(link);
    }

    /**
     * Using Array
     * @return
     */
    @DataProvider
    public Object[][] Getdata()  {
        return new Object[][]{{"sachin","prasad"},{"saket","mrinal"}};
    }

    @Test(dataProvider = "Getdata",retryAnalyzer = Retry.class)
    public void SelenuimTest4(String user,String pwd)  {
        System.out.println("--After  Sorting--");
        System.out.println(user+pwd);
        Assert.assertEquals(3,5);
    }

    /**
     * Using map
     * @return
     */
    @DataProvider
    public Object[][] GetMapdata()  {
        HashMap<String,String> mp = new HashMap<>();
        mp.put("user","sachinMap");
        mp.put("password","prasadmap");
        HashMap<String,String> mp1 = new HashMap<>();
        mp1.put("user","saketMap");
        mp1.put("password","mrinalmap");
        return new Object[][]{{mp},{mp1}};
    }

    @Test(dataProvider = "GetMapdata")
    public void SelenuimTest5(HashMap<String,String> input)  {
        System.out.println("--After  Sorting Using Map--");
        System.out.println(input.get("user")+input.get("password"));
    }


    @DataProvider
    public Object[][] GetJsondataProvider() throws IOException {
        List<HashMap<String,String>> lt= GetJsondata("src/test/java/TestNG/Data.json");
        return new Object[][]{{lt.get(0)},{lt.get(1)}};
    }

    @Test(dataProvider = "GetJsondataProvider")
    public void SelenuimTest6(HashMap<String,String> input)  {
        System.out.println("--After  Sorting Using json Map--");
        System.out.println(input.get("user")+input.get("password"));
    }
}
