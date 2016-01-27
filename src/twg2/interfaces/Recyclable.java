package twg2.interfaces;

/**
 * @param <T> the type of object that can be recycled
 * @author TeamworkGuy2
 * @since 2016-1-27
 */
public interface Recyclable<T> extends Copyable<T> {


	public boolean canRecycle();


	public default T recycle() {
		throw new UnsupportedOperationException("recycling not supported");
	}


	public default T copyOrReuse() {
		T obj = null;
		if(this.canRecycle()) {
			obj = this.recycle();
		}
		else {
			obj = this.copy();
		}
		return obj;
	}

}
