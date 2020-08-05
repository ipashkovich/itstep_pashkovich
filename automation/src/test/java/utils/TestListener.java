package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import servise.ScreenShotServise;

public class TestListener implements ITestListener {
    static Logger log = LogManager.getRootLogger();
    private static int testCount;

    @Override
    public void onTestStart(ITestResult result) {
        log.info("Running test #"+ ++testCount + ":"+ result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        log.info(result.getMethod().getTestClass().getName());
        log.info("test: " + result.getName() +" IS SUCCESS");
        log.info("Execution time: "+ (result.getEndMillis()-result.getStartMillis()) / 1000+ " seconds");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ScreenShotServise.saveScreenshot();
        log.info(result.getMethod().getTestClass().getName());
        log.info("test: " + result.getName() + " TEST FAILED");
        log.info("Execution time: "+ (result.getEndMillis()-result.getStartMillis()) / 1000+ " seconds");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        log.info("test: " + result.getName() + " SKIPP");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext result) {
        log.info("test: " + result.getName() + " START");
    }

    @Override
    public void onFinish(ITestContext result) {
        log.info("test: " + result.getName() + " FINISH");
    }
}
