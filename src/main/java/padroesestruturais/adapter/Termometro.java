package padroesestruturais.adapter;

public class Termometro {

    private ITemperatura temperatura;
    private TemperaturaAdapter adapter;

    public Termometro() {
        this.temperatura = new TemperaturaKelvin();
        this.adapter = new TemperaturaAdapter(this.temperatura);
    }

    public void setTemperatura(float temperaturaKelvin) {
        this.temperatura.setTemperatura(temperaturaKelvin);
        this.adapter.salvarTemperatura();
    }

    public float getTemperatura() {
        return this.adapter.recuperarTemperatura();
    }

    public float getCelcius() {
        return this.adapter.getCelcius();
    }
}