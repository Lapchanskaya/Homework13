public class Main {
    public static void printSeparation(){
        System.out.println( "          **********          ");
    }
    public static void printSeparationPlus() {
        System.out.println("===========================================");
    }
    public static void printSeparationToString() {
        System.out.println("===== Печать метода toString из Класса Author =====");
    }
    public static void printSeparationEquals() {
        System.out.println("===== Печать метода equals из Класса Author =====");
    }
    public static void printSeparationToString2() {
        System.out.println("===== Печать метода toString из Класса Book =====");
    }
    public static void printSeparationEquals2() {
        System.out.println("===== Печать метода equals из Класса Book =====");
    }

        public static void main(String[] args) {

            Author tolkienJRR = new Author("John R. R." , "Tolkien");
            Author kingS = new Author("Stephen" , " King");
            Book theLordOfTheRings = new Book( 1954, "The lord of the rings" , tolkienJRR);
            Book theShining = new Book(1977, "The Shining", kingS);
            theLordOfTheRings.setYear(1955);
            theShining.setYear(1980);

            System.out.println(tolkienJRR.getFirstName()+ " " + tolkienJRR.getLastName());
            printSeparation();
            System.out.println(theLordOfTheRings.getName() + " , " + theLordOfTheRings.getYear() +   " , " + tolkienJRR.getFirstName() + " " + tolkienJRR.getLastName());
            printSeparationPlus();
            System.out.println(kingS.getFirstName()+ " " + kingS.getLastName());
            printSeparation();
            System.out.println(theShining.getName() + " , " + theShining.getYear() +   " , " + kingS.getFirstName() + " " + kingS.getLastName());


            // печать метода toSting

            printSeparationToString();

            System.out.println(tolkienJRR);
            System.out.println(kingS);

            // печать метода equals

            printSeparationEquals();

            System.out.println(tolkienJRR.equals(kingS));

            // печать метода toSting
            printSeparationToString2();

            System.out.println(theLordOfTheRings);
            System.out.println(theShining);

            // печать метода equals

            printSeparationEquals2();
            System.out.println(theLordOfTheRings.equals(theShining));
            System.out.println(theLordOfTheRings.equals(theLordOfTheRings));




    }
}