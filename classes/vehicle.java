package timoteoclass;

public abstract class vehicle {
   public abstract void locomotion();
    public abstract void transport();
    public abstract void energyFontConsumption();
    public abstract void locomotionSpeed();

    /*rotulo colocado antes do metodo para sobescrever um metodo ja existente*/
    /*deixando claro para o java que vai ser utilizado de outra forma*/
    public abstract void energyFontConsumption(String fuel); /*polimorfismo */
}
