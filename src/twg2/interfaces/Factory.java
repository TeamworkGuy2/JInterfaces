package twg2.interfaces;

/** A factory for creating objects of a specific type.
 * Specific factory implementations can contain methods to setup the factory's
 * state.
 * @param <T> the type of object this factory creates
 * @author TeamworkGuy2
 * @since 2013-8-18
 */
public interface Factory<T> {

	/**
	 * @return the newly created (or cached) object
	 * @throws Exception if there is an error creating the object
	 */
	public T create() throws Exception;

}
