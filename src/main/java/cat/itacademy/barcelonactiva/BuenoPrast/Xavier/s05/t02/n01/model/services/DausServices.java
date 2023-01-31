package cat.itacademy.barcelonactiva.BuenoPrast.Xavier.s05.t02.n01.model.services;

import java.util.ArrayList;

public interface DausServices<T,M,S> {
	
	public T saveItem (M m);
	
	public boolean deleteItem(T t);
	
	public M getOneItem(int ident);
	
	public ArrayList<M> getAllItems();
	
	public boolean findItemByAttrib(S s);
	
	

}
