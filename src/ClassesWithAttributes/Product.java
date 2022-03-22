package ClassesWithAttributes;

public class Product {
    //constructor ile değerleri Producta methoda tanıtır mainde tek tek vermek yerine bir işlemde tanıtırız.
    public  Product( int id,
            String Name,
            String description,
            double price,
            int stockAmount){
        this.Name=Name;
        this.id=id;
        this.description=description;
        this.price=price;
        this.stockAmount=stockAmount;
        System.out.println("Constructor block run");
    }
    //yukardaki tanımlanmış public product ile mainde yalnızca bu değerleri kullanmak durumunda kalırız.


    //attribute or field
   private int id;
   private String Name;
    private  String description;
    private  double price;
    private  int stockAmount;
    private  String code;
    //getter
    public  String getCode(){
        return code;
    }
    public int getId(){return id;}
    public String getName(){return Name;}
    public String getDescription(){return description;}
    public double getPrice(){return price;}
    public int getStockAmount(){return stockAmount;}
    //setter
    public void setCode(String code){
        this.code=code;
    }

    public void setId(int id) {this.id = id;}

    public void setDescription(String description) {this.description = description;}

    public void setName(String name) {this.Name = name;}

    public void setPrice(double price) {this.price = price;}

    public void setStockAmount(int stockAmount) {this.stockAmount = stockAmount;}
}
