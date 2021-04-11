package ArrayElement;


public class SwapElements <A> {

    private final A[] array;

    public SwapElements(A[] array) {
        this.array = array;
    }

    public A[] swap(int firstIndex, int secondIndex) {
        A temporary = array[firstIndex];
        this.array[firstIndex] = this.array[secondIndex];
        this.array[secondIndex] = temporary;
        return this.array;
    }

}
