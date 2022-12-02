
package Business.WorkQueue;

/**
 *
 * @author mahes
 */
public class DoctorWorkRequest extends WorkRequest{
    private String testResult;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
}
