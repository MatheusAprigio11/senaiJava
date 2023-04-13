package timoteoclass;

public class car extends vehicle{
    String model = "";
    String brand = "";
    int ano = 0;
    int fuel = 0;
    double maxSpeed = 0;
    int amountSeats = 0;

    @Override
    public void energyFontConsumption() {

    }

    @Override
    public void locomotion() {

    }

    @Override
    public void transport() {

    }

    @Override
    public void locomotionSpeed() {

    }

    @Override /*rotulo colocado antes do metodo para sobescrever um metodo ja existente*/
    /*deixando claro para o java que vai ser utilizado de outra forma*/
    public void energyFontConsumption(String qttfuel){
        System.out.println("Este carro consome "+qttfuel+"and have in the tank "+this.fuel);
    }
}
