package twg2.interfaces;

/** A factory that reuses objects and can return them again when
 * {@link Factory#create()} is called.
 * @param <T> the type of object managed in this resource pool
 * @param <C> the type of {@link ReusableResourceFactory} used to create
 * and {@link ReusableResourceFactory#recycle(Object) recycle} these objects.
 * @author TeamworkGuy2
 * @since 2013-9-27
 */
public interface ReusableResourcePool<T, C extends ReusableResourceFactory<T>> extends Factory<T> {

	/** 
	 * @param obj the object to return for reuse
	 */
	public void returnObject(T obj);


	/**
	 * @return the factory used by this resource pool
	 */
	public C getFactory();


	/**
	 * @return the number of objects supplied by this resource pool
	 * that have not been returned.
	 */
	public int getInUseCount();
}
