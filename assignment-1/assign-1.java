class Main {
    public static void main(String[] args) {
        String words = "c++,java,c,pascal,php,JavaScropt,ActionScript";
        String[] seperated = words.split(",");
        for ( String i : seperated)
            System.out.println(i);
    }
}