
public class Proz {

    void brandlist(int n, Car [] cars, String mark) {
        for (int i=0;i<n;i++) {
            if (cars[i].brand.equals(mark)){                               //////////////
                printOb(i, cars);
            }
        }
    }

    void yoModel(int n, Car [] cars, String model, int yearsExp, int currenYear) {
        for (int i = 0; i < n; i++) {
            if (cars[i].model.equals(model) & (currenYear - cars[i].year) >= yearsExp) {                               //////////////
                printOb(i, cars);
            }
        }
    }

    void priceYears (int n, Car [] cars, int yearmanfct, int startprice){
        for (int i = 0; i < n; i++) {
            if (cars[i].year==yearmanfct & cars[i].price>startprice)
                printOb(i, cars);
        }
    }

    void printOb (int i, Car [] cars){
        System.out.println("ID: "+cars[i].idn+"  Reg. number: "+cars[i].regNum+"  Brand: "+cars[i].brand+"  Model: "+cars[i].model+"  Year: "+cars[i].year+"  Color: "+cars[i].color+"  Price: "+cars[i].price);
    }


}
