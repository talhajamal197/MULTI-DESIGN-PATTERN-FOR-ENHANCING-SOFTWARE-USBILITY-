// --------------------------------------------------------
// Code generated by Papyrus Java
// --------------------------------------------------------

package ddr_project;



/************************************************************/
/**
 * 
 */
public abstract class DECORATOR implements SHAPE_FACTORY{
				/**
				 * 
				 */
	public SHAPE_FACTORY decorated_shape;
	/**
	 * 
	 */
	public DECORATOR(SHAPE_FACTORY shape_to_decorate) {
		this.decorated_shape = shape_to_decorate;
	}
	public void DRAW() {
		decorated_shape.DRAW();
	}
};
