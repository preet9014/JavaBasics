/**
 *
 */
package encapsulation;

/**
 * @author csingh Java program to demonstrate encapsulation
 */
public class SetEncapsulation {

    /**
     * Private variables declared and these can only be accessed through public methods of class
     */

    private String username;
    private String password;

    /**
     * Get method to read the value of private variables
     * @return username
     */

    public String getUsername() {
        return username;
    }

    /**
     * Set methods to write the value for private variables
     * @param username
     */

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
