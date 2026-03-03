package q3;
class x {
    int i;
    int j;
    x(int i, int j){
        this.i=i;
        this.j=j;
    }
    final int Sum() {
        return i+j;
    }
}
class y extends x{
    y(int i,int j){
        super(i,j);
    }
    int product() {
        return i*j ;
    }
}
class z extends y{
    z(int i, int j){
        super(i,j);
    }
    int Differ() {
        return i-j ;
    }
}        
public class multilevel {
     public static void main(String [] args){
     z Z = new z(10,5);
     System.out.println("Add: "+Z.Sum());
     System.out.println("Product: "+Z.product());
     System.out.println("Subtract: "+Z.Differ());
     }
}