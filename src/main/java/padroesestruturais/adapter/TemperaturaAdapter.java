package padroesestruturais.adapter;

public class TemperaturaAdapter extends TemperaturaCelcius implements ITemperatura {

    private ITemperatura temperaturaKelvin;

    public TemperaturaAdapter(ITemperatura temperaturaKelvin) {
        this.temperaturaKelvin = temperaturaKelvin;
    }

    @Override
    public float getTemperatura() {
        return this.getCelcius() + 273.15f;
    }

    @Override
    public void setTemperatura(float temperaturaKelvin) {
        this.temperaturaKelvin.setTemperatura(temperaturaKelvin);
        this.setCelcius(temperaturaKelvin - 273.15f);
    }

    public float recuperarTemperatura() {
        float kelvin = this.getCelcius() + 273.15f;
        this.temperaturaKelvin.setTemperatura(kelvin);
        return this.temperaturaKelvin.getTemperatura();
    }

    public void salvarTemperatura() {
        this.setCelcius(this.temperaturaKelvin.getTemperatura() - 273.15f);
    }
}