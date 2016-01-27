package twg2.interfaces;

/** An interface for objects that contain valuable resources that can be
 * released
 * @author TeamworkGuy2
 * @since 2013-9-28
 */
public interface Destroyable {

	/** destroy, release any resources the module is holding
	 */
	public void destroy();


	/** check if this module is already destroyed or not
	 * @return true if this module is already destroyed, false otherwise
	 */
	public boolean isDestroyed();

}
