package model;

public class TestData {

    private String correctIds;
    private String incorrectIds;

    public TestData(String correctIds, String incorrectIds) {
        this.correctIds = correctIds;
        this.incorrectIds = incorrectIds;
    }

    public TestData() {
    }

    public void setCorrectIds(String correctIds) {
        this.correctIds = correctIds;
    }

    public void setIncorrectIds(String incorrectIds) {
        this.incorrectIds = incorrectIds;
    }

    public String getCorrectIds() {
        return correctIds;
    }

    public String getIncorrectIds() {
        return incorrectIds;
    }

}
