/**
 * Created by dqi15bierzynski on 04.11.2016.
 *
 * @author Patryk Bierzynski
 */

public class DynamicStringList implements DynamicStringCollectionMethods {

    private DynamicStringListElement first;
    private int length;

    /**
     * Returns the list element, that is in current list at index parameter {@code index}.
     *
     * @param index The index the object is found at, that is to be returned
     *
     * @return Object that is in current list at {@code index}
     */
    private DynamicStringListElement getListElement(int index) {
        if (index == 0) {
            //first element
            return this.first;
        } else {
            //second element
            DynamicStringListElement element = this.first.getNext();
            for (int i = 0; i < index - 1; i++) {
                //third element and beyond
                element = element.getNext();
            }
            return element;
        }
    }

    /**
     * Appends the parameter {@code value} at the end of the current list.
     *
     * @param value The value that is to be appended to the current list
     */
    public void append(String value) {
        DynamicStringListElement element = new DynamicStringListElement(value);
        if (this.first == null) {
            this.first = element;
        } else {
            //previous element references new element
            getListElement(length - 1).setNext(element);
        }
        this.length++;
    }

    /**
     * Inserts the parameter {@code value} at the index {@code index} in current list. The list element with index
     * {@code index + 1} now links to this element via the {@code next} attribute and this element links to the element that
     * was at this index via the {@code next} attribute.
     *
     * @param value The value that is to be inserted in current list
     *
     * @param index The index at which {@code value} is to be inserted at in current list
     *
     * @throws DynamicStringCollectionException Thrown if {@code index} is out of bounds of current list
     */
    public void insert(String value, int index) {
        try {
            if (index > length || index < 0) {
                //test if index is valid
                throw new DynamicStringCollectionException();
            }
            DynamicStringListElement element = new DynamicStringListElement(value);
            if (index == 0) {
                element.setNext(this.first);
                this.first = element;
            } else {
                //new element references next element
                element.setNext(getListElement(index - 1).getNext());
                //previous element references new element
                getListElement(index - 1).setNext(element);
            }
            this.length++;

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Returns the {@code value} attribute of an element of current list that is specified by the
     * {@code index} parameter.
     *
     * @param index The index of the element of current list that is to be returned
     *
     * @return getListElement(index).getValue() The {@code value} attribute of element that is at the index
     * {@code index} in current list or {@code null}  if {@code index} is out of bounds
     *
     * @throws DynamicStringCollectionException Thrown if {@code index} is out of bounds of current list.
     */
    public String get(int index) {
        try {
            if (index > length - 1 || index < 0) {
                //test if index is valid
                throw new DynamicStringCollectionException();
            }
            return getListElement(index).getValue();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Removes the element whose index is specified by the {@code index} parameter by setting the {@code next} attribute
     * from the element with the index of {@code index - 1} to the element with the index of {@code index + 1}.
     *
     * @param index Index of to be removed element of current list
     *
     * @throws DynamicStringCollectionException Thrown if {@code index} is out of bounds of current list.
     */
    public void delete(int index) {
        try {
            if (index > length - 1 || index < 0) {
                //test if index is valid
                throw new DynamicStringCollectionException();
            }
            if (index == 0) {
                this.first = getListElement(1);
            } else {
                //previous element references next element; no reference to "deleted" element anymore thus deleted
                getListElement(index - 1).setNext(getListElement(index + 1));
            }
            this.length--;

        } catch (DynamicStringCollectionException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the number of elements in current list
     *
     * @return this.length The number of elements in current list
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
                System.out.println(i + ". " + getListElement(i).getValue());
            }
        }
    }
}
