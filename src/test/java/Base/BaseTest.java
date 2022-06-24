package Base;

import Pages.AlertsFrameWindowPage.*;
import Pages.BookStoreApplicationPage.*;
import Pages.ElementsPage.*;
import Pages.FormsPage.*;
import Pages.HomepagePage.*;
import Pages.InteractionsPage.*;
import Pages.WidgetsPage.*;
import io.github.bonigarcia.wdm.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.io.*;
import java.time.*;

public class BaseTest {

    public static WebDriver driver;
    public WebDriverWait wait;
    public ExcelReader excel;

    public AlertsPage alertsPage;
    public BrowserWindowsPage browserWindowsPage;
    public FramesPage framesPage;
    public ModalDialogsPage modalDialogsPage;
    public NestedFramesPage nestedFramesPage;
    public BookStorePage bookStorePage;
    public LoginPage loginPage;
    public ProfilePage profilePage;
    public BrokenLinksImagesPage brokenLinksImagesPage;
    public ButtonsPage buttonsPage;
    public CheckBoxPage checkBoxPage;
    public DynamicPropertiesPage dynamicPropertiesPage;
    public LinkesPage linkesPage;
    public RadioButtonPage radioButtonPage;
    public TextBoxPage textBoxPage;
    public UploadAndDownloadPage uploadAndDownloadPage;
    public WebTablesPage webTablesPage;
    public PracticeFormPage practiceFormPage;
    public HomepagePage homepagePage;
    public DragabblePage dragabblePage;
    public ResizablePage resizablePage;
    public SelectablePage selectablePage;
    public SortablePage sortablePage;
    public AccordianPage accordianPage;
    public AutoCompleatePage autoCompleatePage;
    public DatePickerPage datePickerPage;
    public MenuPage menuPage;
    public ProgressBarPage progressBarPage;
    public SelectedMenuPage selectedMenuPage;
    public SliderPage sliderPage;
    public TabsPage tabsPage;
    public ToolsTipsPage toolsTipsPage;
    public SidebarPage sidebarPage;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        excel = new ExcelReader("C:\\Users\\BOKI\\Desktop\\DemoQaFile.xlsx");

        homepagePage = new HomepagePage();
        sidebarPage = new SidebarPage(driver,wait);
        alertsPage = new AlertsPage(driver, wait);
        browserWindowsPage = new BrowserWindowsPage(driver, wait);
        framesPage = new FramesPage(driver, wait);
        modalDialogsPage = new ModalDialogsPage(driver, wait);
        nestedFramesPage = new NestedFramesPage(driver, wait);
        bookStorePage = new BookStorePage(driver, wait);
        loginPage = new LoginPage(driver, wait);
        profilePage = new ProfilePage(driver, wait);
        brokenLinksImagesPage = new BrokenLinksImagesPage(driver, wait);
        buttonsPage = new ButtonsPage(driver, wait);
        checkBoxPage = new CheckBoxPage(driver, wait);
        dynamicPropertiesPage = new DynamicPropertiesPage(driver, wait);
        linkesPage = new LinkesPage(driver, wait);
        radioButtonPage = new RadioButtonPage(driver, wait);
        textBoxPage = new TextBoxPage(driver, wait);
        uploadAndDownloadPage = new UploadAndDownloadPage(driver, wait);
        webTablesPage = new WebTablesPage(driver, wait);
        practiceFormPage = new PracticeFormPage(driver, wait);
        dragabblePage = new DragabblePage(driver, wait);
        resizablePage = new ResizablePage(driver, wait);
        sortablePage = new SortablePage(driver, wait);
        accordianPage = new AccordianPage(driver, wait);
        autoCompleatePage = new AutoCompleatePage(driver, wait);
        datePickerPage = new DatePickerPage(driver, wait);
        menuPage = new MenuPage(driver, wait);
        progressBarPage = new ProgressBarPage(driver, wait);
        selectablePage = new SelectablePage(driver, wait);
        selectedMenuPage = new SelectedMenuPage(driver, wait);
        sliderPage = new SliderPage(driver, wait);
        tabsPage = new TabsPage(driver, wait);
        toolsTipsPage = new ToolsTipsPage(driver, wait);
    }

   /* @AfterClass
    public void tearDowm(){
        driver.close();
        driver.quit();
    }
    */
    //methods for tests

    public void visibilityWait(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void scrollIntoView(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }



}
