public class Main {
    public static void main(String[] args) {
        //String[] strings = new String[]{};
        Strings strings1 = new Strings();
        strings1.addElement("Potato");
        strings1.addElement("Sky");
        strings1.addElement("A");
        strings1.addElement("Ambulance");
        strings1.addElement("Time");
        strings1.showArray();
        strings1.showSortedArray();
        System.out.println(strings1.maxElement());
        System.out.println(strings1.averageLength());
    }
}