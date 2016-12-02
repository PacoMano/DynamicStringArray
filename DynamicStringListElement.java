/**
 * Created by dqi15bierzynski on 04.11.2016.
 *
 * @author Patryk Bierzynski
 */

public class DynamicStringListElement {

    private DynamicStringListElement next;
    private String value;


    /**
     * This is the constructor method. It sets the {@code value} attribute to the {@code value} parameter.
     *
     * @param value The value this object is to be set to
     */
    public DynamicStringListElement(String value) {
        this.value = value;
    }

    /**
     * Sets the {@code next} attribute to the {@code next} parameter.
     *
     * @param next The object, that the {@code next} attribute is to be set to
     */
    public void setNext(DynamicStringListElement next) {
        this.next = next;
    }

    /**
     * Returns the {@code next} attribute.
     *
     * @return next The object that's stored in the {@code next} attribute
     */
    public DynamicStringListElement getNext() {
        return next;
    }

    /**
     * Returns the {@code value} attribute.
     *
     * @return value The String that's stored in the {@code value} attribute
     */
    public String getValue() {
        return value;
    }
}
