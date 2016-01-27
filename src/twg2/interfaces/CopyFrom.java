package twg2.interfaces;

/** Indicates that an object is copyable from another object
 * @param <T> the type of the object that is copyable
 * @author TeamworkGuy2
 * @since 2013-11-1
 */
public interface CopyFrom<T> {

	/** Copy an object into this object
	 * @param obj the object to copy into this object
	 */
	public void copyFrom(T obj);
}
