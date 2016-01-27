package twg2.interfaces;

/** Indicates that an object is copyable
 * @param <T> the type of the object that is copyable
 * @author TeamworkGuy2
 * @since 2013-2-1
 */
public interface Copyable<T> {

	/** Create a copy of this object
	 * @return the copy of this object
	 */
	public T copy();
}
