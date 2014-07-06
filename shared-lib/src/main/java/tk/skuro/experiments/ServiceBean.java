package tk.skuro.experiments;

/**
 * Shared service interface that implements a stateful bean. Used to verify that the same singleton is shared across
 * webapps.
 */
public interface ServiceBean {

    static String STATE_INITIAL = "OK";

    /**
     * Returns the internal state as a String. Initially, the state is the same as STATE_INITIAL
     *
     * @return The String representation of the internal state
     */
    String serve();

    /**
     * Sets the internal state to the provided value
     *
     * @param value The value to set as the internal state of the service
     */
    void setInternal(String value);

}
