/**
 * Created by dqi15bierzynski on 21.10.2016.
 *
 * @author Patryk Bierzynski
 */

public class DynamicStringArray implements DynamicStringCollectionMethods{

    private String[] array;
    private int length;

    /**
     * This is the constructor method. It declares the {@code array} and {@code length} attributes.
     */
    public DynamicStringArray() {
        this.array = new String[2];
        this.length = 0; //added comment
    }

    /**
     * Doubles the size of current {@code DynamicStringArray]. All elements stay at their respective
     * indexes.
     */
    private void doubleArraySize() {
        //temporary assistArray has double the elements of this.array
        String[] assistArray = new String[this.length * 2];
        // copy content of this.array to assistArray
        System.arraycopy(this.array, 0, assistArray, 0, this.length);
        this.array = assistArray;
    }

    /**
     * Halves the size of current {@code DynamicStringArray]. All elements stay at their respective indexes.
     */
    private void bisectArraySize() {
        //temporary assistArray has half the elements of this.array
        String[] assistArray = new String[this.length];
        // copy content of this.array to assistArray
        System.arraycopy(this.array, 0, assistArray, 0, this.length);
        this.array = assistArray;
    }

    /**
     * Appends the parameter {@code value} at the end of the current {@code DynamicStringArray}.
     *
     * @param value The value that is to be appended to the current {@code DynamicStringArray}
     */
    public void append(String value) {
        if (this.array.length == this.length) {
            //double number of elements if necessary
            this.doubleArraySize();
        }
        array[this.length] = value;
        this.length++;
    }

    /**
     * Inserts the parameter {@code value} at the index {@code index} in current list. The elements at the index where
     * {@code value} is supposed to go and thereafter (index and the following elements) are put at one index higher
     * than they were before. If {@code value} is set to be put after an empty ({@code null}) element, {@code value}
     * is automatically put at the first index that does not follow an empty element.
     *
     * @param value The value that is to be inserted in current list
     *
     * @param index The index at which {@code value} is to be inserted at in current list
     *
     * @throws DynamicStringCollectionException Thrown if {@code index} is out of bounds of current list.
     */
    public void insert(String value, int index) {
        try {
            if (index > this.length || index < 0) {
                //test if index is valid
                throw new DynamicStringCollectionException();
            }
            /*boolean flag = true;
            while (flag) {
                if (index == 0) {
                    //test if element with index - 1 is null; if the case decrement index so no null in the middle of array
                    flag = false;
                } else if (this.array[index - 1]  == null) {
                    index--;
                } else {
                    flag = false;
                }
            }*/
            if (this.array.length == this.length) {
                //double number of elements if necessary
                this.doubleArraySize();
            }
            // copy content of this.array to assistArray; starting at end
            System.arraycopy(this.array, index, this.array, index + 1, this.length - index);
            this.array[index] = value;
            this.length++;

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the {@code value} attribute of an element of current list that is specified by the
     * {@code index} parameter.
     *
     * @param index The index of the element of current {@code DynamicStringArray} that is to be returned
     *
     * @return The {@code value} attribute of element that is at the index {@code index} in current
     * list or {@code null}  if {@code index} is out of bounds
     *
     * @throws DynamicStringCollectionException Thrown if {@code index} is out of bounds of current list.
     */
    public String get(int index) {
        try {
            if (index >= this.array.length || index < 0) {
                //test if index is valid
                throw new DynamicStringCollectionException();
            }
            return array[index];

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Sets element of current {@code DynamicStringArray} that is specified by the {@code index} paramter
     * to null. If this element is already null, the current call will be skipped.
     *
     * @param index Index of to be deleted element of current list
     *
     * @throws DynamicStringCollectionException Thrown if {@code index} is out of bounds of current list.
     */
    public void delete(int index) {
        try {
            if (index >= this.length || index < 0) {
                //test if index is valid
                throw new DynamicStringCollectionException();
            }
            if (this.array[index] != null) {
                // if the index that is to be deleted isn't null and thus deletable
                // copy content of this.array to assistArray
                System.arraycopy(this.array, index + 1, this.array, index, this.length - 1 - index);
                this.array[this.length - 1] = null;
                this.length--;
                if (this.array.length <= this.length * 2) {
                    //half number of elements if possible
                    this.bisectArraySize();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the number of elements in current list (that are not {@code null}).
     *
     * @return The number of elements in current list
     */
    public int getLength() {
        return this.length;
    }

    /**
     * Outputs content of current list to console.
     */
    public void outputList() {
        if (this.getLength() == 0) {
            System.out.println("   list empty");
        } else {
            for (int i = 0; i < this.getLength(); i++) {
                System.out.println(i + ". " + this.get(i));
            }
        }
    }
}
