public class Test {
    public static void main(String[] args) {
        CCCD ngVanA = new CCCD("Nguyen Van A", 2001, "Nam", "HCM");
        CCCD ngThiB = new CCCD("Nguyen Thi B", 2002, "Nu", "HN");
        ngVanA.print();
        ngThiB.print();

        ngVanA.setName("Binh Le");
        ngVanA.print();



    }   
}
