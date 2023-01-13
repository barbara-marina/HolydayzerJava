public class Holyday {
    private String date;
    private String name;

    public String getHolyday(String date) {
        if ( this.date.equals(date) ) {
            return this.name;
            
        }
        return "Não existe feriado com a data " + date;
    }

    public Holyday(String name, String date) {
        this.date = date;
        this.name = name;
    }
}
