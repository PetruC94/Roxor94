
    class Book {
        String title;
        int yearOfPublishing;
        String[] authors;

        public Book(String x, int y, String[] z) {
            title = x;
            yearOfPublishing = y;
            authors = java.util.Arrays.copyOf(z, z.length);
        }
    }


