public class Holyday {
    private String date;
    private String name;

    public String getHolyday(String date) {
        System.out.println(date + " - " + this.date);
        if ( this.date.equals(date) ) {
            return "Feriado: " + this.name;
            
        }
        return "Não existe feriado com a data " + date;
    }

    public String getDate() {
        return this.date;
    }

    public String getName() {
        return this.name;
    }

    public Holyday(String name, String date) {
        this.date = date;
        this.name = name;
    }
}
