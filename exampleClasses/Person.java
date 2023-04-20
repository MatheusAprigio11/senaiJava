package timoteoclass;

public class Person extends Pacient{
    String firstName= "Name";
    int age = 25;
    private String document = "44933006806";
    private String healthy = "Sick";

    public String getHealthy() {
        return healthy;
    }

    public void setHealthy(String healthy) {
        this.healthy = healthy;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    @Override
    public void healthy() {

    }

    @Override
    public void gender() {

    }
    @Override
    public void name() {

    }
    @Override
    public void age(){

    }
    @Override
    public void document(){

    }
}
