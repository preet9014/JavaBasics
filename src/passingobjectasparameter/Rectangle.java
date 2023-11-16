/**
 *
 */
package passingobjectasparameter;

/**
 * @author csingh
 *
 */
public class Rectangle {
    int width;
    int height;



    /**
     * Constructor of the class
     * @param width
     * @param height
     */
    Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Calcilates the area of the Rectangle
     * @param obj
     */

    public void area(Rectangle obj) {
        int areaofRectangle = obj.width * obj.height;
        System.out.println(areaofRectangle);
    }



}
