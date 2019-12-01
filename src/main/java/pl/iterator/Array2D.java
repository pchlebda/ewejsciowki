package pl.iterator;

public class Array2D {

    public ArrayIterator<Integer> getIterator(int[][] arr) {
        return new Inner2DArrayIterator(arr);
    }

    private static class Inner2DArrayIterator implements ArrayIterator<Integer> {

        private int i, j;
        private int[][] arr;

        Inner2DArrayIterator(int[][] arr) {
            this.arr = arr;
        }

        @Override
        public boolean hasNext() {
            return arr.length > i && arr[i].length > j;
        }

        @Override
        public Integer next() {
            if (!hasNext()) {
                throw new IllegalStateException("Iterator out of bounds");
            }

            int result = arr[i][j];
            ++j;

            if (arr[i].length <= j) {
                i++;
                j = 0;
            }

            if (arr.length > i && arr[i].length == 0) {
                ++i;
            }

            return result;
        }
    }
}
