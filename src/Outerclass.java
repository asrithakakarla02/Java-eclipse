public class Outerclass {
    
    static class StaticNested {
        void show() {
            System.out.println("Inside static nested class");
        }
    }

    public static void main(String[] args) {
    	
        Outerclass.StaticNested obj = new Outerclass.StaticNested();
        obj.show();
    }
}
