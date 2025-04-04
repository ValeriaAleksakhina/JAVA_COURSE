public class MusicData {

    public enum StringCount {

        GUITAR_STRING(6),
        PIANO_STRING(220);

        private final int count;

        StringCount(int count) {
            this.count = count;
        }

        public int getCount() {
            return count;
        }
    }

}
