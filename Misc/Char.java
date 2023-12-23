class Char{
    public static void main(String[] args) {
        int n = 15; // Number of sequences to generate
        
        for (int i = 0; i < n; i++) {
            char firstChar = (char)('A'+i); // Calculate the first character
            int lastChar = 1+i;

            
            // Print the sequence
            System.out.println("" + firstChar + lastChar);
        }
    }
}
