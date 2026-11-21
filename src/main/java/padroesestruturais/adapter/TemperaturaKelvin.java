package padroesestruturais.adapter;

public class TemperaturaKelvin implements ITemperatura {

    private float temperatura;

    @Override
    public float getTemperatura() {
        return this.temperatura;
    }

    @Override
    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
}
