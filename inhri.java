class heri {
    public int m2;
    public int pcc;

    static class hr extends heri {
    }

    public static class inhri {
        public static void main(String[] args) {
            hr s = new hr();
            s.m2 = 45;
            s.pcc = 34;

        }
    }
}
