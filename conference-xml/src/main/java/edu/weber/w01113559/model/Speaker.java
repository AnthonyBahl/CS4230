package edu.weber.w01113559.model;

public class Speaker {

    private String firstName;
    private String lastName;

    /**
     * Gets the speaker's first name.
     * @return {@link String} Speaker's first name.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the speaker.
     * @param firstName {@link String} First name of the speaker.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the speaker's last name.
     * @return {@link String} Speaker's last name.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the speaker.
     * @param lastName {@link String} Last name of the speaker.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
