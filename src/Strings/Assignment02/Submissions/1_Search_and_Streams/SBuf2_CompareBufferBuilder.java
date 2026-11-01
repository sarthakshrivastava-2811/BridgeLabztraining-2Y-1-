public class SBuf2_CompareBufferBuilder {

    static final int COUNT = 1000000;
    static final String WORD = "hello";

    public static void main(String[] args) {
        long start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < COUNT; i++) buffer.append(WORD);
        long bufferTime = System.nanoTime() - start;

        start = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < COUNT; i++) builder.append(WORD);
        long builderTime = System.nanoTime() - start;

        System.out.println("StringBuffer: " + bufferTime + " ns");
        System.out.println("StringBuilder: " + builderTime + " ns");
    }
}
