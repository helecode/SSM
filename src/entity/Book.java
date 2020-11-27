package entity;

import java.io.Serializable;
import java.util.Date;

//import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;
//@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class Book  implements Serializable{
	private int b_id;//图书id
	private String b_name;//书籍名称
	private int b_number;//存储数量
	private String b_author;//作者
	private String b_path;//图片路径
	private MultipartFile b_file;//文件
	private int b_sark;//柜号
	private int b_tier;//层数
	private int b_order;//序号
//	private Admin b_admin;//添加的管理员
//	private BookType b_class;//类别
	private String b_content;//书籍内容
	@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date b_time;//书籍入馆内容
	private String b_press;//出版社
	private String b_barcode;//条形码
	public int getB_id() {
		return b_id;
	}
	public void setB_id(int b_id) {
		this.b_id = b_id;
	}
	public String getB_name() {
		return b_name;
	}
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	public int getB_number() {
		return b_number;
	}
	public void setB_number(int b_number) {
		this.b_number = b_number;
	}
	public String getB_author() {
		return b_author;
	}
	public void setB_author(String b_author) {
		this.b_author = b_author;
	}
	public String getB_path() {
		return b_path;
		
	}
	public void setB_path(String b_path) {
		this.b_path = b_path;
	}
	public int getB_sark() {
		return b_sark;
	}
	public void setB_sark(int b_sark) {
		this.b_sark = b_sark;
	}
	public int getB_tier() {
		return b_tier;
	}
	public void setB_tier(int b_tier) {
		this.b_tier = b_tier;
	}
	public int getB_order() {
		return b_order;
	}
	public void setB_order(int b_order) {
		this.b_order = b_order;
	}

//	public Admin getB_admin() {
//		return b_admin;
//	}
//	public void setB_admin(Admin b_admin) {
//		this.b_admin = b_admin;
//	}
//	public BookType getB_class() {
//		return b_class;
//	}
//	public void setB_class(BookType b_class) {
//		this.b_class = b_class;
//	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public Date getB_time() {
		return b_time;
	}
	public void setB_time(Date b_time) {
		this.b_time = b_time;
	}
	public String getB_press() {
		return b_press;
	}
	public void setB_press(String b_press) {
		this.b_press = b_press;
	}
	public String getB_barcode() {
		return b_barcode;
	}
	public void setB_barcode(String b_barcode) {
		this.b_barcode = b_barcode;
	}
	
	public MultipartFile getB_file() {
		return b_file;
	}
	public void setB_file(MultipartFile b_file) {
		this.b_file = b_file;
	}
//	public Book(){}
//	public Book(int b_id, String b_name, int b_number, String b_author,
//			String b_path, MultipartFile b_file, int b_sark, int b_tier,
//			int b_order, Admin b_admin, BookType b_class, String b_content,
//			Date b_time, String b_press, String b_barcode) {
//		this.b_id = b_id;
//		this.b_name = b_name;
//		this.b_number = b_number;
//		this.b_author = b_author;
//		this.b_path = b_path;
//		this.b_file = b_file;
//		this.b_sark = b_sark;
//		this.b_tier = b_tier;
//		this.b_order = b_order;
//		this.b_admin = b_admin;
//		this.b_class = b_class;
//		this.b_content = b_content;
//		this.b_time = b_time;
//		this.b_press = b_press;
//		this.b_barcode = b_barcode;
//	}
//	@Override
//	public String toString() {
//		return "Book [b_id=" + b_id + ", b_name=" + b_name + ", b_number="
//				+ b_number + ", b_author=" + b_author + ", b_path=" + b_path
//				+ ", b_file=" + b_file + ", b_sark=" + b_sark + ", b_tier="
//				+ b_tier + ", b_order=" + b_order + ", b_admin=" + b_admin
//				+ ", b_class=" + b_class + ", b_content=" + b_content
//				+ ", b_time=" + b_time + ", b_press=" + b_press
//				+ ", b_barcode=" + b_barcode + "]";
//	}
	
}
