import org.junit.jupiter.api.Test;

public class IssueSearchSteps {

    WebSteps steps = new WebSteps();

    String repo = "qaquru_AllureReport";

    @Test
    void searchIssue() {
        steps.openMainPage();
        steps.searchRepo(repo);
        steps.searchIssue();
    }
}