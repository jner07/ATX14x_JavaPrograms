package ex_17_Encapsulation;

public class encap_RealExample {
    static void main() {
        hdfcBank jayesh = new hdfcBank("jayesh", 100);
        long bal = jayesh.getBal(); //this cannot be acheived directly by calling bal as its private
        System.out.println(bal);

    }

}
 class hdfcBank {
    private String name;
    private long bal;

    public hdfcBank (String name, long bal ) {
        this.name = name;
        this.bal = bal;
    }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public long getBal() {
         return bal;
     }

     public void setBal(long bal, boolean isCashier) {
        if (isCashier){
            this.bal = bal;
        }else
            System.out.println("not allowed");
         this.bal = bal;
     }
 }
