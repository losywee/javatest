import java.math.BigDecimal;
class Bigdecimal {

public static void main(String [] argv){

double d = 0.3;
System.out.println(d);

BigDecimal db = new BigDecimal(d);
System.out.println(db); //output a large float

db = new BigDecimal("0.3");
System.out.println(db);

db = new BigDecimal(BigInteger.ONE);
db.divide(new BigDecimal(3.0));
System.out.println(db); // Should be 1/3
}

}
