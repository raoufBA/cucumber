package steps;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class DriverManager {

    private static WebDriver driver;

    // Méthode pour obtenir l'instance unique de WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            ChromeOptions options = new ChromeOptions();
            driver = new ChromeDriver(options.addArguments("--disable-search-engine-choice-screen"));

            // Récupérer les dimensions de l'écran
            java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();

            // Définir la taille de la fenêtre du navigateur
            Dimension windowSize = new Dimension(screenSize.width / 2, screenSize.height);
            driver.manage().window().setSize(windowSize);

            // Placer la fenêtre du navigateur sur la droite de l'écran
            Point windowPosition = new Point(screenSize.width / 2, 0);
            driver.manage().window().setPosition(windowPosition);


            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//            driver.manage().window().maximize();
        }

        return driver;
    }

    // Méthode pour fermer le navigateur
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
