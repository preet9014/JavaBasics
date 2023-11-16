/**
 *
 */
package encapsulation;

/**
 * @author csingh
 *
 */
public class AchievedEncapsulation {

    /**
     * @param args
     */
    public static void main(String[] args) {
        SetEncapsulation Obj = new SetEncapsulation();

        /**
         * Writing values to private vaiables e.g. username and password
         */
        Obj.setUsername("Charanjit Singh");
        Obj.setPassword("Tough");

        /**
         * Read values of private variables e.g. username and password
         */

        System.out.println(Obj.getUsername());
        System.out.println(Obj.getPassword());

        /**
         * Direct access of username and password is not possible due to encapsulation
         */

    }

}
