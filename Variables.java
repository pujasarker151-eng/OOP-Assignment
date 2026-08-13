   public class Variables{
   int instanceVar = 20; 

    public void show() {
        int localVar = 10; 
        System.out.println("Local: " + localVar);
        System.out.println("Instance: " + instanceVar);
    }

    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.show();
    }
}