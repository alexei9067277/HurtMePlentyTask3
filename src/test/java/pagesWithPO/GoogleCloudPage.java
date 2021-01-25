package pagesWithPO;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GoogleCloudPage extends AbstractPage{

    JavascriptExecutor js = (JavascriptExecutor) driver;

    public GoogleCloudPage(WebDriver driver) {
        super(driver);
    }

    public void openPage() {
        driver.get("https://cloud.google.com/");
    }

    public void findGooglePricingCalculator(String textForSearch) {
        WebElement googleSearchField = waitForElementLocatedBy(driver, By.xpath("//input[@name='q']"));
        googleSearchField.sendKeys(textForSearch);
        googleSearchField.sendKeys(Keys.ENTER);
    }

    public void openGooglePricingCalculator() {
        WebElement openGoogleField = waitForElementLocatedBy(driver, By
                .xpath("//div[@class='gs-title']/descendant::b[text()='Google Cloud Platform Pricing Calculator']"));
        openGoogleField.click();
    }

    public void ChooseComputeEngineTab() {

        WebElement firstFrame = waitForElementLocatedBy(driver, By.xpath("//iframe[contains(@name,'goog_')]"));
        driver.switchTo().frame(firstFrame); //Переключаемся на первый iframe
        driver.switchTo().frame(0); //Переключаемся на первый iframe внутри родительского iframe
        WebElement chooseComputeEngineTab = waitForElementLocatedBy(driver, By
                .xpath("//md-tab-item/descendant::div[text()='Compute Engine']"));
        chooseComputeEngineTab.click();
    }

    public void AddFieldNumberOfInstances(String NumberOfInstances) {
        WebElement addFieldNumberOfInstances = waitForElementLocatedBy(driver, By.
                xpath("//input[@id='input_63']"));
        addFieldNumberOfInstances.sendKeys(NumberOfInstances);
    }

    public void AddFieldOperatingSystem() {
        WebElement AddFieldOperatingSystem = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_56']"));
        AddFieldOperatingSystem.click();
        WebElement changeFieldOperatingSystem = waitForElementLocatedBy(driver, By.
                xpath("//md-option[@class='md-ink-ripple']/div[@class='md-text' and contains(text(),'Free: Debian, CentOS, CoreOS, Ubuntu, or other User Provided OS')]"));
        changeFieldOperatingSystem.click();
    }

    public void AddFieldMachineClass() {
        WebElement addFieldMachineClass = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_57']"));
        addFieldMachineClass.click();
        WebElement changeFieldMachineClass = waitForElementLocatedBy(driver, By.
                xpath("//md-option[@id='select_option_78']/div[@class='md-text']"));
        changeFieldMachineClass.click();
    }

    public void AddFieldSeries() {
//        driver.switchTo().defaultContent(); // перейти из фрейма назад
//        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
//        WebElement firstFrame = waitForElementLocatedBy(driver, By.xpath("//iframe[contains(@name,'goog_')]"));
//        driver.switchTo().frame(firstFrame); //Переключаемся на первый iframe
//        driver.switchTo().frame(0); //Переключаемся на первый iframe внутри родительского iframe
        WebElement addFieldSeries = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_59']"));
        addFieldSeries.click();
        WebElement changeFieldSeries = waitForElementLocatedBy(driver, By.
                xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='n1']"));
        js.executeScript("arguments[0].scrollIntoView(true);",changeFieldSeries);
        changeFieldSeries.click();
    }

    public void AddFieldMachineType() {
        WebElement addFieldMachineType = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_60']"));
        addFieldMachineType.click();
        WebElement changeFieldMachineType = waitForElementLocatedBy(driver, By.
                //xpath("//md-option[@id='select_option_413' and @value='CP-COMPUTEENGINE-VMIMAGE-N2-STANDARD-32']"));
                xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='CP-COMPUTEENGINE-VMIMAGE-N1-STANDARD-8']"));
        js.executeScript("arguments[0].scrollIntoView(true);",changeFieldMachineType);
        changeFieldMachineType.click();

    }

    public void AddCheckboxAddGPU() {
        WebElement addCheckboxAddGPU = waitForElementLocatedBy(driver, By.
                xpath("//md-checkbox[@ng-model='listingCtrl.computeServer.addGPUs']"));
        addCheckboxAddGPU.click();
    }

    public void AddFieldNumberOfGPUs() {
        WebElement addFieldNumberOfGPUs = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_392']"));
        addFieldNumberOfGPUs.click();
        WebElement changeFieldNumberOfGPUs = waitForElementLocatedBy(driver, By.
                        xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']"));
        js.executeScript("arguments[0].scrollIntoView(true);",changeFieldNumberOfGPUs);
        changeFieldNumberOfGPUs.click();
    }

    public void AddFieldGPUType() {
        WebElement addFieldGPUType = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_393']"));
        addFieldGPUType.click();
        WebElement changeFieldGPUType = waitForElementLocatedBy(driver, By.
                xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='NVIDIA_TESLA_V100']"));
        changeFieldGPUType.click();
    }

    public void AddFieldLocalSSD() {
        WebElement addFieldLocalSSD = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_354']"));
        addFieldLocalSSD.click();
        WebElement changeFieldLocalSSD = waitForElementLocatedBy(driver, By.
                xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='2']"));
        changeFieldLocalSSD.click();
    }

    public void AddFieldDatacenter() {
        WebElement addFieldDatacenter = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_61']"));
        addFieldDatacenter.click();
        WebElement changeFieldDatacenter = waitForElementLocatedBy(driver, By.
                xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='europe-west3']"));
        changeFieldDatacenter.click();
    }

    public void AddFieldCommittedUsage() {
        WebElement addFieldCommittedUsage = waitForElementLocatedBy(driver, By.
                xpath("//md-select-value[@id='select_value_label_62']"));
        addFieldCommittedUsage.click();
        WebElement changeFieldCommittedUsage = waitForElementLocatedBy(driver, By.
                xpath("//div[@class='md-select-menu-container md-active md-clickable']//md-option[@value='1']"));
        changeFieldCommittedUsage.click();
    }

    public void ClickButtonAddToEstimate() {
        WebElement addFieldCommittedUsage = waitForElementLocatedBy(driver, By.
                xpath("//button[@aria-label='Add to Estimate' and @ng-click='listingCtrl.addComputeServer(ComputeEngineForm);']"));
        addFieldCommittedUsage.click();
    }

    public void CheckFieldVMClass() {
        String expectedVMClass = "VM class: regular";
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'VM class: regular')]")));
        String currentVMClass = driver.findElement(By.xpath("//div[contains(text(),'VM class: regular')]")).getText();
        Assert.assertEquals(currentVMClass,expectedVMClass);
    }

    public void CheckFieldInstanceType() {
        String expectedInstanceType = "Instance type: n1-standard-8";
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Instance type: n1-standard-8')]")));
        String currentInstanceType = driver.findElement(By.xpath("//div[contains(text(),'Instance type: n1-standard-8')]")).getText();
        Assert.assertEquals(currentInstanceType,expectedInstanceType);
    }

    public void CheckFieldRegion() {
        String expectedRegion = "Region: Frankfurt";
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Region: Frankfurt')]")));
        String currentRegion = driver.findElement(By.xpath("//div[contains(text(),'Region: Frankfurt')]")).getText();
        Assert.assertEquals(currentRegion,expectedRegion);
    }

    public void CheckFieldLocalSSD() {
        String expectedLocalSSD = "Total available local SSD space 2x375 GiB";
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Total available local SSD space 2x375 GiB')]")));
        String currentLocalSSD = driver.findElement(By.xpath("//div[contains(text(),'Total available local SSD space 2x375 GiB')]")).getText();
        Assert.assertEquals(currentLocalSSD,expectedLocalSSD);
    }

    public void CheckFieldCommitmentTerm() {
        String expectedCommitmentTerm = "Commitment term: 1 Year";
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Commitment term: 1 Year')]")));
        String currentCommitmentTerm = driver.findElement(By.xpath("//div[contains(text(),'Commitment term: 1 Year')]")).getText();
        Assert.assertEquals(currentCommitmentTerm,expectedCommitmentTerm);
    }

    public void CheckTotalCost() {
        String expectedTotalCost = "Estimated Component Cost: USD 1,082.77 per 1 month";
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//b[contains(text(),'Estimated Component Cost:') and contains( text(),'USD 1,082.77')  and contains( text(),'per 1 month')]")));
        String currentTotalCost = driver.findElement(By.xpath("//b[contains(text(),'Estimated Component Cost:') and contains( text(),'USD 1,082.77')  and contains( text(),'per 1 month')]")).getText();
        Assert.assertEquals(currentTotalCost,expectedTotalCost);
    }


    private static WebElement waitForElementLocatedBy(WebDriver driver, By by) {
        WebElement searchElement = new WebDriverWait(driver,10).
                until(ExpectedConditions.presenceOfElementLocated(by)); // отдельный метод для многократного использования
        return searchElement;
    }
}
