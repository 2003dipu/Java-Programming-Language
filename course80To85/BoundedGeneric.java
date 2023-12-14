

// generic methods and generic classes -> bounded types


public class BoundedGeneric <T extends Number, V extends Number>{
    
    T x;
    V y;

    BoundedGeneric (T x, V y){
        this.x = x;
        this.y = y;
    }

    public V getValue(){
        return y;
    }
    
}
