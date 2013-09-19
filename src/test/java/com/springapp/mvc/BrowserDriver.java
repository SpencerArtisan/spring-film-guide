package com.springapp.mvc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class BrowserDriver {
    private static WebDriver mDriver;

    public synchronized static WebDriver driver() {
        if (mDriver == null) {
            try {
//                mDriver = new FirefoxDriver();
                mDriver = new HtmlUnitDriver();
            } finally {
                Runtime.getRuntime().addShutdownHook(
                        new Thread(new BrowserCleanup()));
            }
        }
        return mDriver;
    }

    public static boolean pageContains(String text) {
        return driver().getPageSource().contains(text);
    }

    public static String getValueById(String id) {
        return driver().findElement(By.id(id)).getText();
    }

    public static void setValueByName(String name, String text) {
        driver().findElement(By.name(name)).sendKeys(text);
    }

    public static void click(String buttonLabel) {
        driver().findElement(By.linkText(buttonLabel)).click();
    }

    private static class BrowserCleanup implements Runnable {
        public void run() {
            System.out.println("Closing the browser");
            close();
        }
    }

    public static void close() {
        try {
            driver().quit();
            mDriver = null;
            System.out.println("closing the browser");
        } catch (UnreachableBrowserException e) {
            System.out.println("cannot close browser: unreachable browser");
        }
    }

    public static void loadPage(String url) {
        System.out.println("Directing browser to:" + url);
        driver().get(url);
    }
}
