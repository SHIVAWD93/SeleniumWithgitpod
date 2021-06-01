package dropdown;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTests;

public class DropdownTests extends BaseTests {

    @Test
    public void testSelectOption() {
        var dropDownPage = homePage.clickDropdown();
        var optionSelected = "Option 1";
        dropDownPage.selectFromDropdown(optionSelected);
        var selectedOptions = dropDownPage.getSelectedOptions();

        Assert.assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");

        Assert.assertTrue(selectedOptions.contains(optionSelected), "Option not selected");

    }
}
