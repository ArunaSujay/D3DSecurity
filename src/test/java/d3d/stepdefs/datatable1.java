package d3d.stepdefs;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;

public class datatable1 {
    @And("^I enter below details:$")
    public void iEnterBelowDetails(DataTable details) throws Throwable {
    System.out.println(details);
    System.out.println(details.raw());
    System.out.println(details.raw().get(1).get(0));
    System.out.println(details.raw().get(1).get(1));





    }
}
