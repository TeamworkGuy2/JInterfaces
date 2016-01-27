package twg2.interfaces;

/** A factory that recycle objects and return them again.
 * @author TeamworkGuy2
 * @since 2013-9-27
 */
public interface ReusableResourceFactory<T> extends Factory<T> {

	/**
	 * @param obj an object to recycle
	 * @return the same object reset for reuse or a new object
	 * with the same resources.
	 */
	public T recycle(T obj);


	/**
	 * @return true if the object would be a valid object for
	 * {@link Factory#create()} to return based on the factory's current
	 * state variables, false if it is not valid
	 */
	public boolean isValid(T obj);


	/** Call this method before reusing a recycled object
	 * @param obj the object to setup for use
	 */
	public void setup(T obj);

}
