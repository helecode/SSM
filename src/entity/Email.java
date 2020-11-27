package entity;

import java.io.Serializable;
import java.util.Set;

import org.apache.ibatis.type.Alias;
public class Email implements Serializable{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Email() {
		super();
	}
	@Override
	public String toString() {
		return "S4Email [id=" + id + ", name=" + name + "]";
	}
	

	
}
